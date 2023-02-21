package project.com.jaredp.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.com.jaredp.model.Expense;
import project.com.jaredp.repositories.ExpenseRepository;

@Service
public class ExpenseService {

  @Autowired
  ExpenseRepository expenseRepository;

  public List<Expense> findExpenses() {
    return expenseRepository.findAll();
  }

  public void createExpense(Expense expense) {
    expenseRepository.save(expense);
  }

  public Expense showExpense(Long id) {
    Optional<Expense> optionalExpense = expenseRepository.findById(id);
    return optionalExpense.orElse(null);
  }

  public void updateExpense(Expense expense) {
    expenseRepository.save(expense);
  }

  public void deleteExpense(Expense expense) {
    expenseRepository.delete(expense);
  }
}
