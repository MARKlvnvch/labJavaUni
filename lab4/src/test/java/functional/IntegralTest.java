package functional;

import functional.Integral;
import functional.Segment;
import functions.ExpFun;
import functions.LinearFun;
import functions.RatFun;
import functions.TrigFun;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntegralTest {

    LinearFun function1;
    ExpFun function2;
    RatFun function3;
    TrigFun function4;

    Integral<LinearFun> integral1;
    Integral<ExpFun> integral2;
    Integral<RatFun> integral3;
    Integral<TrigFun> integral4;

    @Before
    public void creation() {

        function1 = new LinearFun(2,5,-10,10);
        function2 = new ExpFun(0,1, -10, 10);
        function3 = new RatFun(2,2,2,2,-10, 10);
        function4 = new TrigFun(1,1,-Math.PI, Math.PI);

        integral1 = new Integral<LinearFun>(1,-10, 10);
        integral2 = new Integral<ExpFun>(1,-10, 10);
        integral3 = new Integral<RatFun>(1,-10, 10);
        integral4 = new Integral<TrigFun>(1,-Math.PI, Math.PI);

    }

    @Test
    public void solution1() {
        Assert.assertEquals(100.0, integral1.fun(function1),0);
        Assert.assertEquals(20.0, integral2.fun(function2),0);
        Assert.assertEquals(20.0, integral3.fun(function3),0);
        Assert.assertEquals(0.0, integral4.fun(function4),0);
    }

}
