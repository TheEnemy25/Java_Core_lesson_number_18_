package com.company;

import java.util.ArrayList;
import java.util.List;

public class Person<T> {
    private T ob;

    public T getOb() {
        return ob;
    }

    public void setOb(T ob) {
        this.ob = ob;
    }

    public static <T> List<T> list(){
        return new ArrayList<T>();
    }
}
