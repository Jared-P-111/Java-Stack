package com.book_club.project.repositories;

import com.book_club.project.model.Book;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
  List<Book> findAll();
}
