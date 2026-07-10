package com.example.SpringBoot_Practice.Repository;

import com.example.SpringBoot_Practice.modal.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product , Integer> {
}
