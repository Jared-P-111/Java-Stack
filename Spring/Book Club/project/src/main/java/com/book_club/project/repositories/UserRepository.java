package com.book_club.project.repositories;

import com.book_club.project.model.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
  Optional<User> findByEmail(String email);
}
