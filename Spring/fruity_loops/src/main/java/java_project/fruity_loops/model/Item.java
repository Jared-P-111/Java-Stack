package java_project.fruity_loops.model;

public class Item {

  // MEMBER VARIABLES
  private String name;
  private double price;
  private String description;

  // CONSTRUCTOR
  public Item(String name, double price, String description) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return this.name;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}
