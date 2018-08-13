package com.timbuchalka;

public class VipCustomer {
    /*
    creating a state of the class i.e. initial parameters, characteristics
     */
    private String vipName;
    private String vipEmailAddress;
    private double creditLimit;

    //Before creating other constructors we need to create a basic one(FULL) with all fields included:
    public VipCustomer(String vipName, String vipEmailAddress, double creditLimit) {
        this.vipName = vipName;
        this.vipEmailAddress = vipEmailAddress;
        this.creditLimit = creditLimit;
    }

    //creating 1st empty constuctor:
    public VipCustomer() {
        this("John Doe", "John.Doe@gmail.com", 5000);
        System.out.println("Empty constructor called");
    }

    public VipCustomer(String vipName, String vipEmailAddress) {
        this(vipName, vipEmailAddress, 5000);
        System.out.println("Constructor with default creditLimit called");
    }

    public String getVipName() {
        return vipName;
    }

    public String getVipEmailAddress() {
        return vipEmailAddress;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}


