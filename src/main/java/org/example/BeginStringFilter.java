package org.example;

public class BeginStringFilter implements FilterInterface {
    private String pattern;

    public BeginStringFilter(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }

    @Override
    public Boolean apply(String str) {
        return str.startsWith(pattern);
    }
}
