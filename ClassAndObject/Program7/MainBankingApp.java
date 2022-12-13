// Write a java program to create banking application to perform following using using class and
// object?
// a) Initialize with initial balance Rs 3000
// b) Deposit amount if balance is more than 1000 otherwise take Rs 100 as penalty for
// deposit
// c) Withdraw amount if balance is more than 1000 otherwise alert user for low balance
// d) check for balance
public class MainBankingApp {
    public static void main(String[] args) {
        BankingApp b = new BankingApp();
        b.deposit(1000);
        b.withdraw(1000);
        b.checkBalance();

    }
}
