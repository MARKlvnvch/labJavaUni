package functions;

import java.util.Objects;

public class ExpFun implements Function{

    private final double a;
    private final double b;
    private final double start;
    private final double end;

    public ExpFun(double a, double b, double start, double end) {
        this.a = a;
        this.b = b;
        this.start = start;
        this.end = end;
    }

    @Override
    public double fun(double x) {
        if (!(x >= start && x <= end)) {
            throw new IllegalArgumentException("Out of Range");
        }
        return a*Math.exp(x) + b;
    }

    @Override
    public double getStart() {
        return start;
    }

    @Override
    public double getEnd() {
        return end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExpFun expFun = (ExpFun) o;
        return Double.compare(a, expFun.a) == 0 && Double.compare(b, expFun.b) == 0 && Double.compare(start, expFun.start) == 0 && Double.compare(end, expFun.end) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, start, end);
    }

    @Override
    public String toString() {
        return "ExpFun{" +
                "a=" + a +
                ", b=" + b +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}
