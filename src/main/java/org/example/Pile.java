package org.example;

public class Pile<T> {
    private ListeChainee<T> l = new ListeChainee<>();

    public void pousse(T v){
        l.ajouterDebut(v);
    }

    public T ecornifler(){
        if(l.vide()) throw new RuntimeException();
        return l.get(0);
    }

    public T pop(){
        if(l.vide()) throw new RuntimeException();
        return l.retirerDebut();
    }

    public boolean vide(){ return l.vide(); }

    public int taille(){ return l.taille(); }

    public T get(int idx){ return l.get(idx); }

}
