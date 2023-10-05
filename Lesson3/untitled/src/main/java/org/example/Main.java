package org.example;

import org.example.exceptions.MyArrayDataExceptionImpl;
import org.example.exceptions.MyArraySizeException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "3", "4"},
        };
        arr(array);
    }


    static void arr(String[][] array) {
        if (array.length != 4) throw new MyArraySizeException("fas");

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) throw new MyArraySizeException("fas");
        }
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    summ += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataExceptionImpl();
                }

            }
        }
        System.out.println(summ);
    }
}