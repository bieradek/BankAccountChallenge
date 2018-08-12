package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        bankAccount personalBankAccount = new bankAccount("1232 2231 2221 0000 5123", 500000, "Radoslaw", "radoslaw.biedrzycki@syncron.com", 795930138);
        bankAccount testingEmptyConstructor = new bankAccount();

        System.out.println(testingEmptyConstructor.getPhoneNumber());
        personalBankAccount.withdrawFunds(1200);
        personalBankAccount.depositFunds(1000);
        personalBankAccount.withdrawFunds(1200);
        personalBankAccount.withdrawFunds(999);
    }


}
