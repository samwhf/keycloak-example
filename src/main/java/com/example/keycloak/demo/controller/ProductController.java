package com.example.keycloak.demo.controller;

import com.example.keycloak.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping(path = "/products")
    public String getProducts(Principal principal, Model model) {
        model.addAttribute("products", productService.getProducts());
        model.addAttribute("principal", principal);
        return "products";
    }

    @GetMapping(path = "/logout")
    public String logout(HttpServletRequest request) throws ServletException {
        request.logout();
        return "/";
    }
}
