package project.books.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import project.books.model.Book;

@Repository //🧈<-- This designates the repository to be seen by spring with the service.
public interface BookRepository extends CrudRepository<Book, Long> {
  List<Book> findAll();
}
