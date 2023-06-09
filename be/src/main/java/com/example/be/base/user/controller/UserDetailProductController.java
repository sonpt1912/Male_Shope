package com.example.be.base.user.controller;

import com.example.be.base.user.model.request.UserDetailProductRequest;
import com.example.be.base.user.model.response.UserBrandResponse;
import com.example.be.base.user.model.response.UserDetailProductResponse;
import com.example.be.base.user.service.*;
import com.example.be.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/detail-product")
@CrossOrigin(origins = {"*"})
public class UserDetailProductController {

    @Autowired
    private UserDetailProductService detailProductService;


    @GetMapping("/get-by-product/{idProduct}")
    public UserDetailProductResponse getOneById(@PathVariable("idProduct") long id) {
        return detailProductService.getDetailProductByIdProduct(id);
    }


}
