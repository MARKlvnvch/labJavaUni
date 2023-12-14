package org.example;

import java.util.Objects;

public class CheckEntersFilter implements Filter{


    public CheckEntersFilter(){}

    // вернет true, если пробелы в строке есть
    @Override
    public boolean apply(String pattern) {
        return pattern.contains(" ");
    }

}
