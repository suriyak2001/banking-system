import java.util.Scanner;

public class BankSystem {
  // main class
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    BankAccount account = new BankAccount("101", "suriya", 10000);

    int choice;

    do {
      System.out.println("\n *****welcome to simple banking system*****");
      System.out.println("1) Deposit \n2) Withdraw \n3) Check Balance \n4) Exit");
      System.out.println("Enter your choice: ");

      choice = input.nextInt();

      // choices
      switch(choice) {

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

    input.close();
  }
}