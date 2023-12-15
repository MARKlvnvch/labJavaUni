import products.Package;
import products.PackageWeightProduct;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PackageWeightProductTest {

    private static PackageWeightProduct dumpling;

    @Before
    public void creation() {

        Package dumplingPack = new Package("dumplingPack", 10);
        dumpling = new PackageWeightProduct("dumpling","dumpling with meat", dumplingPack, 11);

    }

    @Test
    public void getNettoWeight() {
        Assert.assertEquals(11, dumpling.getNetto());
    }

    @Test
    public void getBruttoWeight() {
        Assert.assertEquals(21, dumpling.getBrutto());
    }

}
