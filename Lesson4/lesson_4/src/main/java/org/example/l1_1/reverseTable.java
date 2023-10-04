package org.example.l1_1;

import java.util.ArrayList;
import java.util.Arrays;

public class reverseTable {
    public static void reverseTable (Object[] array, int a, int b){
            Object buffer = array[a];
            array[a]=array[b];
            array[b] = buffer;
        }
        public static <T> ArrayList<T> convert(T[] array){
        return new ArrayList<>(Arrays.asList(array));
    }

}
