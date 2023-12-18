package functions;

import functions.ExpFun;
import functions.LinearFun;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinearFunTest {

    LinearFun function1;

    @Before
    public void creation() {
        function1 = new LinearFun(2,5,-10,10);
    }

    @Test
    public void solution1() {
        Assert.assertEquals(23.0,function1.fun(9),0);
    }

}
