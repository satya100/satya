package Bank;

public class Bank {
  private static String BankName;
  private static String IFSCCode;
  private static String BranchName;

  public String getBankName() {
    return BankName;
  }

  public void setBankName(String bankName) {
    BankName = bankName;
  }

  public String getIFSCCode() {
    return IFSCCode;
  }

  public void setIFSCCode(String IFSCCode) {
    this.IFSCCode = IFSCCode;
  }

  public String getBranchName() {
    return BranchName;
  }

  public void setBranchName(String branchName) {
    BranchName = branchName;
  }

}

