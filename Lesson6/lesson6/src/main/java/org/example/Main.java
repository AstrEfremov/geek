package org.example;

import java.util.Arrays;

public class Main {
    static final int SIZE = 100000000;
    static final int HALFSIZE = SIZE/2;
    static float[] arr = new float[SIZE];

    public static void main(String[] args) {
       Main main = new Main();
       Arrays.fill(arr, 1);
       main.fillArray(arr);
       main.fillArraySync(arr);
    }
    public void fillArray(float [] arr){
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + (double) i / 5) * Math.cos(0.2f + (double) i / 5) *  Math.cos(0.4f + (double) i / 2));
        }
        System.out.println(System.currentTimeMillis() - a + " NOT Synchronized");
    }
    public synchronized void fillArraySync(float [] arr){
        Object syn1 = new Object();
        Object syn2 = new Object();
        long a = System.currentTimeMillis();
        float [] arr1 = new float[HALFSIZE];
        float [] arr2 = new float[HALFSIZE];
        System.arraycopy(arr, 0, arr1, 0, HALFSIZE);
    System.arraycopy(arr, HALFSIZE, arr2, 0, HALFSIZE);
        Thread tr1 = new Thread(()-> {
            for (int i = 0; i < arr1.length; i++) {
                arr[i] = (float) (arr[i] * Math.sin(0.2f + (double) i / 5) * Math.cos(0.2f + (double) i / 5) * Math.cos(0.4f + (double) i / 2));
            }
        });
        Thread tr2 = new Thread(() -> {
            for (int i = 0; i < arr2.length; i++) {
                arr[i] = (float) (arr[i+HALFSIZE] * Math.sin(0.2f + (double) (i+HALFSIZE) / 5) * Math.cos(0.2f + (double) i / 5) * Math.cos(0.4f + (double) (i+HALFSIZE) / 2));
            }
        });
        tr1.start();
        tr2.start();
        try {
            tr1.join();
            tr2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.arraycopy(arr1, 0, arr, 0, HALFSIZE);
        System.arraycopy(arr2, 0, arr, HALFSIZE, HALFSIZE);
        System.out.println(System.currentTimeMillis()-a + " Synchronized");
    }
}