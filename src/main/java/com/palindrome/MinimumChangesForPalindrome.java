package com.palindrome;

/**
 *  JAVA program to Count
 *  minimum swap to make
 *  string palindrome
 */

public class MinimumChangesForPalindrome {

    /**
     *  Function to Count minimum swap
     * @param str String as an arguments
     * @return return iff condition satisfied.
     */
    static int countChange(String str)
        {

            int n = str.length();

            // it will convert string to char array
            char[] s = str.toCharArray();

            int count = 0;

            for (int i = 0; i < n / 2; i++) {

                // Left pointer & Right pointer
                int right = n - i - 1;

                // A loop which run from right pointer to left
                while (i < right) {

                    // if both char same then break the loop else, have to move right
                    // pointer to one step  left
                    if (s[i] == s[right]) {
                        break;
                    }
                    else {
                        right--;
                    }
                }

                // it denotes both pointer at same position
                if (i == right) {
                    return -1;
                }
                else {
                    for (int j = right; j < n - i - 1; j++) {
                        char t = s[j];
                        s[j] = s[j + 1];
                        s[j + 1] = t;
                        count++;
                    }
                }
            }

            return count;
        }

    /**
     * reverse character array
     * @param array array type Input.
     */
    static void reverse(char[] array)
        {
            int n=array.length;
            char[] b = new char[n];
            int j = n;
            for (char c : array) {
                b[j - 1] = c;
                j = j - 1;
            }
        }

    /**
     * Driver Code
     * @param args arguments
     */
    public static void main(String[] args)
        {
            String string1 = "abaabaabab";

            // Function calling
            int ans1 = countChange(string1);

            char[] charArray = string1.toCharArray();
            reverse(charArray);
            string1 = new String(charArray);

            int ans2 = countChange(string1);

            System.out.println(Math.max(ans1, ans2));
        }
    }


