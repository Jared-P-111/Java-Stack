package com.book_club.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book_club.project.model.Book;
import com.book_club.project.repositories.BookRepository;

@Service
public class BookService {

  @Autowired
  BookRepository bookRepository;

  public List<Book> getAllBooks() {
    return bookRepository.findAll();
  }

  public void addBook(Book book) {
    bookRepository.save(book);
  }

  public Book getOne(Long id) {
    Optional<Book> optionalBook = bookRepository.findById(id);
    return optionalBook.orElse(null);
  }
}
