package java_project.fruity_loops;

import java.util.ArrayList;
import java_project.fruity_loops.model.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemController {

  @RequestMapping("")
  public String index(Model model) {
    ArrayList<Item> fruits = new ArrayList<Item>();

    fruits.add(new Item("Kiwi", 1.5, "Its furry"));
    fruits.add(new Item("Mango", 2.0, "Not my favorite"));
    fruits.add(new Item("Goji Berries", 4.0, "Great for your heart"));
    fruits.add(new Item("Guava", .75, "Very high sugar complex"));

    model.addAttribute("fruits", fruits);

    System.out.println("Fruits --> " + fruits);
    return "items.jsp";
  }
}
