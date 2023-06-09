package com.example.be.base.user.service;

import com.example.be.base.user.model.response.UserCategoryResponse;
import com.example.be.base.user.repository.UserCategoryRepository;
import com.example.be.entity.Brand;
import com.example.be.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserCategoryService {

    @Autowired
    private UserCategoryRepository response;

    public List<UserCategoryResponse> getAllCategory() {
        return response.getAllCategory();
    }

    public UserCategoryResponse getCategoryByProduct(long idProduct) {
        return response.getCategoryByIdProduct(idProduct);
    }

    public Category getCategoryById(long id) {
        return response.findCategoryById(id);
    }


}
