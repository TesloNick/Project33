package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeginStringFilterTest {

    @Test
    void apply() {
        String str = "Мама мыла раму";
        BeginStringFilter filter1 = new BeginStringFilter("Мама");
        BeginStringFilter filter2 = new BeginStringFilter("мыла");
        boolean res1 = filter1.apply(str); // результат — true
        boolean res2 = filter2.apply(str); // результат — false

        assertEquals(true, res1);
        assertEquals(false, res2);
    }
}