package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        bankAccount personalBankAccount = new bankAccount();
        bankAccount mySecondBankAccount = new bankAccount();
        bankAccount myThirdBankAccount = new bankAccount();

        /*TEST SCENARIO:
        -provide account number
        -provide customer name
        -provide customer email address
        -provide phone number
        -provide initial deposit --> balance
        */

        personalBankAccount.setAccountNumber("1414 2123 0000 2332 2111 2333");
        personalBankAccount.setCustomerName("Radoslaw Biedrzycki");
        personalBankAccount.setEmailAddress("radoslaw.biedrzycki@syncron.com");
        personalBankAccount.setPhoneNumber(795930138);
//        personalBankAccount.setBalance(5000); // setting the initial balance
//        System.out.println(personalBankAccount.getBalance()); // printing the initial balance

        personalBankAccount.withdrawFunds(1200);
        personalBankAccount.depositFunds(1000);
        personalBankAccount.withdrawFunds(1200);
        personalBankAccount.withdrawFunds(999);
    }


}
