package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackedWeightProductTest {

    @Test
    void netto() {
        WeightProduct productw = new WeightProduct("Мука", "Белая и рассыпчатая");
        ProductPackaging pack = new ProductPackaging("Бумажный пакет", 1);
        PackedWeightProduct product = new PackedWeightProduct(pack, productw, 999);

        assertEquals(999, product.getnetto());
    }

    @Test
    void brutto() {
        WeightProduct productw = new WeightProduct("Мука", "Белая и рассыпчатая");
        ProductPackaging pack = new ProductPackaging("Бумажный пакет", 1);
        PackedWeightProduct product = new PackedWeightProduct(pack, productw, 999);

        assertEquals(1000, product.getbrutto());
    }
}