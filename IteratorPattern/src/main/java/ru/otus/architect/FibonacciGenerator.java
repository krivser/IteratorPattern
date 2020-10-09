package ru.otus.architect;

import java.util.Iterator;

public class FibonacciGenerator implements Iterable<Integer>, Iterator<Integer> {
    private final Integer n;
    private Integer prev;
    private Integer next;
    private Integer curr = 1;

    public FibonacciGenerator(Integer _n) {
        this.n = _n;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciGenerator(this.n);
    }

    @Override
    public boolean hasNext() {
        return curr <= this.n;
    }

    @Override
    public Integer next() {
        curr++;

        if (prev == null && next == null) {
            prev = 0;
            return 0;
        } else if (next == null) {
            next = 1;
            return next;
        } else if (prev == 0 && next == 1) {
            prev = 1;
            return next;
        }

        Integer temp = next;
        next = next + prev;
        prev = temp;

        return next;
    }
}
