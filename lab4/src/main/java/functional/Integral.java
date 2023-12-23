package functional;

import functions.Function;

public class Integral <T extends Function> implements Functional<T>{

    private final int delimiter; // ширина отрезков интегрирования
    private final double start; // начало отрезка
    private final double end; // конец отрезка

    public Integral(int delimiter, double start, double end) {

        // обработка ошибок выхода из отрезка интегрирования
        if (delimiter <= 0) {throw new IllegalArgumentException("Delimiter error!!!");}
        if (start > end) {
            throw new IllegalArgumentException("Segment error!");
        }

        this.delimiter = delimiter;
        this.start = start;
        this.end = end;

    }

    @Override
    public double fun(T func) {

        double delta; // дельта X
        double x;
        double summa = 0; // интегральная сумма

        // обработка ошибок выхода из отрезка интегрирования
        if (start > func.getStart()) {
            throw new IllegalArgumentException("START ERROR!");
        }
        if (end > func.getEnd()) {
            throw new IllegalArgumentException("END ERROR!");
        }

        delta = Math.abs(end - start) / delimiter;

        for (int i = 0; i < delimiter; i++) {
            x = (i + 0.5) * delta + start;
            summa += func.fun(x);
        }

        return summa * delta;

    }



}
