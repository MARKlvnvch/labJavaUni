package products;

import Interface.PackageProduct;

import java.util.Arrays;
import java.util.Objects;

public class PackageSetProduct implements PackageProduct {

    private String name;
    private Package pack;
    private PackageProduct[] setProduct;

    // конструктор по массиву товаров, описанию и упаковке
    public PackageSetProduct(String name, Package pack, PackageProduct ...setProduct) { //varArgs
        this.name = name;
        this.setProduct = setProduct;
        this.pack = pack;
    }

    @Override
    public int getNetto() {
        int sum = 0;
        for (PackageProduct packageProduct : setProduct) {
            sum += packageProduct.getBrutto();
        }
        return sum;
    }

    @Override
    public int getBrutto() {
        int sum = 0;
        for (PackageProduct packageProduct : setProduct) {
            sum += packageProduct.getBrutto();
        }
        return sum + pack.getWeight();
    }

    public Package getPack() {
        return pack;
    }

    public void setPack(Package pack) {
        this.pack = pack;
    }

    public PackageProduct[] getSetProduct() {
        return setProduct;
    }

    public void setSetProduct(PackageProduct[] setProduct) {
        this.setProduct = setProduct;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PackageSetProduct that = (PackageSetProduct) o;
        return Objects.equals(name, that.name) && Objects.equals(pack, that.pack) && Arrays.equals(setProduct, that.setProduct);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, pack);
        result = 31 * result + Arrays.hashCode(setProduct);
        return result;
    }

    @Override
    public String toString() {
        return "PackageSetProduct{" +
                "name='" + name + '\'' +
                ", pack=" + pack +
                ", setProduct=" + Arrays.toString(setProduct) +
                '}';
    }
}
