package com.Problem10.linkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHashMapUsages {

    public static void main(String[] args) {

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Java", 8);
        linkedHashMap.put("JavaScript", 1);
        linkedHashMap.put("Python", 3);
        System.out.println("LinkedHashMap: " + linkedHashMap);
    }
}
