package com.prime_number;

import java.util.Scanner;

/**
 * Check Whether User's Input Number is Prime/Not prime
 * used Check_isPrimeOrNot method
 */
public class Check_isPrimeOrNot {

    /**
     * main method called here.
     * @param args parameter
     */
        public static void main(String[] args) {
            int my_input;
            System.out.println("Required packages have been imported");
            Scanner my_scanner = new Scanner(System.in);
            System.out.println("A reader object has been defined ");
            System.out.print("Enter the number : ");
            my_input = my_scanner.nextInt();
            boolean isprime = false;
            for (int i = 2; i <= my_input / 2; ++i) {
                if (my_input % i == 0) {
                    isprime = true;
                    break;
                }
            }
            if (!isprime)
                System.out.println("The number " +my_input + " is a prime number.");
            else
                System.out.println("The number " +my_input + " is not a prime number.");
        }
}
