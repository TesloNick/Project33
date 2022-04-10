package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondFilterTest {

    @Test
    void apply() {
        String str = "Мама мыла раму";
        SecondFilter filter1 = new SecondFilter("раму");
        SecondFilter filter2 = new SecondFilter("мяу");
        boolean res1 = filter1.apply(str);
        boolean res2 = filter2.apply(str);

        assertEquals(true, res1);
        assertEquals(false, res2);
    }
}