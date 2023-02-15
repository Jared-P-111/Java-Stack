package project.books.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.books.model.Book;
import project.books.repositories.BookRepository;

@Service
public class BookService {

  @Autowired
  BookRepository repo; //🧈<-- This connection allows for the library of methods built into the CrudRepository.

  public List<Book> findBooks() {
    return repo.findAll();
  }
}
