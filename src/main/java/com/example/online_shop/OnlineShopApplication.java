package com.example.online_shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OnlineShopApplication {


    public static void main(String[] args) {
        SpringApplication.run(OnlineShopApplication.class, args);
    }

}
