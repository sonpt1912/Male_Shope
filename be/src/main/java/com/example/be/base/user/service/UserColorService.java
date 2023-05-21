package com.example.be.base.user.service;

import com.example.be.base.user.model.response.UserColorResponse;
import com.example.be.base.user.repository.UserColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserColorService {

    @Autowired
    private UserColorRepository response;

    public List<UserColorResponse> getAllColor() {
        return response.getAllColor();
    }

    public List<UserColorResponse> getColorByProduct(long idProduct) {
        return response.getColorByIdProduct(idProduct);
    }


}
