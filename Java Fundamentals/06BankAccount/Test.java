//Worked on with Anthony Stine
public class Test {

  public static void main(String[] args) {
    BankAccount member1 = new BankAccount(0, 0);
    BankAccount member2 = new BankAccount(100, 30000);
    System.out.println(member1.getCheckingBalance());
    System.out.println(member1.getSavingsBalance());
    System.out.println(BankAccount.getNumberOfAccounts());
    System.out.println(member1.getAccountNumber());
    System.out.println(member1.setCheckDeposit(50));
    System.out.println(member1.setSavingsDeposit(3));
    System.out.println(member1.getCheckingBalance());
    System.out.println(member1.getTotalAmount());
    System.out.println(member2.getTotalAmount());
  }
}
