package io.jboxx.designpattern.iteratorpattern;

import java.util.Iterator;

public class ConcreateIterator implements Iterator {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
