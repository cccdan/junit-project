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

    }



    @Test
    public void validateName() {
        assertTrue(accountDetails.getName().matches("^[a-zA-Z]*$"));
    }

    @Test
    public void validateBalance() {
        assertTrue(accountDetails.getBalance() >= 0);
    }

}