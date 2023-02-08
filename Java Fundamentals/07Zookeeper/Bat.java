public class Bat extends Mammal {

  protected int energy = 300;

  public void showEnergy() {
    int parentEnergy = super.energy;

    System.out.println("Energy: " + this.energy);
    System.out.printf("Parent Energy: %d", parentEnergy);
  }

  public void fly() {
    System.out.println("flap flap");
    this.energy -= 5;
  }

  public void attackTown() {
    System.out.println("Screams everywhere!!!");
    this.energy -= 100;
  }

  public void eatHumans() {
    System.out.println("nom nom hoomans good...");
    this.energy += 25;
  }
}
