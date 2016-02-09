package com.codeaholicguy.demo.service;

import com.codeaholicguy.demo.domain.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by nguyennhathoang on 2/9/16.
 */
@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List getProducts() {
        return repository.findAll();
    }
}
