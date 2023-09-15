package Bank;

public class BankAccount {

  private String name;
  boolean isActive = false;
  private Bank bank;
  private static double amount;

  public BankAccount(String name, Bank bank) {
    System.out.println(name + " your account has been created successfully");
    System.out.println("Bank Name: " + bank.getBankName());
    System.out.println("Bank Banch Name: " + bank.getBranchName());
    System.out.println("Bank IFSC Code: " + bank.getIFSCCode());
    System.out.println();
  }

  public BankAccount(String name, Bank bank, double initialAmount) {
    this(name, bank);
    if (initialAmount == 0) {
      System.out.println("Account is created with initial amount zero");
    } else if (initialAmount > 0) {
      this.amount += initialAmount;
      isActive = true;
      System.out.println(name + " your account has been created successfully");
      System.out.println("Bank Name: " + bank.getBankName());
      System.out.println("Bank Banch Name: " + bank.getBranchName());
      System.out.println("Bank IFSC Code: " + bank.getIFSCCode());
      System.out.println("Account is created with initial amount " + initialAmount);
      System.out.println();
    } else if (initialAmount < 0) {
      System.out.println("Deposit amount can't be negative");
    }
//    System.out.println("BankAccount: 3-param constructor");
  }

  public boolean isActive() {
    return isActive;
  }

  public void setActive(boolean isActive) {
    this.isActive = isActive;
  }

  public void deposit(double depositAmount) {
    if (isActive) {
      if (depositAmount <= 0) {
        System.out.println("Do not pass zero or negative amount");
      } else {
        amount = amount + depositAmount;
        System.out.println(depositAmount + " amount has been deposited. ");
        System.out.println("Total Amount is " + amount);
      }

    } else {
      System.out.println("Account is inactive, can't do deposit transaction");
    }

  }

  public double withdraw(double withdrawAmount) {
    if (isActive) {
      if (amount == 0) {
        System.out.println("Amount is Zero, can't able to withdraw");
      } else if (amount < 0) {
        System.out.println("Amount is Negative, can't able to withdraw");
      } else {
        amount -= withdrawAmount;
        System.out.println(withdrawAmount + " amount has been withdrawn. ");
        System.out.println("Remaining Amount is " + amount);
      }
    } else {
      System.out.println("Account is inactive, can't do transaction");
    }
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public void displayBalance() {
    System.out.println("Current Balance is: " + amount);
  }
}

