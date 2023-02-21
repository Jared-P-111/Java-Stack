package project.com.jaredp;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import project.com.jaredp.model.Expense;
import project.com.jaredp.services.ExpenseService;

@Controller
public class MainController {

  @Autowired
  ExpenseService expenseService;

  @RequestMapping("/")
  public String index(@ModelAttribute("expense") Expense expense, Model model) {
    List<Expense> expenses = expenseService.findExpenses();
    model.addAttribute("expenses", expenses);
    return "index.jsp";
  }

  @PostMapping("/expenses")
  public String create(
    @Valid @ModelAttribute("expense") Expense expense,
    BindingResult result
  ) {
    if (result.hasErrors()) {
      return "index.jsp";
    } else {
      expenseService.createExpense(expense);
    }
    return "redirect:/";
  }

  @RequestMapping("/expenses/{id}")
  public String show(@PathVariable("id") Long id, Model model) {
    Expense expense = expenseService.showExpense(id);
    model.addAttribute("expense", expense);
    return "show.jsp";
  }

  @RequestMapping("/expenses/edit/{id}")
  public String edit(@PathVariable("id") Long id, Model model) {
    Expense expense = expenseService.showExpense(id);
    model.addAttribute("expense", expense);
    return "edit.jsp";
  }

  @PutMapping("/expenses/update/{id}")
  public String update(
    @Valid @ModelAttribute("expense") Expense expense,
    BindingResult result
  ) {
    if (result.hasErrors()) {
      return "index.jsp";
    } else {
      expenseService.updateExpense(expense);
    }
    return "redirect:/";
  }

  @DeleteMapping("/expenses/delete/{id}")
  public String destroy(@PathVariable("id") Long id) {
    Expense expense = expenseService.showExpense(id);
    expenseService.deleteExpense(expense);
    return "redirect:/";
  }
}
