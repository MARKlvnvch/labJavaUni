import org.example.*;
import org.example.Package;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PackageSetProductTest {

    private static PackageSetProduct nigers;

    @Before
    public void creation() {

        Package pack = new Package("NigersPack", 1);
        Package bigNiggersPack = new Package("BigNiggersPack", 32);

        WeightProduct Michal = new WeightProduct("Michal", "sad niger");
        PieceProduct John = new PieceProduct("John","bad nigger", 87);

        PackageWeightProduct fatMichal = new PackageWeightProduct(Michal, pack, 102);
        PackagePieceProduct Johns = new PackagePieceProduct(John, pack, 3);

        nigers = new PackageSetProduct("nigers",bigNiggersPack, fatMichal, Johns);

    }

    @Test
    public void getNetto() {
        Assert.assertEquals(365, nigers.getNetto());
    }

    @Test
    public void getBrutto() {
        Assert.assertEquals(397, nigers.getBrutto());
    }

}
