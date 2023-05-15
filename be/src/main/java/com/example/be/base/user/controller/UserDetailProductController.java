package com.example.be.base.user.controller;

import com.example.be.base.user.model.response.UserDetailProductResponse;
import com.example.be.base.user.service.UserDetailProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/detail-product")
@CrossOrigin(origins = {"*"})
public class UserDetailProductController {

    @Autowired
    private UserDetailProductService service;

    @GetMapping("/get-by-product/{idProduct}")
    public UserDetailProductResponse getOneById(@PathVariable("idProduct") long id) {
        return service.getDetailProductByIdProduct(id);
    }

}