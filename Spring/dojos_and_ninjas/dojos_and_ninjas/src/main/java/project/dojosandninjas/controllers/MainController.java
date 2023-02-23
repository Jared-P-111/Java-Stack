package project.dojosandninjas.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import project.dojosandninjas.model.Dojo;
import project.dojosandninjas.model.Ninja;
import project.dojosandninjas.services.DojoService;
import project.dojosandninjas.services.NinjaService;

@Controller
public class MainController {

  @Autowired
  DojoService dojoService;

  @Autowired
  NinjaService ninjaService;

  @RequestMapping({ "/dojos/new", "/" })
  public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
    return "dojos/new.jsp";
  }

  @PostMapping("/dojos")
  public String createDojo(@ModelAttribute("dojo") Dojo dojo) {
    dojoService.createDojo(dojo);

    return "redirect:/";
  }

  @GetMapping("/ninjas/new")
  public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
    List<Dojo> dojos = dojoService.getDojos();
    model.addAttribute("dojos", dojos);
    return "ninjas/new.jsp";
  }

  //🧈get form data for ninja creation
  @PostMapping("/ninjas")
  public String createNinja(@ModelAttribute("ninja") Ninja ninja) {
    ninjaService.createNinja(ninja);
    return "redirect:/";
  }

  //🧈Show dojo and its ninjas
  @GetMapping("/dojos/{id}")
  public String showDojo(@PathVariable("id") Long id, Model model) {
    Dojo dojo = dojoService.getOne(id);
    model.addAttribute("dojo", dojo);
    return "dojos/show.jsp";
  }
}
