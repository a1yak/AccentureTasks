import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean toExit = false;
        int choise;
        while (!toExit) {
            System.out.println("Select function  1.Create account   2.Deposit money  3.Withdraw money  4.Transfer money  5.See account information  6.Show all accounts  7.exit");
            choise = sc.nextInt();
            switch (choise) {
                case 1 -> accounts.add(createAccount());
                case 2 -> deposit(accounts);
                case 3 -> withdraw(accounts);
                case 4 -> transferFunds(accounts);
                case 5 -> accInfo(accounts);
                case 6 -> printAll(accounts);
                case 7 -> toExit = true;
                default -> System.out.println("Wrong input...");
            }
        }

    }

    static int findUser(ArrayList<BankAccount> accounts) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        int userId =0;
        String accountName = sc.nextLine();
        for (BankAccount acc : accounts) {
            if (accountName == acc.getName()) {
                sc.close();
                userId = accounts.indexOf(acc);
            }
        }
        return userId;
    }

    static void deposit(ArrayList<BankAccount> accounts) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of money to deposit");
        int amountToDeposit = sc.nextInt();
        accounts.get(findUser(accounts)).depositMoney(amountToDeposit);
    }

    static void withdraw(ArrayList<BankAccount> accounts) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of money to withdraw");
        int amountToWithdraw = sc.nextInt();
        accounts.get(findUser(accounts)).withdrawMoney(accounts.get(findUser(accounts)),amountToWithdraw);

    }

    static void accInfo(ArrayList<BankAccount> accounts) {
        accounts.get(findUser(accounts)).printInfoAboutBankAccount();
    }

    static void transferFunds(ArrayList<BankAccount> accounts) {
        Scanner sc = new Scanner(System.in);
        printAll(accounts);
        System.out.println("Sender:");
        BankAccount sender =  accounts.get(findUser(accounts));
        System.out.println("Receiver:");
        BankAccount receiver =  accounts.get(findUser(accounts));
        System.out.println("How much money you want to transfer: ");
        BankAccount.transferMoney(sender, receiver, sc.nextInt());
    }

    static void printAll(ArrayList<BankAccount> accounts) {
        System.out.println("List of all available accounts:\n");
        for (BankAccount acc : accounts) {
            acc.printInfoAboutBankAccount();
        }
    }

    static BankAccount createAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your starting deposit:");
        int balance = sc.nextInt();
        return new BankAccount(name, balance);
    }
}