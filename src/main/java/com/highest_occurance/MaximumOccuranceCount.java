package com.highest_occurance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  First most  occurring element using user input
 */
public class MaximumOccuranceCount {

    /**
     * Derive class
     * @param args arguments
     * @throws IOException Input,Output exception
     */
        public static void main(String[] args) throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input Array Size:");
            int size=Integer.parseInt(br.readLine());
            int[] arr= new int[size];
            System.out.println("Input Elements in Array:");
            for(int i=0;i<size;i++)
                arr[i]=Integer.parseInt(br.readLine());
            int max = 0,pos=0,count = 0;
            for (int i = 0; i < arr.length; i++)
            {
                count=0;
                for (int k : arr) {
                    if (arr[i] == k)
                        count++;
                }
                if (count >=max)
                {
                    max = count;
                    pos=i;
                }
            }

            if(max==1)
                System.out.println("No Duplicate Element.");
            else
                System.out.println("Element:"+arr[pos]+" Occurrence:"+max);
        }
    }

