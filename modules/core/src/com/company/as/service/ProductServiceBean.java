package com.company.as.service;

import com.company.as.entity.Product;
import org.springframework.stereotype.Service;

@Service(ProductService.NAME)
public class ProductServiceBean implements ProductService {

    public Product getProductByCode(String code){
        return null;
    }

}