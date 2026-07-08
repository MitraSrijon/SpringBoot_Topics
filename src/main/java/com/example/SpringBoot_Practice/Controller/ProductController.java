package com.example.SpringBoot_Practice.Controller;

import com.example.SpringBoot_Practice.Service.ProductService;
import com.example.SpringBoot_Practice.modal.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    //Getting the list of all the products
    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    //Getting the product bby its id
    @GetMapping("/products/{productID}")
    public Product getProductbyID(@PathVariable int productID){
        return productService.getProductById(productID);
    }

}
