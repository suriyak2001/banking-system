import java.util.Scanner;
import java.util.HashMap;

public class BankSystem {
  private HashMap<Integer, BankAccount> accounts = new HashMap<>();
  private int nextAccountNumber = 1001;
  private Scanner input = new Scanner(System.in);
  
  // account creation
  public void createAccount() {
    input.nextLine();
    System.out.println("Enter your name: ");
    String name = input.nextLine();
    System.out.println("Set a 4-digit pin: ");
    int pin = input.nextInt();

    int accountNumber = nextAccountNumber++;
    BankAccount newAccount = new BankAccount(name, accountNumber, pin);
    accounts.put(accountNumber, newAccount);

    System.out.println("\n Your account has been created successfully");
    System.out.println("Your account number: " + accountNumber);
  }
  
  // login using pin
  public void login() {
    System.out.print("Enter your account number: ");
    int accNum = input.nextInt();
    System.out.print("Enter valid pin: ");
    int pin = input.nextInt();

    BankAccount account = accounts.get(accNum);
    if (account != null && account.validatePin(pin)) {
      System.out.println("\n Login successful. Welcome, " + account.getAccountHolderName());
      bankingMenu(account);
    } else {
      System.out.println("Invalid account number or PIN");
    }
  }
  
  // banking menu
  private void bankingMenu(BankAccount account) {
    int choice;

    do {
      System.out.println("\n *****welcome to simple banking system*****");
      System.out.println("1) Deposit \n2) Withdraw \n3) Check Balance \n4) Exit");
      System.out.println("Enter your choice: ");

      choice = input.nextInt();

      // choices
      switch (choice) {

        //for deposit
        case 1: {
          System.out.println("enter the amount to be deposited: ");
          double depositAmount = input.nextDouble();
          account.deposit(depositAmount);
          break;
        }

        // for withdraw
        case 2: {
          System.out.println("enter the amount to be withdrawed: ");
          double withdrawAmount = input.nextDouble();
          account.withdraw(withdrawAmount);
          break;
        }

        // for checking balance
        case 3: {
          account.checkBalance();
          break;
        }

        // for exiting the bank
        case 4: {
          System.out.println("Thank you using simple banking system");
          break;
        }

        default: {
          System.out.println("Invalid choice!! Enter the valid choice");
        }

      }
    } while (choice != 4);
  }
  
  // main menu
  public void mainMenu() {
    int choice;

    do {
      System.out.println("\n *** Welcome to Simple Bank ***");
      System.out.println("1) create account");
      System.out.println("2) login");
      System.out.println("3) exit");
      System.out.print("Enter your choice: ");

      choice = input.nextInt();

      switch (choice) {
        case 1: {
          createAccount();
          break;
        }
        case 2: {
          login();
          break;
        }
        case 3: {
          System.out.print("Thank you for using Simple Bank");
          break;
        }
        default: {
          System.out.print("Invalid choice. Try again!");
        }
      }
    } while (choice != 3);
  }
}