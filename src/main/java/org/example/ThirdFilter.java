package org.example;

public class ThirdFilter implements FilterInterface {
    private String pattern;

    public ThirdFilter(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }

    @Override
    public Boolean apply(String str) {
        return str.endsWith(pattern);
    }
}
