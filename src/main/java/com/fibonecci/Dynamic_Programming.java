package com.fibonecci;

/**
 * Java Program to find  fibonacci Number
 * using another approach i.e. Dynamic_Programming
 */
public class Dynamic_Programming {
    /**
     * static type function i.e. fib
     * @param n connectible number
     * @return return true
     */
    static int fib(int n)
    {
        /* Declare an array to store Fibonacci numbers. */
        int f[] = new int[n+2]; // 1 extra to handle case, n = 0
        int i;

        /* 0th and 1st number of the series are 0 and 1*/
        f[0] = 0;
        f[1] = 1;

        for (i = 2; i <= n; i++)
        {
       /* Add the previous 2 numbers in the series
         and store it */
            f[i] = f[i-1] + f[i-2];
        }

        return f[n];
    }

    /**
     * drive Class
     * @param args arguments
     */
    public static void main (String[] args)
    {
        int n = 9;
        System.out.println(fib(n));
    }
}
