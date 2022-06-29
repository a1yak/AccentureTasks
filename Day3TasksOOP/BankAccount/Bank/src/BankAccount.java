public class BankAccount {

    private String name;
    private int balance;

    BankAccount() {
        this.balance = 0;
        this.name = "default";
    }

    BankAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public void depositMoney( int amount) {
        if (amount > 5000) {
            System.out.println("Cancelled, maximum limit is 5000, your is " + amount);
        } else {
            this.balance += amount;
        }
    }

    public void withdrawMoney(BankAccount ac, int summ) {
        if (ac.balance < summ) {
            System.out.println("Cancelled, not enough money...");
        } else ac.balance -= summ;
    }

    static public void transferMoney(BankAccount from, BankAccount to, int moneyToTransfer) {

        if (from.getBalance() < moneyToTransfer) {
            System.out.println("Not enough funds on the balance...");
        } else {
            from.withdrawMoney(from,moneyToTransfer);
            to.depositMoney(moneyToTransfer);
            System.out.println("Succesful transfer");
        }
    }

    public void printInfoAboutBankAccount() {
        System.out.println("\nName: " + this.getName() + "\nBalance: " + this.getBalance());
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
}
