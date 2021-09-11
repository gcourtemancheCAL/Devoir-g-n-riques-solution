package org.example;

public class UtilTableau {

    private UtilTableau(){};

    public static <T> void swap(T[] ts, int i1, int i2) {
        if(i1 >= ts.length || i2 >= ts.length) throw new IndexOutOfBoundsException();

        T tmp = ts[i1];
        ts[i1] = ts[i2];
        ts[i2] = tmp;
    }

    public static <T> Pile<T> tableauVersPile(T[] ts){
        Pile<T> p = new Pile<>();

        for(T t : ts) p.pousse(t);
        return p;
    }

    public static <T extends Comparable<T>> T maxElement(T[] ts) {
        if(ts.length == 0) return null;

        T r = ts[0];

        for(int i = 1; i < ts.length; i++) {
            if(ts[i].compareTo(r) > 0) r = ts[i];
        }

        return r;
    }

    public static <T> T elementDetermine(T[] ts, IDeterminant<T> det) {
        if(ts.length == 0) return null;

        T r = ts[0];

        for(int i = 1; i < ts.length; i++) {
            r = det.determine(r, ts[i]);
        }

        return r;
    }

}
