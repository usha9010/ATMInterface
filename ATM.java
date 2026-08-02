import java.util.Scanner;

public class ATM {

    private Account account;

    public ATM(Account account) {
        this.account = account;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter User ID: ");
        String id = sc.nextLine();

        System.out.print("Enter PIN: ");
        String pin = sc.nextLine();

        if (id.equals(account.getUserId()) && pin.equals(account.getPin())) {

            int choice;

            do {
                System.out.println("\n===== ATM MENU =====");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.print("Enter choice: ");

                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Balance: " + account.getBalance());
                        break;

                    case 2:
                        System.out.print("Enter amount: ");
                        double dep = sc.nextDouble();
                        account.deposit(dep);
                        System.out.println("Deposit Successful");
                        break;

                    case 3:
                        System.out.print("Enter amount: ");
                        double wd = sc.nextDouble();
                        if (account.withdraw(wd))
                            System.out.println("Withdraw Successful");
                        else
                            System.out.println("Insufficient Balance");
                        break;

                    case 4:
                        System.out.println("Thank You!");
                        break;

                    default:
                        System.out.println("Invalid Choice");
                }

            } while (choice != 4);

        } else {
            System.out.println("Invalid User ID or PIN");
        }

        sc.close();
    }
}
