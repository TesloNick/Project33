package org.example;

public class ProductService {
    public int countByFilter(ProductBatch batch, FilterInterface Filter) {

        int count = 0;

        for (int i = 0; i < batch.getArray().length; i++) {
            if (Filter.apply(batch.getArray()[i].getName())) {
                count++;
            }
        }

        return count;
    }
}
