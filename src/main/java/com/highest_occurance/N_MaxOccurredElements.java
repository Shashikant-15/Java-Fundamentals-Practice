package com.highest_occurance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * N maximum  occurring element
 * @author shashikant
 * @version 11.0.11
 */
public class N_MaxOccurredElements {

    /**
     * main method i.e. implement
     * @param args arguments
     */
        public static void main(String[] args) {
            int[] arr = { 3, 1, 4, 4,4,4, 5, 2,2, 6, 1, 1};
            int n = arr.length;
            int k = 3;

            // Function call
            print_N_mostFrequentNumber(arr, n, k);
        }

    /**
     *
     * @param arr array
     * @param n  num which maximum occured
     * @param k  count num of times occured.
     */
        private static void print_N_mostFrequentNumber(int[] arr, int n, int k) {

            //Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
            Map<Integer, ValueCount> mpValueCount = new HashMap<Integer, ValueCount>();

            for (int i = 0; i < n; i++) {
                //mp.put(arr[i], mp.getOrDefault(arr[i], 0)+1);
                mpValueCount.put(arr[i], mpValueCount.getOrDefault(arr[i], new ValueCount(arr[i], 0)).incrementCount());
            }

            List<ValueCount> values =  new ArrayList<ValueCount>(mpValueCount.values());

            //List<Map.Entry<Integer, Integer>> mpValues = new ArrayList<>(mp.values());
            //Collections.sort(mp.entrySet());
            Collections.sort(values);
            for(int m = 0; m<k;m++) {
                System.out.println(values.get(m));
            }
        }


     static class  ValueCount implements Comparable<ValueCount>{
        int value;
        int count;

        public ValueCount(int value, int count) {
            super();
            this.value = value;
            this.count = count;
        }

        public ValueCount incrementCount() {
            ++count;
            return this;
        }

        public int getValue() {return value;}

        public void setValue(int value) {this.value = value;}

        public int getCount() {return count;}

        public void setCount(int count) {this.count = count;}

        @Override
        public int compareTo(ValueCount arg0) {
            return arg0.getCount() - this.getCount();
        }

        @Override
        public String toString() {
            return "Max Occurred Element:: [value=" + value + ", count=" + count + "]";
        }
}
}
