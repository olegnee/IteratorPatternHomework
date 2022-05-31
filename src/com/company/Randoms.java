package com.company;

import java.util.*;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    private int numb;
    private int min;
    private int max;


    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator iterator() {
        return new Iterator();
    }

    class Iterator implements java.util.Iterator {

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            while (true) {
                int diff = max - min;
                random = new Random();
                numb = random.nextInt(diff + 1);
                numb += min;
                return numb;
            }
        }
    }
}