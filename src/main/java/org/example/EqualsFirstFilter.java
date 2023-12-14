package org.example;

import java.util.Objects;

public class EqualsFirstFilter implements Filter{

    private String pattern;

    public EqualsFirstFilter(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public boolean apply(String str) {
        return str.substring(0, 1).equals(pattern.substring(0,1));
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualsFirstFilter that = (EqualsFirstFilter) o;
        return Objects.equals(pattern, that.pattern);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pattern);
    }

    @Override
    public String toString() {
        return "BeginStringFilter{" +
                "pattern='" + pattern + '\'' +
                '}';
    }

}
