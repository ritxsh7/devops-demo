package com.example.simple_app_demo;



import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.simple_app_demo.service.*;
import com.example.simple_app_demo.domain.*;
import java.util.List;

@RestController
public class SimpleController{


private ProductService service;


public SimpleController(ProductService service){
this.service = service;
}
@GetMapping()
public  String welcome(){
return "Welcome To world of devops";
}

@GetMapping("/products")
public  List<Product> getAll(){
return service.getProducts();
}

}

