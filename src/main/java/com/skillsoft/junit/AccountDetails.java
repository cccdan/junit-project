package com.skillsoft.junit;

public class AccountDetails {
    private String name;
    private Double accountNumber;
    private Integer customerID;
    private Double balance;
    private String accountType;

    public AccountDetails(String name, double accountNumber, Integer customerID, double balance, String accountType) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.customerID = customerID;
        this.balance = balance;
        this.accountType = accountType;
    }


    public String getName() {
        return name;
    }

    public Double getAccountNumber() {
        return accountNumber;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public Double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountNumber(Double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
