package products;

import Interface.PackageProduct;

import java.util.Objects;

public class PackageWeightProduct extends WeightProduct implements PackageProduct {

    private Package pack;
    private int weight;

    // конструктор названию, описанию и весу
    public PackageWeightProduct(String name, String description, Package pack, int weight) {
        super(name, description);
        this.pack = pack;
        this.weight = weight;
    }

    // конструктор по весовому товару и весу
    public PackageWeightProduct(WeightProduct product, Package pack, int weight) {
        super(product.getName(),product.getDescription());
        this.pack = pack;
        this.weight = weight;
    }

    public Package getPack() {
        return pack;
    }

    public void setPack(Package pack) {
        this.pack = pack;
    }

    @Override
    public int getNetto() {
        return weight;
    }

    @Override
    public int getBrutto() {
        return weight + pack.getWeight();
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PackageWeightProduct that = (PackageWeightProduct) o;
        return weight == that.weight && Objects.equals(pack, that.pack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pack, weight);
    }

    @Override
    public String toString() {
        return "PackageWeightProduct{" +
                "pack=" + pack +
                ", weight=" + weight +
                '}';
    }

}
