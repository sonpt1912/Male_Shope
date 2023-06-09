var myApp = angular.module("myModule", ["ngRoute"]);

myApp.controller("headerController", function ($scope, $rootScope, $http) {
  // favorite
  $rootScope.listFavorites = [];
  $http
    .get(favoriteAPI + "/get-all-by-customer/" + 1)
    .then(function (response) {
      $rootScope.listFavorites = response.data;
      $rootScope.favoriteCount = $rootScope.listFavorites.length;
    });

  $scope.deleteFavorite = function (id) {
    $http
      .delete(favoriteAPI + "/delete-favorite/" + 1 + "/" + id)
      .then(function (response) {
        $scope.init();
      }),
      function (error) {
        console.log(error);
      };

    $scope.init = function () {
      $http
        .get(favoriteAPI + "/get-all-by-customer/" + 1)
        .then(function (response) {
          $rootScope.listFavorites = response.data;
        });
    };
  };

  // cart
  $scope.IdCart = [];
  $http.get(cartAPI + "/get-cart-by-customer/" + 1).then(function (response) {
    $scope.IdCart = response.data;
  });
});

myApp.config(function ($routeProvider, $locationProvider) {
  $locationProvider.hashPrefix("");
  $routeProvider
    .when("/home", {
      templateUrl: "./page/home.html",
      controller: productController,
    })
    .when("/about-us", {
      templateUrl: "./page/about-us.html",
    })
    .when("/blog", {
      templateUrl: "./page/blog.html",
    })
    .when("/shop", {
      templateUrl: "./page/shop.html",
      controller: shopController,
    })
    .when("/cart/:id", {
      templateUrl: "./page/cart.html",
      controller: cartController,
    })
    .when("/checkout/:id", {
      templateUrl: "./page/checkout-user.html",
      controller: checkoutUserController,
    })
    .when("/checkout-guest", {
      templateUrl: "./page/checkout-guest.html",
      controller: checkoutGuestController,
    })
    .when("/detail-product/:id", {
      templateUrl: "./page/detail-product.html",
      controller: detailProductController,
    })
    .when("/login", {
      templateUrl: "./page/login.html",
    })
    .when("/forgot-password", {
      templateUrl: "./page/forgot-password.html",
    })
    .when("/register", {
      templateUrl: "./page/register.html",
      controller: registerController,
    })
    .when("/detail-bill/:id", {
      templateUrl: "./page/detail-bill.html",
      controller: detailBillController,
    })
    // customer
    .when("/customer-account", {
      templateUrl: "./page/customer-account.html",
      controller: customerController,
    })
    .when("/customer-cart/:id", {
      templateUrl: "./page/customer-cart.html",
      controller: cartController,
    })
    .when("/customer-order", {
      templateUrl: "./page/customer-order-history.html",
      controller: orderHistory,
    })
    .otherwise({
      redirectTo: "/customer-account",
    });
});
