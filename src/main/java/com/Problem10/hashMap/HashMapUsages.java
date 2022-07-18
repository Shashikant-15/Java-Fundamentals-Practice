package com.Problem10.hashMap;

import java.util.HashMap;

public class HashMapUsages {

    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Java", 8);
        hashMap.put("JavaScript", 1);
        hashMap.put("Python", 3);
        System.out.println("HashMap: " + hashMap);
    }
}
