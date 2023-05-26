package com.example.be.base.admin.service;

import com.example.be.base.admin.repository.AdminBrandRepositoy;
import com.example.be.base.admin.repository.AdminColorRepositoy;
import com.example.be.entity.Brand;
import com.example.be.entity.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminColorService {

    @Autowired
    private AdminColorRepositoy repositoy;

    public List<Color> getAll() {
        return repositoy.findAll();
    }


}
