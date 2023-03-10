package com.example.onlineshoppingapp340;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class OnlineShoppingApp340Application {

    public static void main(String[] args) {
        SpringApplication.run(OnlineShoppingApp340Application.class, args);
    }


    @GetMapping("/hello")
    public String helloWorld() {
        return String.format("Hello world! Further functionality under construction");
    }

}
