package com.example.shop.controller.request;

import com.example.shop.repo.UserEntity;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class UserRegisterRequest {
  @NotEmpty(message = "Name shouldn't be empty")
  private String name;
  @NotEmpty(message = "email shouldn't be empty")
  private String email;
  @NotEmpty(message = "password shouldn't be empty")
  private String password;
  @Min(value = 16, message = "You should have more then 15 years")
  private int age;
  private int rank;
  private String address;

  public UserRegisterRequest(
      @NotNull(
          message = "Name shouldn't be empty") String name,
      @NotNull(
          message = "email shouldn't be empty") String email,
      @NotNull(
          message = "password shouldn't be empty") String password,
      @Min(value = 16,
          message = "You should have more then 15 years") int age, int rank, String address) {
    this.name = name;
    this.email = email;
    this.password = password;
    this.age = age;
    this.rank = rank;
    this.address = address;
  }

  public static UserEntity mapToEntity(UserRegisterRequest request) {
    return UserEntity.builder()
        .name(request.getName())
        .email(request.getEmail())
        .password(request.getPassword())
        .build();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getRank() {
    return rank;
  }

  public void setRank(int rank) {
    this.rank = rank;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}
