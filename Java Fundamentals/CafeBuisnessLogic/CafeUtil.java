import java.util.ArrayList;

public class CafeUtil {

  public int getStreakGoal(int numWeeks) {
    int sum = 0;

    for (int i = 0; i < numWeeks; i++) {
      sum += i;
    }
    return sum;
  }

  public int getOrderTotal(double[] lineItems) {
    int sum = 0;
    int arrLength = lineItems.length;

    for (int i = 0; i < arrLength; i++) {
      lineItems[i] += sum;
    }

    return sum;
  }

  public void displayMenu(ArrayList<String> menu) {
    String quote = "This shit sucks.... ";

    for (int i = 0; i < menu.size(); i++) {
      String newI = Integer.toString(i);
      String menuItem = menu.get(i);
      System.out.printf("%s %s %s %n", newI, quote, menuItem);
      System.out.println(newI + quote + menuItem);
    }
  }

  public void addCustomer(ArrayList<String> customers) {
    System.out.println("Please enter you name");
    String userName = System.console().readLine();
    customers.add(userName);
  }
}
