package com.company;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PersonOne {
    public static <T, V> List<V>
    stringToIntList(List<T> listOfString, Function<T, V> function) {
        return listOfString.stream().map(function).collect(Collectors.toList());
    }

}
