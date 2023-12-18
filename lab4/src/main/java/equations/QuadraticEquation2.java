package equations;

import org.example.QuadraticEquation;

import java.util.Collections;
import java.util.List;

public class QuadraticEquation2 {

    public static double getLargestRoot(QuadraticEquation equation) {

        List<Double> roots = equation.solve();

        if (roots.isEmpty()) {
            throw new IllegalStateException("NOT ROOTS!");
        }

        //roots.sort(Collections.reverseOrder());

        return roots.get(0);

    }

}
