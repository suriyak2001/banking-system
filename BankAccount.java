class BankAccount {

  // fields for account details
  
  private String accountHolderName;
  private int accountNumber;
  private int pin;
  private double balance;

  // constructor
  public BankAccount(String accountHolderName, int accountNumber, int pin) {
    this.accountHolderName = accountHolderName;
    this.accountNumber = accountNumber;
    this.pin = pin;
    this.balance = 0.0;
  }

  // validation pin 
  public boolean validatePin(int inputPin) {
    return this.pin == inputPin;
  }

  // deposit method
  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Deposited amount: " + amount);
    } else {
      System.out.println("invalid deposit amount");
    }
  }

  // withdraw method
  public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      System.out.println("Withdrawn amount: " + amount);
    } else {
      System.out.println("Insufficient balance or invalid amount");
    }
  }

  // check balance method
  public void checkBalance() {
    System.out.println("current balance: " + balance);
  }

  // getter for  account number
  public int getAccountNumber() {
    return accountNumber;
  }

  // getter for account holder name
  public String getAccountHolderName() {
    return accountHolderName;
  }
}