package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        bankAccount personalBankAccount = new bankAccount("1232 2231 2221 0000 5123", 500000, "Radoslaw", "radoslaw.biedrzycki@syncron.com", 795930138);
        bankAccount testingEmptyConstructor = new bankAccount();
        bankAccount anotherTestAccount = new bankAccount("Tim", "TIM@gmail.com", 793013022);

        personalBankAccount.withdrawFunds(1200);
        personalBankAccount.depositFunds(1000);
        personalBankAccount.withdrawFunds(1200);
        personalBankAccount.withdrawFunds(999);

        System.out.println(anotherTestAccount.getAccountNumber());

        VipCustomer vip1 = new VipCustomer();//default
        System.out.println(vip1.getVipName());

        VipCustomer vip2 = new VipCustomer("Tim", "Tim@email.com");
        System.out.println(vip2.getCreditLimit());

        VipCustomer vip3 = new VipCustomer("TIM", "TIM@GMAIL>COM", 10000);
        System.out.println(vip3.getCreditLimit());
    }


}
