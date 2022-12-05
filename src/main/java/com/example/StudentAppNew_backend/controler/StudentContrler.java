package com.example.StudentAppNew_backend.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentContrler {

    @GetMapping("/")
    public String HomePage(){
        return "Welcome to my webpage";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact page";
    }

    @GetMapping("/gallery")
    public String gallery(){
        return "this is the gallery";
    }


}
