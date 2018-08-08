package com.timbuchalka;

public class bankAccount {
    //creating fields i.e. STATE of the class
    private long accountNumber;
    private long balance;
    private String customerName;
    private String emailAddress;
    private int phoneNumber;

//    public long getAccountNumber(long accountNumber) {
//        return this.accountNumber;
//    }
//    public void setAccountNumber(long accountNumber) {
//        this.accountNumber = accountNumber;
//    }
//
//    public long getBalance(long balance) {
//        return this.balance;
//    }
//    public void setBalance(long balance) {
//        this.balance = balance;
//    }
//
//    public String getCustomerName(String customerName) {
//        return this.customerName;
//    }
//    public void setCustomerName(String customerName) {
//        String validName = customerName.toLowerCase();
//        if (validName.equals("radoslaw")) {
//            this.customerName = customerName;
//        } else {
//            customerName = "Invalid name";
//        }
//    }
//
//    public String getEmailAddress(String emailAddress) {
//        return this.emailAddress;
//    }
//    public void setEmailAddress(String emailAddress) {
//        this.emailAddress = emailAddress;
//    }
//
//    public int getPhoneNumber(int phoneNumber) {
//        return this.phoneNumber;
//    }
//    public void setPhoneNumber(int phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }


    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
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
}