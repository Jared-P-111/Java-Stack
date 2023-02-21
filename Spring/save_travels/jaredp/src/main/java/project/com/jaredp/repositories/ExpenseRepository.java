package project.com.jaredp.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import project.com.jaredp.model.Expense;

public interface ExpenseRepository extends CrudRepository<Expense, Long> {
  List<Expense> findAll();
}
