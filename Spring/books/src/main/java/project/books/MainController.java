package project.books;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import project.books.model.Book;
import project.books.services.BookService;

@Controller
public class MainController {

  @Autowired
  BookService service;

  @RequestMapping("/")
  public String index(Model model) {
    return "form.jsp";
  }

  @RequestMapping("/books")
  public String getBooks(Model model) {
    List<Book> books = service.findBooks();

    model.addAttribute("books", books);
    return "index.jsp";
  }
}
