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

    @Before
    public void creation() {

        Package pack = new Package("pack", 1);

        Product chocolate = new Product("chocolate", "simple chocolate");

        WeightProduct darkChocolate = new WeightProduct("darkChocolate", "weight darkChocolate");
        PieceProduct milkChocolate = new PieceProduct("milkChocolate", "weight milkChocolate", 10);
        PieceProduct chocolateWithNuts = new PieceProduct(chocolate, 10);

        PackageWeightProduct darkChocolateInPack = new PackageWeightProduct(darkChocolate, pack, 100);
        PackagePieceProduct milkChocolateInPack = new PackagePieceProduct(milkChocolate, pack, 10);
        PackagePieceProduct chocolateWithNutsInPack = new PackagePieceProduct(chocolateWithNuts, pack, 999);

        PackageSetProduct boxWithChocolate = new PackageSetProduct("boxWithChocolate", pack, darkChocolateInPack, milkChocolateInPack, chocolateWithNutsInPack);

        set1 = new SetProduct("set of package products", darkChocolateInPack, milkChocolateInPack, chocolateWithNutsInPack);
        set2 = new SetProduct("set with SetProductPackage", boxWithChocolate, darkChocolateInPack, milkChocolateInPack, chocolateWithNutsInPack);
        set3 = new SetProduct("set of darkChocolateInPack", darkChocolateInPack, darkChocolateInPack);

        filterLength = new CheckLengthFilter();
        filterEnters = new CheckEntersFilter();

    }


    @Test
    public void countByFilter() {
        Assert.assertEquals(1, ServiceProduct.countByFilter(set1, filterLength));
        Assert.assertEquals(0, ServiceProduct.countByFilter(set1, filterEnters));
    }

    @Test
    public void countByFilterDeep() {
        Assert.assertEquals(2, ServiceProduct.countByFilterDeep(set2, filterLength));
        Assert.assertEquals(0, ServiceProduct.countByFilterDeep(set2, filterEnters));
    }

    @Test
    public void checkAllWeighted() {
        Assert.assertFalse(ServiceProduct.checkAllWeighted(set1));
        Assert.assertFalse(ServiceProduct.checkAllWeighted(set2));
        Assert.assertTrue(ServiceProduct.checkAllWeighted(set3));
    }

}
