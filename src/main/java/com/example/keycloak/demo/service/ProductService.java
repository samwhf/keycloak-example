package com.example.keycloak.demo.service;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ProductService {
    public List<String> getProducts() {
        return Arrays.asList("ipad", "ipod", "iphone");
    }
}
