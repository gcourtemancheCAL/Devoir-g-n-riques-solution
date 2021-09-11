package org.example;

public class ListeChainee<T> {

    class Node {
        Node next = null;
        T v = null;

        Node(T v) {this.v = v;}
        Node(T v, Node n) {this.v = v; this.next = n;}
    }

    Node first = null;

    public void ajouterDebut(T v){
        first = new Node(v, first);
    }

    public T retirerDebut(){
        if(first == null) throw new RuntimeException();
        T v = first.v;
        first = first.next;
        return v;
    }

    public void ajouterFin(T v){
        if(first == null) {
            first = new Node(v);
        }
        else {
            Node n = getLastNode();
            n.next = new Node(v);
        }
    }

    public T retirerFin(){
        if(first == null) throw new RuntimeException();
        if(first.next == null) return retirerDebut();

        Node n = first;
        while(n.next.next != null ) n = n.next;

        T v = n.next.next.v;
        n.next = null;
        return v;
    }

    public int taille(){
        int sz = 0;
        Node n = first;
        while(n != null) {
            sz++;
            n = n.next;
        }

        return sz;
    }

    public boolean vide(){
        return first == null;
    }

    public T get(int idx) {
        Node n = first;
        while(idx-- > 0) {
            if(n == null) throw new IndexOutOfBoundsException();
            n = n.next;
        }

        return n.v;
    }

    private Node getLastNode() {
        Node n = first;
        while(n != null && n.next != null) n = n.next;
        return n;
    }

}