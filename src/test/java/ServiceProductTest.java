import products.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import products.Package;

public class ServiceProductTest {

    private static SetProduct set1;
    private static SetProduct set2;
    private static SetProduct set3;
    private static CheckLengthFilter filterLength;
    private static CheckEntersFilter filterEnters;
    private static PackageSetProduct setWeightPackage;
    private static PackageSetProduct bananasPackage;

    @Before
    public void creation() {

        Package pack = new Package("pack", 1);

        Product smallBananas = new Product("small Bananas", "dirty small gun");

        WeightProduct bananas = new WeightProduct("Bananas", "simple gun");
        PieceProduct blackBananas = new PieceProduct("blackBananas", "simple shotguns", 10);
        PieceProduct greenBananas = new PieceProduct(smallBananas, 10);

        PackageWeightProduct bananasInPack = new PackageWeightProduct(bananas, pack, 100);
        PackagePieceProduct blackBananasInPack = new PackagePieceProduct(blackBananas, pack, 10);
        PackagePieceProduct greenBananasInPack = new PackagePieceProduct(greenBananas, pack, 999);

        bananasPackage = new PackageSetProduct("gunsPackage", pack, bananasInPack, blackBananasInPack, greenBananasInPack);
        setWeightPackage = new PackageSetProduct("setWeightPackage",pack, bananasInPack);

        set1 = new SetProduct("set guns", bananasInPack, blackBananasInPack, greenBananasInPack);
        set2 = new SetProduct("set2 guns", bananasPackage, bananasInPack, blackBananasInPack, greenBananasInPack);
        set3 = new SetProduct("set2 guns", bananasInPack, bananasInPack);

        filterLength = new CheckLengthFilter();
        filterEnters = new CheckEntersFilter();

    }


    @Test
    public void countByFilter() {
        Assert.assertEquals(2, ServiceProduct.countByFilter(set1, filterLength));
        Assert.assertEquals(1, ServiceProduct.countByFilter(set1, filterEnters));
    }

    @Test
    public void countByFilterDeep() {
        Assert.assertEquals(3, ServiceProduct.countByFilterDeep(set2, filterLength));
        Assert.assertEquals(2, ServiceProduct.countByFilterDeep(set2, filterEnters));
    }

    @Test
    public void checkAllWeighted() {
        Assert.assertFalse(ServiceProduct.checkAllWeighted(set1));
        Assert.assertFalse(ServiceProduct.checkAllWeighted(set2));
        Assert.assertTrue(ServiceProduct.checkAllWeighted(set3));
        System.out.println(set3.getSetProduct().length);
    }

}