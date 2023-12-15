import products.EqualsFirstFilter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EqualsFirstFilterTest {

    private static String str;
    private static EqualsFirstFilter filter1;
    private static EqualsFirstFilter filter2;

    @Before
    public void creation() {

        str = "Мама мыла раму";

        filter1 = new EqualsFirstFilter("Мама");
        filter2 = new EqualsFirstFilter("Папа");

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
