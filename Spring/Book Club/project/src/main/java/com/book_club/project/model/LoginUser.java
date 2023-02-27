package com.book_club.project.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class LoginUser {

  @NotEmpty(message = "Your email is required")
  @Email(message = "Please enter a valid email")
  private String email;

  @NotEmpty(message = "Your password is required")
  @Size(message = "Passwords must be 8 - 128 characters long")
  private String password;

  public LoginUser() {}

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
