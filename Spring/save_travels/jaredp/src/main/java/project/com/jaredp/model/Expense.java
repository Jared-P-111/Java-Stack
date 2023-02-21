package project.com.jaredp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "expenses")
public class Expense {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotNull
  @Size(min = 3, max = 100)
  private String userExpense;

  @NotNull
  private Double cost;

  @NotNull
  @Size(min = 3, max = 100)
  private String vendor;

  private String description;

  public Expense() {}

  public Expense(
    String userExpense,
    Double cost,
    String vendor,
    String description
  ) {
    this.userExpense = userExpense;
    this.cost = cost;
    this.vendor = vendor;
    this.description = description;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUserExpense() {
    return this.userExpense;
  }

  public void setUserExpense(String userExpense) {
    this.userExpense = userExpense;
  }

  public Double getCost() {
    return this.cost;
  }

  public void setCost(Double cost) {
    this.cost = cost;
  }

  public String getVendor() {
    return this.vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
