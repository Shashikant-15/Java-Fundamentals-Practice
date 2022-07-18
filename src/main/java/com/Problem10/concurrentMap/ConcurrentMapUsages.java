package com.Problem10.concurrentMap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * concurrentMap uses to ConcurrentHashMap
 * @author shashikant
 * @version 11.0.11
 */
public class ConcurrentMapUsages {
    /**
     * derive class
     */
    public static void main(String[] args) {

        ConcurrentMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put("Python", 7);
        concurrentMap.put("JavaScript", 1);
        concurrentMap.put("Java", 5);
        System.out.println("ConcurrentMap: " + concurrentMap);
    }
}
