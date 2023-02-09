import java.util.ArrayList;
import java.util.Date;

public class AdminUser
  extends User
  implements HIPAACompliantAdmin, HIPAACompliantUser {

  // Inside class:
  private ArrayList<String> securityIncidents;
  private String role;

  @Override
  public ArrayList<String> reportSecurityIncidents() {
    return securityIncidents;
  }

  public boolean assignPin(int pin) {
    if (String.valueOf(pin).length() >= 6) {
      this.pin = pin;
      return true;
    }
    return false;
  }

  public boolean accessAuthorized(Integer confirmedAuthID) {
    System.out.printf("Auth ID: %d ", confirmedAuthID);
    System.out.printf("this.id -> ", this.id);
    if (confirmedAuthID.equals(this.id)) {
      return true;
    } else {
      String note = String.format("Datetime Submitted: %s, ", new Date());
      newIncident(note);
      return false;
    }
  }

  // TO DO: Implement a constructor that takes an ID and a role
  public AdminUser(Integer id, String role) {
    this.id = id;
    this.role = role;
  }

  public void newIncident(String notes) {
    String report = String.format(
      "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n",
      new Date(),
      this.id,
      notes
    );
    securityIncidents.add(report);
  }

  public void authIncident() {
    String report = String.format(
      "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n",
      new Date(),
      this.id,
      "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
    );
    securityIncidents.add(report);
  }
}
