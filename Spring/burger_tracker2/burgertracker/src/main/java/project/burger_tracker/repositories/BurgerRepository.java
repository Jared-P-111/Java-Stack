package project.burger_tracker.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
// import org.springframework.stereotype.Repository;
import project.burger_tracker.model.Burger;

//@Repository //🧈<-- This designates the repository to be seen by spring with the service.
public interface BurgerRepository extends CrudRepository<Burger, Long> {
  List<Burger> findAll();
}
