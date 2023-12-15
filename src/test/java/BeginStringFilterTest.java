import products.BeginStringFilter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BeginStringFilterTest {

    private static String str;
    private static BeginStringFilter filter1;
    private static BeginStringFilter filter2;

    @Before
    public void creation() {

        str = "Мама мыла раму";

        filter1 = new BeginStringFilter("Мама");
        filter2 = new BeginStringFilter("мыла");

    }

    @Test
    public void checkEqualsTrue() {
        Assert.assertTrue(filter1.apply(str));
    }

    @Test
    public void checkEqualsFalse() {
        Assert.assertFalse(filter2.apply(str));
    }

}
