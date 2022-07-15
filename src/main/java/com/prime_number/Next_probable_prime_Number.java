package com.prime_number;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * to return Next probable prime Number
 *  Next_probable_prime_Number method used
 */
public class Next_probable_prime_Number {

    /**
     * Drive Class
     * @param args arguments
     */
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number :");
            long num = sc.nextLong();
            int result = 0;
            BigInteger bigInt = new BigInteger(String.valueOf(num));
            BigInteger prime = bigInt.nextProbablePrime();
            System.out.println("Next prime number : "+prime.intValue());
        }
}
