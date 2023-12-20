import products.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import products.Package;

public class PackageSetProductTest {

    private static PackageSetProduct snikers;

    @Before
    public void creation() {

        Package pack = new Package("SnikersPack", 1);
        Package bigSnikersPack = new Package("bigSnikersPack", 32);

        WeightProduct classicSnikers = new WeightProduct("classicSnikers", "classicSnikers desc");
        PieceProduct whiteSnikers = new PieceProduct("whiteSnikers","whiteSnikers desc", 87);

        PackageWeightProduct hugeClassicSnikers = new PackageWeightProduct(classicSnikers, pack, 102);
        PackagePieceProduct whiteSnikersis = new PackagePieceProduct(whiteSnikers, pack, 3);

        snikers = new PackageSetProduct("snikers",bigSnikersPack, hugeClassicSnikers, whiteSnikersis);

    }

    @Test
    public void getNetto() {
        Assert.assertEquals(365, snikers.getNetto());
    }

    @Test
    public void getBrutto() {
        Assert.assertEquals(397, snikers.getBrutto());
    }

}
