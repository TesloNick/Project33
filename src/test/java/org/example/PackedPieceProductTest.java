package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackedPieceProductTest {

    @Test
    void getnetto() {
        int count = 3;
        PieceProduct productp = new PieceProduct("Груша", "Сладкая и лёгкая", 2);
        ProductPackaging pack = new ProductPackaging("Пищевая плёнка", 1);
        PackedPieceProduct product = new PackedPieceProduct(pack, productp, count);

        assertEquals(6,product.getnetto());
    }

    @Test
    void getbrutto() {
        int count = 3;
        PieceProduct productp = new PieceProduct("Груша", "Сладкая и лёгкая", 2);
        ProductPackaging pack = new ProductPackaging("Пищевая плёнка", 1);
        PackedPieceProduct product = new PackedPieceProduct(pack, productp, count);

        assertEquals(7,product.getbrutto());
    }
}