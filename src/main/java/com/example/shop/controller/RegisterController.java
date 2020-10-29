package com.example.shop.controller;

import com.example.shop.controller.request.UserRegisterRequest;
import com.example.shop.repo.UserEntity;
import com.example.shop.repo.UserRepo;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class RegisterController {
  @Autowired
  private UserRepo userRepo;

  @GetMapping
  Iterable<UserEntity> getAll() {
    return userRepo.findAll();
  }

  @GetMapping("/find")
  UserEntity getAll(@NotEmpty @RequestParam String email) {
    return userRepo.findByEmail(email);
  }


  @PostMapping
  UserEntity registerUser(@RequestBody UserRegisterRequest request) {
    return userRepo.save(UserRegisterRequest.mapToEntity(request));
  }
}
