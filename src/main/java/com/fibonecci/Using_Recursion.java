package com.fibonecci;

/**
 *  Fibonacci Series using Recursion
 */
public class Using_Recursion {

    /**
     *
     * @param n input number
     * @return return required number
     */
        static int fib(int n)
        {
            if (n <= 1)
                return n;
            return fib(n-1) + fib(n-2);
        }

    /**
     * drive class
     * @param args arguments
     */
        public static void main (String[] args)
        {
            int n = 10;
            System.out.println(fib(n));
        }
    }