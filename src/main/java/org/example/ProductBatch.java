package org.example;

import java.util.Arrays;
import java.util.Objects;

public class ProductBatch {
    private String description;
    private ProductInterface[] array;

    ProductBatch(ProductInterface[] inter, String description) {
        this.array = inter;
    }

    public int getWeightBatch() {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count += array[i].getbrutto();
        }
        return count;
    }

    public String getDescription() {
        return description;
    }

    public ProductInterface[] getArray() {
        return array;
    }
}
