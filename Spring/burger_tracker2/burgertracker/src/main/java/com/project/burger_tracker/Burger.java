package project.burger_tracker.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity //<-- This makes the jpa library look at this entity when a book is made and used with the repository.
@Table(name = "burgers") //<-- This tells jpa we want to store this data in a table called books.
public class Burger {

  @Id //<-- This makes primary key in table.
  @GeneratedValue(strategy = GenerationType.IDENTITY) //<-- This makes the primary key to auto increment.
  private Long id; //<-- Make sure to give a variable for the @Id it will use this when making the table.

  @NotNull
  private String burgerName;

  @NotNull
  private String restaurantName;

  @NotNull
  private Integer rating;

  @NotNull
  private String notes;

  public Burger() {}

  public Burger(
    String burgerName,
    String restaurantName,
    String notes,
    Integer rating
  ) {
    this.burgerName = burgerName;
    this.restaurantName = restaurantName;
    this.rating = rating;
    this.notes = notes;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getBurgerName() {
    return this.burgerName;
  }

  public void setBurgerName(String burgerName) {
    this.burgerName = burgerName;
  }

  public String getRestaurantName() {
    return this.restaurantName;
  }

  public void setRestaurantName(String restaurantName) {
    this.restaurantName = restaurantName;
  }

  public Integer getRating() {
    return this.rating;
  }

  public void setRating(Integer rating) {
    this.rating = rating;
  }

  public String getNotes() {
    return this.notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }
}
