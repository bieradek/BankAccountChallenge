package com.timbuchalka;

public class bankAccount {
    //creating fields i.e. STATE of the class
    private String accountNumber;
    private long balance;
    private String customerName;
    private String emailAddress;
    private int phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

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

    public void depositFunds(int funds) {
        this.balance = balance + funds;
    }

    public void withdrawFunds(int funds) {
        if (balance < funds) {
            System.out.println("Insufficient funds");
        } else {
            this.balance = balance - funds;
        }
    }
}