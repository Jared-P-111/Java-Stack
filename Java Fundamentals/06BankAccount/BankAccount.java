//Worked on with Anthony Stine
public class BankAccount {

  //🧈Class Attributes (Think Variables);
  private double checkingBalance;
  private double savingsBalance;
  private static int numberOfAccounts;
  private int accountNumber;

  //🧈This is the class constructor
  public BankAccount(double checkingBalance, double savingsBalance) {
    this.checkingBalance += checkingBalance;
    this.savingsBalance += savingsBalance;
    this.accountNumber = generateAccountNum();
    numberOfAccounts++;
  }

  //🧈============== Class Methods =====================
  public double getCheckingBalance() {
    return this.checkingBalance;
  }

  public void setCheckingBalance(double checkingBalance) {
    this.checkingBalance = checkingBalance;
  }

  public double getSavingsBalance() {
    return this.savingsBalance;
  }

  public void setSavingsBalance(double savingsBalance) {
    this.savingsBalance = savingsBalance;
  }

  public double setCheckDeposit(double userDeposit) {
    return this.checkingBalance += userDeposit;
  }

  public double setSavingsDeposit(double userDeposit) {
    return this.savingsBalance += userDeposit;
  }

  public double getTotalAmount() {
    return this.savingsBalance + this.checkingBalance;
  }

  public static int getNumberOfAccounts() {
    return numberOfAccounts;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  private int generateAccountNum() {
    return 1234345545;
  }
}
