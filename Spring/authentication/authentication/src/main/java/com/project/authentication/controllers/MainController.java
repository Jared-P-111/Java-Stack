package com.project.authentication.controllers;

import com.project.authentication.model.LoginUser;
import com.project.authentication.model.User;
import com.project.authentication.services.UserService;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  @Autowired
  private UserService userService;

  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("newUser", new User());
    model.addAttribute("newLogin", new LoginUser());
    return "index.jsp";
  }

  @PostMapping("/register")
  public String register(
    @Valid @ModelAttribute("newUser") User newUser,
    BindingResult result,
    Model model,
    HttpSession session
  ) {
    System.out.println("IM in register!!!!!!!!!!!!!!!!!!!!!!!!");
    //🧈Grab user object and we can use this for storing user id for login.
    User user = userService.register(newUser, result);

    if (result.hasErrors()) {
      model.addAttribute("newLogin", new LoginUser());
      return "index.jsp";
    }
    //🧈Store users id in session to for login.
    session.setAttribute("userId", user.getId());
    return "redirect:/welcome";
  }

  @PostMapping("/login")
  public String login(
    @Valid @ModelAttribute("newLogin") LoginUser newLogin,
    BindingResult result,
    Model model,
    HttpSession session
  ) {
    if (result.hasErrors()) {
      System.out.println("Error Detected!");
      model.addAttribute("newUser", new User());
      return "index.jsp";
    }

    return "redirect:/welcome";
  }

  @GetMapping("/welcome")
  public String welcome(HttpSession session) {
    if (session.getAttribute("userId") == null) {
      return "redirect:/logout";
    }
    return "welcome.jsp";
  }

  @GetMapping("/logout")
  public String logout(HttpSession session) {
    session.invalidate();
    return "redirect:/";
  }
}
