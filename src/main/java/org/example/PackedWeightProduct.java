package org.example;

import java.util.Objects;

public class PackedWeightProduct extends WeightProduct implements ProductInterface {
    private int weight;
    private ProductPackaging packagew;

    public PackedWeightProduct(ProductPackaging packagew, WeightProduct productw, int weight) {
        super(productw.getName(), productw.getDescription());

        this.packagew = packagew;
        this.weight = weight;
    }

    public int getnetto() {
        return weight;
    }

    public int getbrutto() {
        return weight + packagew.getWeight();
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PackedWeightProduct product = (PackedWeightProduct) o;
        return weight == product.weight && Objects.equals(packagew, product.packagew);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight, packagew);
    }

    @Override
    public String toString() {
        return "PackedWeightProduct{" +
                "weight=" + weight +
                ", packagew=" + packagew +
                '}';
    }
}
