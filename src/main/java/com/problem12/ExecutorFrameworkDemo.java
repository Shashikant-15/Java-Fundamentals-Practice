package com.problem12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 */
public class ExecutorFrameworkDemo {
    /**
     * main method called
     * @param args arguments
     */
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int j = 0; j < 5; j++) {
            Runnable task = new Task("" + j);
            executorService.execute(task);
        }

        // closing executor
        executorService.shutdown();

        while (!executorService.isTerminated()) ;
        System.out.println("Finished all threads");
    }
}
