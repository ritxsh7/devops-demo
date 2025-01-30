package com.example.simple_app_demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class NewSimpleController{

@GetMapping("/new")
public  String welcome(){
return "Welcome To world of devops";
}

}

