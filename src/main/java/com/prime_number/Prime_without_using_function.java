package com.prime_number;
/**
 * checking prime number without using function
 * Prime_without_using_function method used.
 */
public class Prime_without_using_function {

    /**
     * Drive class
     * @param args arguments
     */
    public static void main(String[] args) {
        int num = 11, flag=0;
        for(int i = 2; i * i <= num/2; i++) {
            if(num % i == 0) {
                System.out.println( num + " is not prime number");
                flag = 1;
                break;
            }
        }
        if(flag == 0) {
            System.out.println( num + " is a prime number");
        }
    }
}
