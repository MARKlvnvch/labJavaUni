package products;

import Interface.PackageProduct;

import java.util.Objects;

public class PackagePieceProduct extends PieceProduct implements PackageProduct {


    private Package pack;
    private int count;

    // конструктор по названию, описанию, упаковке, весу и количеству
    public PackagePieceProduct(String name, String description, int weight, Package pack, int count) {
        super(name, description, weight);
        this.pack = pack;
        this.count = count;
    }

    // конструктор по штучному товару, упаковке и весу
    public PackagePieceProduct(PieceProduct product, Package pack, int count) {
        super(product.getName(), product.getDescription(), product.getWeight());
        this.pack = pack;
        this.count = count;
    }

    public Package getPack() {
        return pack;
    }

    public void setPack(Package pack) {
        this.pack = pack;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int getNetto() {
        return getWeight()*count;
    }

    @Override
    public int getBrutto() {
        return getWeight()*count + pack.getWeight();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PackagePieceProduct that = (PackagePieceProduct) o;
        return count == that.count && Objects.equals(pack, that.pack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pack, count);
    }

    @Override
    public String toString() {
        return "PackagePieceProduct{" +
                "pack=" + pack +
                ", count=" + count +
                '}';
    }

}
