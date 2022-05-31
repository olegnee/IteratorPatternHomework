package com.company;

import java.util.Random;

public class RandomsIterator implements Iterable<Integer> {
    int start;
    int end;

    public static RandomsIterator fromTo(int from, int to) {
        return new RandomsIterator(from, to);
    }

    private RandomsIterator(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Iterator iterator() {
        return new Iterator(start);
    }

    class Iterator implements java.util.Iterator<Integer> {
        int current;

        public Iterator(int current) {
            this.current = current;
        }

        @Override
        public boolean hasNext() {
            return current <= end;
        }

        @Override
        public Integer next() throws IllegalArgumentException {
            while (true) {
            int diff = end - start;
            Random random = new Random();
            int numb = random.nextInt(diff + 1);
            numb += start;

            return numb;
        }
        }
    }
}
