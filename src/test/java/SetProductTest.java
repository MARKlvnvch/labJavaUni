import products.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import products.Package;

public class SetProductTest {

    private static SetProduct snikers;

    @Before
    public void creation() {

        Package pack = new Package("SnikersPack", 1);

        WeightProduct whiteSnikers = new WeightProduct("whiteSnikers", "blueSnikers tasty");
        PieceProduct blueSnikers = new PieceProduct("blueSnikers","blueSnikers tasty", 87);

        PackageWeightProduct PackageWhiteSnikers = new PackageWeightProduct(whiteSnikers, pack, 102);
        PackagePieceProduct PackageBlueSnikers = new PackagePieceProduct(blueSnikers, pack, 3);

        snikers = new SetProduct("set Snikersis", PackageBlueSnikers, PackageWhiteSnikers);

    }

    @Test
    public void getWeight() {
        Assert.assertEquals(365, snikers.getWeight());
    }

}
