package com.example.simple_app_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.simple_app_demo.domain.*;

public interface  ProductRepository extends JpaRepository<Product,Integer>{

}
