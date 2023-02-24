package com.project.authentication.services;

import com.project.authentication.model.LoginUser;
import com.project.authentication.model.User;
import com.project.authentication.repositories.UserRepository;
import java.util.Optional;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  // TO-DO: Write register and login methods!
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

  public User login(LoginUser newLoginObject, BindingResult result) {
    // TO-DO: Additional validations!
    return null;
  }
}
