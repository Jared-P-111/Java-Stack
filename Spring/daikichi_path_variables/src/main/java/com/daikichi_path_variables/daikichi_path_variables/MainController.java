package com.daikichi_path_variables.daikichi_path_variables;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @RequestMapping("")
  public String index() {
    return "Welcome Traveler!";
  }

  @RequestMapping("/travel/{destination}")
  public String showTravel(@PathVariable("destination") String destination) {
    return "You will soon travel to " + destination;
  }

  @RequestMapping("/lotto/{lotto}")
  public String lotto(@PathVariable("lotto") int lotto) {
    String answer;

    if (lotto % 2 == 0) {
      answer =
        "You will take a grand journey in the near future, but be weary of tempting offers.";
    } else {
      answer =
        "You have enjoyed the fruits of your labor but now is a great time to spend with family and friends";
    }

    return answer;
  }
}
