package testing_stuffs;

public class AccountExample {
    private String accountName;
    private  double accountBalance;
    private double amount;

    public AccountExample(String accountName, double accountBalance) {
        this.accountName = accountName;
        this.accountBalance = accountBalance;
        congratulatoryMessage();
    }
    public String getAccountName() { return accountName; }
    public double getAccountBalance() { return accountBalance; }
    public void deposit(double amount) {
        this.amount = amount;
        accountBalance = getAccountBalance() + amount;
        depositInfo();
    }
    public void debit(double amount) {
        if (amount < getAccountBalance()) {
            this.amount = amount;
            accountBalance = getAccountBalance() - amount;
            debitInfo();
        } else { System.out.print("Insufficient balance!!!"); }
    }
    private void congratulatoryMessage() {
        System.out.printf("""
                Congratulations %s, your account has been created successfully; and your balance is %.2f.
                
                """, getAccountName(), getAccountBalance());
    }
    private void depositInfo() {
        System.out.printf("Dear %s, deposit of %.2f successful.\nYour account balance is now %.2f, thank you.\n\n",
                getAccountName(), amount, getAccountBalance());
    }

    private void debitInfo() {
        System.out.printf("Dear %s, debit of %.2f successful.\nYour account balance is now %.2f, thank you.\n\n",
        getAccountName(), amount, getAccountBalance());
    }
}
