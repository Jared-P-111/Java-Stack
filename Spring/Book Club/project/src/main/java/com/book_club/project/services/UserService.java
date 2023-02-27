package com.book_club.project.services;

import com.book_club.project.model.LoginUser;
import com.book_club.project.model.User;
import com.book_club.project.repositories.UserRepository;
import java.util.Optional;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public User register(User newUser, BindingResult result) {
    Optional<User> user = userRepository.findByEmail(newUser.getEmail());
    if (user.isPresent()) {
      //🧈This is triggered if email is already in DB.
      result.rejectValue("email", "Email", "Email in use");
    }
    if (!newUser.getPassword().equals(newUser.getConfirm())) {
      result.rejectValue("confirm", "Confirm", "Passwords don't match");
    }
    if (result.hasErrors()) {
      return null;
    }

    String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
    System.out.println(hashed);
    newUser.setPassword(hashed);
    return userRepository.save(newUser);
  }

  public User login(LoginUser newUser, BindingResult result) {
    User user = userRepository.findByEmail(newUser.getEmail()).orElse(null);
    if (!this.checkEmail(newUser.getEmail())) {
      //🧈This is triggered if email is already in DB.
      result.rejectValue("email", "Email", "Email in use");
    }
    if (result.hasErrors()) {
      return null;
    }

    if (!BCrypt.checkpw(newUser.getPassword(), user.getPassword())) {
      result.rejectValue("password", "Password", "Invalid Credentials");
    }
    if (result.hasErrors()) {
      return null;
    }
    return user;
  }

  public boolean checkEmail(String email) {
    Optional<User> user = userRepository.findByEmail(email);
    if (user.isPresent()) {
      return true;
    } else {
      return false;
    }
  }
}
