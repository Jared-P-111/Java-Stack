package project.omikuji_form;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @RequestMapping("/omikuji")
  public String index(Model model) {
    return "form.jsp";
  }

  @PostMapping("/omikuji/new")
  public String newOmikuji(
    @RequestParam("numPick") Integer numPick,
    @RequestParam("nameOfCity") String nameOfCity,
    @RequestParam("nameOfPerson") String nameOfPerson,
    @RequestParam("endeavor") String endeavor,
    @RequestParam("creatureType") String creatureType,
    @RequestParam("userMessage") String userMessage,
    HttpSession session
  ) {
    session.setAttribute("numPick", numPick);
    session.setAttribute("nameOfCity", nameOfCity);
    session.setAttribute("nameOfPerson", nameOfPerson);
    session.setAttribute("endeavor", endeavor);
    session.setAttribute("creatureType", creatureType);
    session.setAttribute("userMessage", userMessage);

    return "redirect:/omikuji/show";
  }

  @RequestMapping("/omikuji/show")
  public String show(Model model) {
    return "show.jsp";
  }
}
