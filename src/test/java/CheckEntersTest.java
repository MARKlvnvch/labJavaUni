import products.CheckEntersFilter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CheckEntersTest {
    private static CheckEntersFilter filter;

    @Before
    public void creation() {
        filter = new CheckEntersFilter();
    }

    @Test
    public void checkEqualsTrue() {
        Assert.assertTrue(filter.apply("word "));
    }

    @Test
    public void checkEqualsFalse() {
        Assert.assertFalse(filter.apply("word"));
    }

}
