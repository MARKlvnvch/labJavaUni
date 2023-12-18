package functional;

import functional.Segment;
import functions.ExpFun;
import functions.LinearFun;
import functions.RatFun;
import functions.TrigFun;
import org.example.QuadraticEquation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SegmentTest {

    LinearFun function1;
    ExpFun function2;
    RatFun function3;
    TrigFun function4;

    Segment<LinearFun> segment1;
    Segment<ExpFun> segment2;
    Segment<RatFun> segment3;
    Segment<TrigFun> segment4;

    @Before
    public void creation() {

        function1 = new LinearFun(2,5,-10,10);
        function2 = new ExpFun(0,1, -10, 10);
        function3 = new RatFun(2,2,2,2,-10, 10);
        function4 = new TrigFun(1,1,-Math.PI, Math.PI);

        segment1 = new Segment<LinearFun>();
        segment2 = new Segment<ExpFun>();
        segment3 = new Segment<RatFun>();
        segment4 = new Segment<TrigFun>();


    }

    @Test
    public void solution1() {
        Assert.assertEquals(15.0, segment1.fun(function1),0);
        Assert.assertEquals(3.0, segment2.fun(function2),0);
        Assert.assertEquals(3.0, segment3.fun(function3),0);
        Assert.assertEquals(0.0, segment4.fun(function4),0);
    }

}
