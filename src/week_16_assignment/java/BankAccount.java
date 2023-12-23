package week_16_assignment.java;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private final List<String> transactionHistory;
    private double balance;

    public BankAccount(){
        this.balance = 0.0;
        transactionHistory = new ArrayList<>();
    }

    public void deposit(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Deposit amount can not be zero or negative ");
        }

        balance += amount;
        transactionHistory.add("Deposited: $" + amount);
    }

    public void withdraw(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Withdraw amount can not be zero or negative ");

        }
        if(amount > balance){
            throw new IllegalArgumentException("Insufficient Funds");
        }

        balance -= amount;
        transactionHistory.add("Withdraw: $" +amount);
    }

    public String getAccountHistory(){
        return String.join("\n", transactionHistory);
    }

    public double getBalance() {
        return balance;
    }


}
