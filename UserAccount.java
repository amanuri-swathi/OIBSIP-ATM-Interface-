public class UserAccount {

    private double balance;

    public UserAccount() {
        balance = 10000; // initial balance
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}