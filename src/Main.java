public class Main {
    public static void main (String[] args) {
        BankAccount myBankAccount = new BankAccount (500, "Alexa");
        BankAccount account1= new BankAccount(5000, "Sher");
        BankAccount account2= new BankAccount(300, "Elizabeth");

        myBankAccount.deposit (100);
        myBankAccount.accountDetails();
        account1.withdrawal (100);
        account2.deposit(100);
        account1.accountDetails();
        account2.accountDetails();
    }
}
