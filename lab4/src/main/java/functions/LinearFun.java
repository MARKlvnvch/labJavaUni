package functions;

import java.util.Objects;

public class LinearFun implements Function {

    private final double a;
    private final double b;
    private final double start;
    private final double end;

    public LinearFun(double a, double b, double start, double end) {
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
        return a*x + b;
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
        LinearFun linearFun = (LinearFun) o;
        return Double.compare(a, linearFun.a) == 0 && Double.compare(b, linearFun.b) == 0 && Double.compare(start, linearFun.start) == 0 && Double.compare(end, linearFun.end) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, start, end);
    }

    @Override
    public String toString() {
        return "LinearFun{" +
                "a=" + a +
                ", b=" + b +
                ", rangeStart=" + start +
                ", rangeEnd=" + end +
                '}';
    }

}
