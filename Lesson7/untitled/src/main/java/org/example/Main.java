package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

       List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> out= list
                .stream()
                .filter((n)->n%2==0)
                .collect(Collectors.toList());
        System.out.println(out);
        list.forEach(System.out::println);
        int sum = list.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);


    }

}