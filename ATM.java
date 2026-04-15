import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        ATMOperations operations = new ATMOperationsImpl();
        Scanner sc = new Scanner(System.in);

        int atmNumber = 12345;
        int atmPin = 123;

        System.out.println("WELCOME TO ATM");

        System.out.print("Enter ATM Number: ");
        int atmNo = sc.nextInt();

        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        if (atmNo == atmNumber && pin == atmPin) {

            while (true) {
                System.out.println("\n1. Transaction History");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Transfer");
                System.out.println("5. Quit");

                System.out.print("Choose option: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        operations.viewTransactionHistory();
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        operations.withdraw(withdrawAmount);
                        break;
                    case 3:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = sc.nextDouble();
                        operations.deposit(depositAmount);
                        break;
                    case 4:
                        System.out.print("Enter recipient account number: ");
                        int accNo = sc.nextInt();
                        System.out.print("Enter amount to transfer: ");
                        double transferAmount = sc.nextDouble();
                        operations.transfer(accNo, transferAmount);
                        break;
                    case 5:
                        System.out.println("Thank you for using ATM!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice!");
                }
            }

        } else {
            System.out.println("Invalid ATM Number or PIN!");
        }
    }
}
