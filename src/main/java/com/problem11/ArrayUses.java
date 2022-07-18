package com.problem11;

import java.util.Arrays;

public class ArrayUses {
    /**
     * main method implemented
     * @param args arguments.
     */
    public static void main(String[] args) {

            int[] array = new int[10];
            for (int index = 0; index < 10; index++) {
                array[index] = index;
            }
            System.out.println("Array : " + Arrays.toString(array));
        }
}
