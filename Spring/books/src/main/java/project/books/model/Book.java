package project.books.model; //<-- this makes the file available for other files.

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //🧈<-- This makes the jpa library look at this entity when a book is made and used with the repository.
@Table(name = "books") //🧈<-- This tells jpa we want to store this data in a table called books.
public class Book {

  @Id //🧈<-- This makes primary key in table.
  @GeneratedValue(strategy = GenerationType.IDENTITY) //🧈<-- This makes the primary key to auto increment.
  private Long id; //🧈<-- Make sure to give a variable for the @Id it will use this when making the table.

  private String title;
  private Integer pages;
  private String description;

  public Book() {}

  public Book(String title, Integer pages, String description) {
    this.title = title;
    this.pages = pages;
    this.description = description;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Integer getPages() {
    return this.pages;
  }

  public void setPages(Integer pages) {
    this.pages = pages;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
