public interface ATMOperations {

    void viewTransactionHistory();

    void withdraw(double amount);

    void deposit(double amount);

    void transfer(int accountNumber, double amount);
}