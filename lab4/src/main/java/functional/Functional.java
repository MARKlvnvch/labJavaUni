package functional;

import functions.Function;

public interface Functional <T extends Function> {
    double fun(T function);

}
