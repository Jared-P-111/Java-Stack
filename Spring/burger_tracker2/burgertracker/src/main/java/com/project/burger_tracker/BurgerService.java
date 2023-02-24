package project.burger_tracker.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.burger_tracker.model.Burger;
import project.burger_tracker.repositories.BurgerRepository;

@Service
public class BurgerService {

  @Autowired
  BurgerRepository burgerRepository;

  public List<Burger> findBurgers() {
    return burgerRepository.findAll();
  }

  public void createBurger(Burger burger) {
    burgerRepository.save(burger);
  }

  public List<Burger> getAllBurgers() {
    return burgerRepository.findAll();
  }
}
