package project.daikichi_routes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class MainController {

  @RequestMapping("")
  public String index() {
    return "Welcome";
  }

  @RequestMapping("/today")
  public String today() {
    return "Today you will have better luck";
  }

  @RequestMapping("/tomorrow")
  public String tomorrow() {
    return "Tomorrow you move forward to the next chapter in life. ";
  }
}
