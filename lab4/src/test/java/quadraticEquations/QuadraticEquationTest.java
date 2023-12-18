package quadraticEquations;

import org.example.QuadraticEquation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuadraticEquationTest {

    QuadraticEquation equation1;
    QuadraticEquation equation2;

    @Before
    public void creation() {
        equation1 = new QuadraticEquation(1,-2,1);
        equation2 = new QuadraticEquation(1,2,-15);
    }

    @Test
    public void solution1() {
        Assert.assertTrue(equation1.solve().contains(1.0));
    }

    @Test
    public void solution2() {
        Assert.assertTrue(equation2.solve().contains(-5.0));
        Assert.assertTrue(equation2.solve().contains(3.0));
    }

}
