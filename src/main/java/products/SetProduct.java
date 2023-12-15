package products;

import Interface.PackageProduct;

import java.util.Arrays;
import java.util.Objects;

public class SetProduct {

    private String description;
    private PackageProduct[] setProduct;

    public SetProduct(String description, PackageProduct ...setProduct) {
        this.description = description;
        this.setProduct = setProduct;
    }

    public int getWeight() {
        int sum = 0;
        for (PackageProduct packageProduct : setProduct) {
            sum += packageProduct.getBrutto();
        }
        return sum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PackageProduct[] getSetProduct() {
        return setProduct;
    }

    public void setSetProduct(PackageProduct[] setProduct) {
        this.setProduct = setProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetProduct that = (SetProduct) o;
        return Objects.equals(description, that.description) && Arrays.equals(setProduct, that.setProduct);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(description);
        result = 31 * result + Arrays.hashCode(setProduct);
        return result;
    }

    @Override
    public String toString() {
        return "SetProduct{" +
                "description='" + description + '\'' +
                ", setProduct=" + Arrays.toString(setProduct) +
                '}';
    }
}
