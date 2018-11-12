package com.company.as.service;


import com.company.as.entity.Product;

public interface ProductService {
    String NAME = "as_ProductService";
    public Product getProductByCode(String code);
}