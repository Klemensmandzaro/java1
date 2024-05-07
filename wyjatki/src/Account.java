public class Account {
    private String accountName;
    private double balance;

    public Account(String accountName, double initialBalance) {
        this.accountName = accountName;
        this.balance = initialBalance;
    }

    public int withdraw(int amount) throws InsufficuentFundsException {
        balance-=amount;
        if (balance < 0) {
            throw new InsufficuentFundsException ("Chcesz wybrac wiecej niz masz");
        }
        return amount;
    }

    public double getBalance() {
        return balance;
    }
}
