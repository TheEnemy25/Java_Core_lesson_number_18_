package com.company;

import java.util.Arrays;
import java.util.List;

import static com.company.PersonOne.stringToIntList;

public class Main {

    public static void main(String[] args) {

        //Не зовсім зрозумів завдання але думаю 2 краще зроблено
        List<Integer> integers = Person.list();
        List<String> strings = Person.list();
        integers.add(0,3);
        strings.add(0,"Andrian");

        System.out.println(integers);
        System.out.println(strings);

        //Можна зробити функцію для перетворення списку який буде перетворяти int в string
        /**
         * @see PersonOne
         * */

        //Стрінгові значення
        List<String> listOfString = Arrays.asList("1", "2", "3", "4", "5");
        System.out.println("String : " + listOfString);

        //Інтові значення
        List<Integer> listOfInteger = stringToIntList(listOfString, Integer::parseInt);
        System.out.println("Integer: " + listOfInteger);
    }
}