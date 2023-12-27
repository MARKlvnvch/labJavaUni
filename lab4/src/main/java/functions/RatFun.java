package functions;

import java.util.Objects;

public class RatFun implements Function{

    private final double a;
    private final double b;
    private final double c;
    private final double d;
    private final double start;
    private final double end;

    public RatFun(double a, double b, double c, double d, double start, double end) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.start = start;
        this.end = end;
    }

    @Override
    public double fun(double x) {
        if (!(x >= start && x <= end)) {
            throw new IllegalArgumentException("Out of Range");
        }
        if (c == 0 && d == 0) {
            throw new IllegalArgumentException("Zero Detaminator");
        }
        return (a * x + b) / (c * x + d);
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
        RatFun ratFun = (RatFun) o;
        return Double.compare(a, ratFun.a) == 0 && Double.compare(b, ratFun.b) == 0 && Double.compare(c, ratFun.c) == 0 && Double.compare(d, ratFun.d) == 0 && Double.compare(start, ratFun.start) == 0 && Double.compare(end, ratFun.end) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c, d, start, end);
    }

    @Override
    public String toString() {
        return "RatFun{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", start=" + start +
                ", end=" + end +
                '}';
    }

}
