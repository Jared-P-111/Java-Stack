package Spring.henlo_hooman.src.main.java.com.hello_human.henlo_hooman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @RequestMapping("/")
  public String index() {
    return "Hello Human";
  }
}
