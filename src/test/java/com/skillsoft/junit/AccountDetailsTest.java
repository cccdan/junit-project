package com.skillsoft.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountDetailsTest {

    
    AccountDetails accountDetails;

    @BeforeEach
    void init() {
        accountDetails = new AccountDetails("anita", 114532,
                811481533,5000, "Savings");

        System.out.println("@BeforeEach block has been executed");
        System.out.println("Account balance: " + accountDetails.getBalance());
    }

    @Test
    void depositTest() {
        accountDetails.deposit(500);
        System.out.println("@Test block for deposit has been executed");
    }

    @Test
    void withdrawTest() {
        accountDetails.withdraw(1000);
        System.out.println("@Test for withdraw has been executed");
    }

    @AfterEach
    void balance() {
        System.out.println("@AfterEach has been executed");
        System.out.println("Account balance: " + accountDetails.getBalance());
    }

}