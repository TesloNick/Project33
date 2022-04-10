package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductBatchTest {

    @Test
    void getWeightBatch() {

        ProductInterface[] array = new ProductInterface[5];
        int count = 3, count2 = 5;

        PieceProduct productp = new PieceProduct("Груша", "Сладкая и лёгкая", 2);
        ProductPackaging packp1 = new ProductPackaging("Пищевая плёнка", 1);
        array[0] = new PackedPieceProduct(packp1, productp, count);

        PieceProduct productp2 = new PieceProduct("Яблоко", "Маленькое и вкусное", 3);
        ProductPackaging packp2 = new ProductPackaging("Коробка", 2);
        array[1] = new PackedPieceProduct(packp2, productp2, count2);

        WeightProduct productw1 = new WeightProduct("Мука", "Белая и рассыпчатая");
        ProductPackaging pack = new ProductPackaging("Бумажный пакет", 1);
        array[2] = new PackedWeightProduct(pack, productw1, 9);

        WeightProduct productw2 = new WeightProduct("Сахар", "Белая и сладкая");
        ProductPackaging pack2 = new ProductPackaging("Пакет", 2);
        array[3] = new PackedWeightProduct(pack2, productw2, 12);

        WeightProduct productw3 = new WeightProduct("Соль", "Белая и солёная");
        ProductPackaging pack3 = new ProductPackaging("Бумажный пакет", 3);
        array[4] = new PackedWeightProduct(pack3, productw3, 11);


        ProductBatch batch = new ProductBatch(array, "Первая партия");
        assertEquals(62, batch.getWeightBatch());
    }


}