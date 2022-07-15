package com.palindrome;

 /**
 * check given string is palindrome or not
 **/
public class CheckPalindrome {

    /**
     * boolean type static method to check Palindrome
     * @param str String Type argument
     * @return return if String is palindrome else not.
     */
        public static boolean isPalindrome(String str)
        {
            // Initializing an empty string to store the reverse
            // of the original str
            String reverse = "";

            // Initializing a new boolean variable for the
            // answer
            boolean answer = false;

            for (int i = str.length() - 1; i >= 0; i--) {
                reverse = reverse + str.charAt(i);
            }

            // Checking if both the strings are equal
            if (str.equals(reverse)) {
                answer = true;
            }
            return answer;
        }

     /**
      * Drive  Class
      * @param args arguments
      */
     public static void main(String[] args)
        {
            // Input string
            String str = "abba";

            // Convert the string to lowercase
            str = str.toLowerCase();
            boolean A = isPalindrome(str);
            System.out.println(A);
        }
    }

