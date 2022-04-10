package org.example;

import java.util.Objects;

public class PackedPieceProduct extends PieceProduct implements ProductInterface {
    private int count;
    private ProductPackaging packagep;

    public PackedPieceProduct(ProductPackaging packagep, PieceProduct productp, int count) {
        super(productp.getName(), productp.getDescription(), productp.getWeight());

        this.count = count;
        this.packagep = packagep;
    }

    public int getCount() {
        return count;
    }

    public int getnetto() {
        return count * getWeight();
    }

    public int getbrutto() {
        return count * getWeight() + packagep.getWeight();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PackedPieceProduct product = (PackedPieceProduct) o;
        return count == product.count && Objects.equals(packagep, product.packagep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), count, packagep);
    }

    @Override
    public String toString() {
        return "PackedPieceProduct{" +
                "count=" + count +
                ", packagep=" + packagep +
                '}';
    }
}
