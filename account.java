package com.guvi;

public class account {
	 private int accountNumber;
	    private double balance;
	    private String accountHolderName;

	    // No-argument constructor
	    public account() {
	        this.accountNumber = 0;
	        this.balance = 0.0;
	        this.accountHolderName = "Unknown";
	    }

	    // Two-argument constructor
	    public account(int accountNumber, String accountHolderName) {
	        this.accountNumber = accountNumber;
	        this.accountHolderName = accountHolderName;
	        this.balance = 0.0;
	    }

	    // Method to deposit money
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposit Successful. New balance: " + balance);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    // Method to withdraw money
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawal Successful. New balance: " + balance);
	        } else if (amount > balance) {
	            System.out.println("Insufficient balance.");
	        } else {
	            System.out.println("Invalid withdrawal amount.");
	        }
	    }

	    // Method to check balance
	    public void checkBalance() {
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Account Holder Name: " + accountHolderName);
	        System.out.println("Current Balance: " + balance);
	    }

	public static void main(String[] args) {
		 // Create an Account object using no-argument constructor
        account account1 = new account();
        account1.checkBalance();
        account1.deposit(1000);
        account1.withdraw(500);
        account1.checkBalance();

        // Create an Account object using two-argument constructor
        account account2 = new account(1234, "John Doe");
        account2.checkBalance();
        account2.deposit(2000);
        account2.withdraw(1000);
        account2.checkBalance();
		

	}

}
