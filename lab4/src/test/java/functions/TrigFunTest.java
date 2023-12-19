package functions;

import functions.RatFun;
import functions.TrigFun;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TrigFunTest {

    TrigFun function1;

    @Before
    public void creation() {
        function1 = new TrigFun(1,1,-Math.PI, Math.PI);
    }

    @Test
    public void solution1() {
        Assert.assertEquals(1.0,function1.fun(Math.PI/2),0);
    }

    // тест на исключение
    @Test
    public void exception() {
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, ()-> function1.fun(90));
    }

}
