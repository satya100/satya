package Bank;

public class BankAdmin {
  public static void main(String[] args) {
    Bank bank = new Bank();
    bank.setBankName("SBI");
    bank.setBranchName("Bbsr");
    bank.setIFSCCode("SBI003454");
    BankAccount account = new BankAccount("krishna", bank, 0);
    BankAccount account2 = new BankAccount("hari", bank);
    account.displayBalance();
    account.setActive(true);
    account.deposit(2000);
    account.withdraw(1000);
    System.out.println();
  }
}
