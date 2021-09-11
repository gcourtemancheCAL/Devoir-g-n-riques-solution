package org.example;

public class PlusLongueString implements IDeterminant<String>{
    @Override
    public String determine(String t1, String t2) {
        if(t2.length() > t1.length()) return t2;
        return t1;
    }
}
