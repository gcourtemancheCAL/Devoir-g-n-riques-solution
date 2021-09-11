package org.example;

public class MaxDeterminant<T extends Comparable<T> > implements IDeterminant<T>{

    @Override
    public T determine(T t1, T t2) {
        if(t2.compareTo(t1) > 0) return t2;
        return t1;
    }
}
