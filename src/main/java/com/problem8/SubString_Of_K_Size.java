package com.problem8;

import java.util.ArrayList;
import java.util.List;

/**
 * To Find all substring of size k
 * and return in a List/Array for a given string;
 * @author Shashikant
 * @version 11.0.11
 */
public class SubString_Of_K_Size {
    /**
     *
     * @param str String
     * @param k size of SubString
     * @return return if condition true.
     */
        public static List<String> subStringOfString(String str, int k) {
            List<String> subStrings = new ArrayList<>();
            for (int index = 0; index < str.length(); index++) {
                for (int index2 = index + 1; index2 <= str.length(); index2++) {
                    if (str.substring(index, index2).length() == k) {
                        subStrings.add(str.substring(index, index2));
                    }
                }
            }
            return subStrings;
        }
}
