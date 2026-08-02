public class Main {

    public static void main(String[] args) {

        Account account = new Account("usha", "1234", 5000);

        ATM atm = new ATM(account);

        atm.start();
    }
}
   