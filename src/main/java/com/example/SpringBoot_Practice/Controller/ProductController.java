package com.example.SpringBoot_Practice.Controller;

import com.example.SpringBoot_Practice.Service.ProductService;
import com.example.SpringBoot_Practice.modal.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    //Adding product to the list
    @PostMapping("/addProducts")
    public String addProducts(@RequestBody Product prod){
        productService.addProducts(prod);
        return "Products has been added successfully...";
    }

    //Updating the existing product
    @PutMapping("/updateProduct")
    public String updateProduct(@RequestBody Product prod){
        productService.updateProduct(prod);
        return "Product detail has been updated...";
    }

    //Deleting the product
    @DeleteMapping("/deleteProduct/{prodID}")
    public String deleteProduct(@PathVariable int prodID){
        productService.deleteProduct(prodID);
        return "Product has been deleted successfully...";
    }

}
