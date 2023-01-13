package com.skillsoft.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Execution(ExecutionMode.CONCURRENT)
public class ProductTest {

    Product tv;

    @BeforeEach
    void init(){
        tv = new Product("Diallonic", "Delta", 13423,
                800, "Electronics");
    }

    @Test
    @DisplayName("Brand Name Check")
    @Tag("DEV")
    void brandNameTest() throws InterruptedException{

        Thread.sleep(4000);

        assertEquals("Diallonic",
                tv.getBrandName(),
                "Brand Name Test");
    }

    @Test
    @DisplayName("Price Check")
    @Tag("DEV")
    void priceTest()throws InterruptedException{

        Thread.sleep(3000);

        assertEquals(800,
                tv.getPrice(),
                "Price Test");
    }

    @Test
    @DisplayName("Category Check")
    void categoryTest()throws InterruptedException{

        Thread.sleep(3000);

        assertEquals("Electronics",
                tv.getCategory(),
                "Category Test");
    }

    @Test
    @DisplayName("Model Check")
    @Tag("DEV")
    @Tag("TEST")
    void modelTest()throws InterruptedException{

        Thread.sleep(5000);

        assertEquals("Delta",
                tv.getModel(),
                "Model Test");
    }
}