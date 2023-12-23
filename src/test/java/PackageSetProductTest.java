import products.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import products.Package;

public class PackageSetProductTest {

    private static PackageSetProduct fruits;

    @Before
    public void creation() {

        Package pack = new Package("pack", 1);
        Package bigFruitsPack = new Package("bigFruitsPack", 32);

        WeightProduct apple = new WeightProduct("apple", "red apple");
        PieceProduct pineapple = new PieceProduct("pineapple","yellow pineapple", 87);

        PackageWeightProduct boxWithApple = new PackageWeightProduct(apple, pack, 102);
        PackagePieceProduct boxWithPineapple = new PackagePieceProduct(pineapple, pack, 3);

        fruits = new PackageSetProduct("fruits",bigFruitsPack, boxWithApple, boxWithPineapple);

    }

    @Test
    public void getNetto() {
        Assert.assertEquals(365, fruits.getNetto());
    }

    @Test
    public void getBrutto() {
        Assert.assertEquals(397, fruits.getBrutto());
    }

}
