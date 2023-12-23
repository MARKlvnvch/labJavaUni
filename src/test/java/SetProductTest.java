import products.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import products.Package;

public class SetProductTest {

    private static SetProduct pencils;

    @Before
    public void creation() {

        Package pack = new Package("pencilPack", 1);

        WeightProduct simplePencil = new WeightProduct("simplePencil", "weight simplePencil");
        PieceProduct colorPencil = new PieceProduct("colorPencil","piece colorPencil", 87);

        PackageWeightProduct simplePencilInPack = new PackageWeightProduct(simplePencil, pack, 102);
        PackagePieceProduct colorPencilInPack = new PackagePieceProduct(colorPencil, pack, 3);

        pencils = new SetProduct("set of pencils", colorPencilInPack, simplePencilInPack);

    }

    @Test
    public void getWeight() {
        Assert.assertEquals(365, pencils.getWeight());
    }

}
