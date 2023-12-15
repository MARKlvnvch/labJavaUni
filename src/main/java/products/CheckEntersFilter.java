package products;

import Interface.Filter;

public class CheckEntersFilter implements Filter {


    public CheckEntersFilter(){}

    // вернет true, если пробелы в строке есть
    @Override
    public boolean apply(String pattern) {
        return pattern.contains(" ");
    }

}
