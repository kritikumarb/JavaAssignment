// Write a java program to create banking application to perform following using using class and
// object?
// a) Initialize with initial balance Rs 3000
// b) Deposit amount if balance is more than 1000 otherwise take Rs 100 as penalty for
// deposit
// c) Withdraw amount if balance is more than 1000 otherwise alert user for low balance
// d) check for balance
public class BankingApp {
    double balance;
    public BankingApp(){
        this.balance = 3000;
    }
    public void deposit(double amount){
        if(balance > 1000){
            balance += amount;
            System.out.println("Balance: " + balance);
        }else{
            balance -= 100;
            balance += amount;
            System.out.println("Balance: " + balance);
        }
    }
    public void withdraw(double amount){
        if(balance > 1000){
            balance -= amount;
            System.out.println("Balance: " + balance);
        }else{
            System.out.println("Low Balance");
        }
    }
    public void checkBalance(){
        System.out.println("Balance: " + balance);
    }
}
