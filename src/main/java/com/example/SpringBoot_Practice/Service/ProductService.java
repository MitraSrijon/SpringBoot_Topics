package com.example.SpringBoot_Practice.Service;

import com.example.SpringBoot_Practice.Repository.ProductRepo;
import com.example.SpringBoot_Practice.modal.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    //Fetching all the products from the database
    public List<Product> getProducts(){
        return repo.findAll();
    }

    //Searching the products based on ID
    public Product getProductById(int productID){
        return repo.findById(productID).orElse(new Product());
    }

    //Adding products in the list
    public void addProducts(Product prod){
        repo.save(prod);
    }

    //Updating the products
    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    //Deleting the product
    public void deleteProduct(int prodID) {
        repo.deleteById(prodID);
    }
}
