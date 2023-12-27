package functions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class RatFunTest {

    RatFun function1;
    RatFun function2;
    RatFun function3;

    @Before
    public void creation() {
        function1 = new RatFun(2,2,2,2,-10, 10);
        function2 = new RatFun(2,2,0,0,-10, 10);

        function3 = new RatFun(2,2,4,4,-10, 10);

    }

    @Test
    public void solution1() {
        Assert.assertEquals(0.5,function3.fun(1),0);
    }

    // исключение
    @Test
    public void exception() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> function1.fun(90));
    }

    // знаменатель ноль
    @Test
    public void solution2() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> function2.fun(90));
    }

}
