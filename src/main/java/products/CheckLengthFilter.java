package products;

import Interface.Filter;

public class CheckLengthFilter implements Filter {

    public CheckLengthFilter(){}

    // вернет true, если длина строки меньше 4
    @Override
    public boolean apply(String pattern) {
        return pattern.length() > 4;
    }

}
