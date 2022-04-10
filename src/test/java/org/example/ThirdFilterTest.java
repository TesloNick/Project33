package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThirdFilterTest {

    @Test
    void apply() {
        String str = "Мама мыла раму";
        ThirdFilter filter1 = new ThirdFilter("раму");
        ThirdFilter filter2 = new ThirdFilter("мяу");
        boolean res1 = filter1.apply(str);
        boolean res2 = filter2.apply(str);

        assertEquals(true, res1);
        assertEquals(false, res2);
    }
}