class BankAccount {

  // fields for account details
  private String accountNumber;
  private String accountHolderName;
  private double balance;

  // constructor
  public BankAccount (String accountNumber, String accountHolderName, double balance) {
    this.accountNumber = accountNumber;
    this.accountHolderName = accountHolderName;
    this.balance = balance;
  }

  // deposit method
  public void deposit(double amount) {
    if (amount > 0) {
      balance = balance + amount;
      System.out.println("deposited amount: " + amount);
    } else {
      System.out.println("invalid deposit amount");
    }
  }

  // withdraw method
  public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance = balance - amount;
      System.out.println("withdrawn amount: " + amount);
    } else {
      System.out.println("insufficient balance or invalid amount");
    }
  }

  // check balance method
  public void checkBalance() {
    System.out.println("current balance: " + balance);
  }
}