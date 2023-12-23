package functions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ExpFunTest {

    ExpFun function1;

    @Before
    public void creation() {
        function1 = new ExpFun(1,2, -10, 10);
    }

    // нулевая степень
    @Test
    public void solution1() {
        Assert.assertEquals(3.0,function1.fun(0),0);
    }

    // исключение
    @Test
    public void exception() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> function1.fun(90));
    }

    // когда степень не нулевая
    @Test
    public void solution2() {
        Assert.assertEquals(9.3,function1.fun(2),1);
    }

}
