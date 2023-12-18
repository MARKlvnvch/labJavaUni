package functions;

import functions.LinearFun;
import functions.RatFun;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RatFunTest {

    RatFun function1;

    @Before
    public void creation() {
        function1 = new RatFun(2,2,2,2,-10, 10);
    }

    @Test
    public void solution1() {
        Assert.assertEquals(1.0,function1.fun(7),0);
    }

}
