package com.timbuchalka;

public class bankAccount {
    //creating fields i.e. STATE of the class
    private String accountNumber;
    private long balance;
    private String customerName;
    private String emailAddress;
    private int phoneNumber;

    public bankAccount() {
        this("0000 0000 0000 0000", 0, "Unknown Name", "unknown.email@address.com", 123);
        System.out.println("Empty constructor called");
    }

    public bankAccount(String accountNumber, long balance, String customerName, String emailAddress, int phoneNumber) {
        System.out.println("Account constructor with parameters called");
        //this.accountNumber = accountNumber; << this approach is better because it guarantees that line will be executed
        setAccountNumber(accountNumber);
        this.balance = balance;
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public bankAccount(String customerName, String emailAddress, int phoneNumber) {
        this("DEFAULT ACCOUTN NUMBER", 500000, customerName, emailAddress, phoneNumber);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(int depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. Current balance = " + this.balance);
    }

    public void withdrawFunds(int withdrawalAmount) {
        if (this.balance <= withdrawalAmount) {
            System.out.println("Insufficient funds. Only " + this.balance + " funds available. Withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " amount successful. Remaining amount: " + this.balance);
        }
    }
}