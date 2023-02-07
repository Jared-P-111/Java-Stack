import java.util.Date;

public class AlfredQuotes {

  public String basicGreeting() {
    // You do not need to code here, this is an example method
    return "Hello, lovely to see you. How are you?";
  }

  public String guestGreeting(String name) {
    // YOUR CODE HERE
    return "hello guest do you like Java? You do! Okay get out";
  }

  public String dateAnnouncement() {
    Date myDate = new Date();

    return "Todays date is: " + myDate.toString();
  }

  public String respondBeforeAlexis(String conversation) {
    return "Hello";
  }
}
