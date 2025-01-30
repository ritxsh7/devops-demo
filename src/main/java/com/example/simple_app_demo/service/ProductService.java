
package com.example.simple_app_demo.service;
import org.springframework.stereotype.Service;
import com.example.simple_app_demo.repository.*;
import com.example.simple_app_demo.domain.*;
import java.util.List;
@Service
public class ProductService {

    private ProductRepository productRepository;


public ProductService(ProductRepository productRepository){
this.productRepository =productRepository;
}
    public List<Product> getProducts() {
        //log.info("Getting departments from service");
        return  productRepository.findAll();
    }

}
