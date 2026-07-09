package com.example.SpringBoot_Practice.Service;

import com.example.SpringBoot_Practice.modal.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>( Arrays.asList(
            new Product(101 , "Iphone" , 200),
            new Product(102 , "OnePlus" , 250)
    )
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

    //Adding products in the list
    public void addProducts(Product prod){
        products.add(prod);
    }

    //Updating the products
    public void updateProduct(Product prod) {

        int index=0;
        for(int i=0; i<products.size(); i++){
            if (products.get(i).getProductID() == prod.getProductID()){
                index = i;
            }
        }
        products.set(index,prod);
    }

    //Deleting the product
    public void deleteProduct(int prodID) {

        int index=0;
        for(int i=0; i<products.size(); i++){
            if (products.get(i).getProductID() == prodID){
                index = i;
            }
        }
        products.remove(index);
    }
}
