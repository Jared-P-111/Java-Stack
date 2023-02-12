public class User {

  public User(Integer id) {
    this.id = id;
  }

  protected Integer id;
  protected Integer pin;

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getPin() {
    return this.pin;
  }

  public void setPin(Integer pin) {
    this.pin = pin;
  }
}
