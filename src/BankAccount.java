public class BankAccount {
    private double bankAccountBalance;
    private String accountHolderName;

    public BankAccount(double bankAccountBalance, string accountHolderName) {
        this.bankAccountBalance = bankAccountBalance;
        this.accountHolderName = accountHolderName;
    }
    public void deposit (double amountOfDeposit) {
    bankAccountBalance= bankAccountBalance + amountOfDeposit;
    }
    public void withdrawal(double amountOfWithdrawal) {
        bankAccountBalance= bankAccountBalance - amountOfWithdrawal;
    }
    public void accountDetails () {
    System.out.printIn(accountHolderName + "'s account balance:" + bankAccountBalance);
    }
}
