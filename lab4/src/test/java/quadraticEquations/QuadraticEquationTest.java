package quadraticEquations;

import org.example.QuadraticEquation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class QuadraticEquationTest {

    QuadraticEquation equation1;
    QuadraticEquation equation2;
    QuadraticEquation equation3;
    QuadraticEquation equation4;
    QuadraticEquation equation5;

    @Before
    public void creation() {
        equation1 = new QuadraticEquation(1,-2,1);
        equation2 = new QuadraticEquation(1,2,-15);
        equation3 = new QuadraticEquation(1,1,100);
        equation4 = new QuadraticEquation(1,1,999);
        equation5 = new QuadraticEquation(1,-9,20);
    }

    // 1 корень
    @Test
    public void solution1() {
        List<Double> list = new ArrayList<>();
        list.add(1.0);
        Assert.assertEquals(list, equation1.solve());
    }

    // 2 корня
    @Test
    public void solution2() {
        List<Double> list = new ArrayList<>();
        list.add(3.0);
        list.add(-5.0);
        Assert.assertEquals(list, equation2.solve());
    }

    @Test
    public void solution5() {
        List<Double> list = new ArrayList<>();
        list.add(5.0);
        list.add(4.0);
        Assert.assertEquals(list, equation5.solve());
    }

    // нет корней
    @Test
    public void solution3() {
        List<Double> list = new ArrayList<>();
        Assert.assertEquals(list, equation3.solve());
    }

    @Test
    public void solution4() {
        List<Double> list = new ArrayList<>();
        Assert.assertEquals(list, equation4.solve());
    }

}
