package com.prime_number;

/**
 * checking prime number using function
 * Prime_using_a_function method used.
 */
public class Prime_using_a_function {
    /**
     *
     * @param num  users input number to check
     * @return return prime if true else return not prime.
     */
    static int PrimeOrNot(int num) {
        int flag = 0;
        if(num == 0||num == 1) {
            flag = 1;
        } else {
            for(int i = 2; i <= num/2; i++) {
                if(num % i == 0) {
                    flag = 1;
                    break;
                }
            }
        }
        return flag;
    }

    /**
     *  Drive class
     * @param args arguments
     */
    public static void main(String[] args) {
        int flag, num = 11;
        flag = PrimeOrNot(num);
        if(flag == 0) {
            System.out.println( num + " is a prime number");
        } else {
            System.out.println( num + " is not a prime number");
        }
    }
}
