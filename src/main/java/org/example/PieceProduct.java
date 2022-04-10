package org.example;

import java.util.Objects;

public class PieceProduct extends Product {
    private int weight;

    public int getWeight() {
        return weight;
    }

    public PieceProduct(String name, String description, int weight) {
        super(name, description);
        this.weight = weight;
    }

    /*public PieceProduct(PieceProduct product) {
        super(product);
        weight = product.getWeight();
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PieceProduct that = (PieceProduct) o;
        return weight == that.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight);
    }

    @Override
    public String toString() {
        return "PieceProduct{" + "weight=" + weight + '}';
        //return String.format("Товар %s %fкг (%s)", getName(), getWeight(), getDescription());
    }
}
