package project.burger_tracker;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import project.burger_tracker.model.Burger;
import project.burger_tracker.services.BurgerService;

@Controller
public class MainController {

  @Autowired
  BurgerService burgerService;

  @RequestMapping("/")
  public String index(@ModelAttribute("burger") Burger burger, Model model) {
    List<Burger> burgers = burgerService.getAllBurgers();
    model.addAttribute("burgers", burgers);
    return "index.jsp";
  }

  @PostMapping("/burgers")
  public String create(
    @Valid @ModelAttribute("burger") Burger burger,
    BindingResult result
  ) {
    if (result.hasErrors()) {
      return "index.jsp";
    } else {
      burgerService.createBurger(burger);
    }
    return "redirect:/";
  }
}
