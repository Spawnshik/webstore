package com.packt.webstore.controller;

import com.packt.webstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
    @RequestMapping
    public String list(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "products";
    }
    @RequestMapping("/all")
    public String AllProducts(Model model){
        model.addAttribute("products",productService.getAllProducts());
        return "products";
    }

    @Autowired
    private ProductService productService;
}
