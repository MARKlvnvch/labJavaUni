import products.Package;
import products.PackagePieceProduct;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PackagePieceProductTest {

    private static PackagePieceProduct dumpling;

    @Before
    public void creation() {

        Package dumplingPack = new Package("dumplingPack", 10);
        dumpling = new PackagePieceProduct("dumpling","dumpling with berry", 10,  dumplingPack, 100);

    }

    @Test
    public void getNettoWeight() {
        Assert.assertEquals(1000, dumpling.getNetto());
    }

    @Test
    public void getBruttoWeight() {
        Assert.assertEquals(1010, dumpling.getBrutto());
    }

}
