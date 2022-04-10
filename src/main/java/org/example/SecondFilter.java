package org.example;

public class SecondFilter implements FilterInterface {
    private String pattern;

    public SecondFilter(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }

    @Override
    public Boolean apply(String str) {
        return str.contains(pattern);
    }
}
