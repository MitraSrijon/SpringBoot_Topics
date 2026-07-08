package com.example.SpringBoot_Practice.Service;

import com.example.SpringBoot_Practice.modal.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
            new Product(101 , "Iphone" , 200),
            new Product(102 , "OnePlus" , 250)
    );

    //Fetching all the products from the database
    public List<Product> getProducts(){
        return products;
    }

    //Searching the products based on ID
    public Product getProductById(int productID){
        return products.stream()
                .filter(prod -> prod.getProductID() == productID)
                .findFirst().get();
    }


}
