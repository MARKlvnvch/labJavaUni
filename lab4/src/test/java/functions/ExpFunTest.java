package functions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExpFunTest {

    ExpFun function1;

    @Before
    public void creation() {
        function1 = new ExpFun(1,2, -10, 10);
    }

    @Test
    public void solution1() {
        Assert.assertEquals(3.0,function1.fun(0),0);
    }

}
