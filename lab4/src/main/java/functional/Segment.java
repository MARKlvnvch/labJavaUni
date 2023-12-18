package functional;

import functions.Function;

public class Segment <T extends Function> implements Functional<T>{

    @Override
    public double fun(T f) {
        return f.fun(f.getStart())  + f.fun(f.getEnd()) + f.fun((f.getStart() + f.getEnd()) / 2);
    }

}
