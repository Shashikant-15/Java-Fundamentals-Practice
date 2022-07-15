package com.fibonecci;

/**
 *  Java Program to find nth fibonacci Number
 *  using another approach i.e. formula based
 */
public class Another_approach {

    /**
     * In this method we directly implement the formula for nth term in the fibonacci series.
     * Fn = {[(√5 + 1)/2] ^ n} / √5
     * @param n parameters
     * @return return
     */
        static int fib(int n) {
            double phi = (1 + Math.sqrt(5)) / 2;
            return (int) Math.round(Math.pow(phi, n)
                    / Math.sqrt(5));
        }

        // Driver Code
        public static void main(String[] args) {
            int n = 10;
            System.out.println(fib(n));
        }
    }


