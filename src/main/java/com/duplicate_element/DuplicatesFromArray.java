package com.duplicate_element;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.lang.System.out;

/**
 * Java Program to find duplicate elements in an array. In this program, you
 * will learn two solution to find duplicate elements in integer array e.g.
 * brute force, by using HashSet data structure.
 *
 * @author shashikant
 */

public class DuplicatesFromArray {

    /**
     * Complexity of this solution is O(n^2)
     *
     * @param input
     * @return
     */
    public static Set<Integer> findDuplicates(int[] input) {
        Set<Integer> duplicates = new HashSet<Integer>();

        for (int i = 0; i < input.length; i++) {
            for (int j = 1; j < input.length; j++) {
                if (input[i] == input[j] && i != j) {
                    // duplicate element found
                    duplicates.add(input[i]);
                    break;
                }
            }
        }

        return duplicates;
    }

    /**
     * Generic method to find duplicates in array. Complexity of this method is
     * O(n) because we are using HashSet data structure.
     *
     * @param array Array Type
     * @return
     */
    public static <T extends Comparable<T>> void getDuplicates(T[] array) {
        Set<T> dupes = new HashSet<T>();
        for (T i : array) {
            if (!dupes.add(i)) {
                out.println("Duplicate element in array is : " + i);
            }
        }
    }
}
