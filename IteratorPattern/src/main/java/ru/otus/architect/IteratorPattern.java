package ru.otus.architect;

import java.util.Iterator;

public class IteratorPattern {
    public static void main(String[] args) {
        int n = 15;

        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator(n);

        System.out.println("Using Iterator with pattern...");
        Iterator<Integer> iterator = fibonacciGenerator.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
