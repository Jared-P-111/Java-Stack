package com.book_club.project.controllers;

import com.book_club.project.model.Book;
import com.book_club.project.services.BookService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BooksController {

  @Autowired
  BookService bookService;

  @GetMapping("/books")
  public String books(Model model) {
    List<Book> books = bookService.getAllBooks();
    model.addAttribute("books", books);
    return "userBooks.jsp";
  }

  @GetMapping("/books/new")
  public String newBook(@ModelAttribute("book") Book book) {
    return "addBook.jsp";
  }

  @PostMapping("/books/new/book")
  public String addNewBook(@ModelAttribute("book") Book book) {
    bookService.addBook(book);
    return "redirect:/books";
  }

  @GetMapping("/books/{id}")
  public String showBook(@PathVariable("id") Long id, Model model) {
    Book book = bookService.getOne(id);
    model.addAttribute("book", book);
    return "showBook.jsp";
  }
}
