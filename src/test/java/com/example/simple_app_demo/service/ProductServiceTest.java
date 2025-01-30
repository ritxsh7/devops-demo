package com.example.simple_app_demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.simple_app_demo.domain.Product;
import com.example.simple_app_demo.repository.ProductRepository;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {



private ProductService productService;


    @Mock
    private ProductRepository productRepository;

   

    @BeforeEach
    public void init() {
    	productService = new ProductService(productRepository);
   
    }
    
    @Test
    @DisplayName("Test Products")
    void givenListOfProducts_whenGettingProducts_thenRetturnProducts(){
    	
    	List<Product> products= List.of(new Product("Iphone16"),
    			new Product("Pixel"));
    	when(productRepository.findAll()).thenReturn(products);
    	
    	List<Product> retrievedProducts = productService.getProducts();
    	assertEquals(2, retrievedProducts.size());
    }
    
    }