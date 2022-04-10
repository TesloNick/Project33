package org.example;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @org.junit.jupiter.api.Test
    void getName() {
        Product product = new Product("Apple", "green or red");
        assertEquals("Apple",product.getName());
    }

    @org.junit.jupiter.api.Test
    void getDescription() {
        Product product = new Product("Apple", "green or red");
        assertEquals("green or red",product.getDescription());
    }
}