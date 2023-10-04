package org.example.exceptions;

public class MyArraySizeException extends MyException{
    public MyArraySizeException(String message) {
        super("Размер массива не верный");
    }
}
