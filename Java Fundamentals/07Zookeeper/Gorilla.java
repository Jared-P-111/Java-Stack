public class Gorilla extends Mammal {

  public void throwSomething() {
    this.energy -= 5;
    System.out.printf("%nKong threw Jane%n");
  }

  public void eatSomething() {
    this.energy += 10;
    System.out.printf("%nKong like food, Energy Increased to: %s", this.energy);
  }

  public void eatBanana() {
    System.out.println("Kong ate a banana");
  }

  public void climb(String climbable) {
    this.energy -= 10;
    System.out.printf("Kong is climbing a %s %n", climbable);
  }
}
