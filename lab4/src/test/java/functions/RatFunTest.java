package functions;

import functions.LinearFun;
import functions.RatFun;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class RatFunTest {

    RatFun function1;
    RatFun function2;

    @Before
    public void creation() {
        function1 = new RatFun(2,2,2,2,-10, 10);
        function2 = new RatFun(2,2,0,0,-10, 10);
    }

    // исключение
    @Test
    public void exception() {
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, ()-> function1.fun(90));
    }

    // знаменатель ноль
    @Test
    public void solution2() {
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, ()-> function2.fun(90));
    }

}
