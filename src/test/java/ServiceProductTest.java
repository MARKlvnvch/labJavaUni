import org.example.*;
import org.example.Package;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ServiceProductTest {

    private static SetProduct set1;
    private static SetProduct set2;
    private static CheckLengthFilter filterLength;
    private static CheckEntersFilter filterEnters;
    private static PackageSetProduct setWeightPackage;
    private static PackageSetProduct gunsPackage;

    @Before
    public void creation() {

        Package pack = new Package("pack", 1);

        Product smallGun = new Product("small gun", "dirty small gun");

        WeightProduct gun = new WeightProduct("gun", "simple gun");
        PieceProduct shotgun = new PieceProduct("shotgun", "simple shotguns", 10);
        PieceProduct uzi = new PieceProduct(smallGun, 10);

        PackageWeightProduct gunInPack = new PackageWeightProduct(gun, pack, 100);
        PackagePieceProduct shotgunInPack = new PackagePieceProduct(shotgun, pack, 10);
        PackagePieceProduct uziInPack = new PackagePieceProduct(uzi, pack, 999);

        gunsPackage = new PackageSetProduct("gunsPackage",pack, gunInPack, shotgunInPack, uziInPack);
        setWeightPackage = new PackageSetProduct("setWeightPackage",pack, gunInPack);

        set1 = new SetProduct("set guns", gunInPack, shotgunInPack, uziInPack);
        set2 = new SetProduct("set2 guns", gunsPackage, gunInPack, shotgunInPack, uziInPack);

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
        Assert.assertEquals(1, ServiceProduct.countByFilterDeep(set2, filterEnters));
    }

    @Test
    public void checkAllWeighted() {
        Assert.assertEquals(true, ServiceProduct.checkAllWeighted(setWeightPackage));
        Assert.assertEquals(false, ServiceProduct.checkAllWeighted(gunsPackage));
    }

}
