import products.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import products.Package;

public class SetProductTest {

    private static SetProduct nigers;

    @Before
    public void creation() {

        Package pack = new Package("NigersPack", 1);

        WeightProduct Michal = new WeightProduct("Michal", "sad niger");
        PieceProduct John = new PieceProduct("John","bad nigger", 87);

        PackageWeightProduct fatMichal = new PackageWeightProduct(Michal, pack, 102);
        PackagePieceProduct Johns = new PackagePieceProduct(John, pack, 3);

        nigers = new SetProduct("family niggers", fatMichal, Johns);

    }

    @Test
    public void getWeight() {
        Assert.assertEquals(365, nigers.getWeight());
    }

}
