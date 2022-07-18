package com.problem8;

/**
 * To Find all substring of size k
 *
 * @author Shashikant
 * @version 11.0.11
 */
public class AllSubString {
    /**
     * Method for SubString
     * @param str String
     * @param n size
     */
    public static void SubString(final String str,
                                 final int n)
    {
        for (int i = 0; i < n-2; i++) {
            System.out.println(str.substring(i, i + 3));
        }
    }

    /**
     *  drive class
     * @param args arguments.
     */
    public static void main(final String[] args)
    {
        String str = "abcdbb";
        SubString(str, str.length());
    }
}
