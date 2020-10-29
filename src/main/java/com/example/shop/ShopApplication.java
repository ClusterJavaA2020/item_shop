package com.example.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopApplication {

  public static void main(String[] args) {
    SpringApplication.run(ShopApplication.class, args);
  }

  //@Override
  //public void run(String... args) throws Exception {
  //  userRepo.save(UserEntity.builder().name("Some name").build());
  //}
}
