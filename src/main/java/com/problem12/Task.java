package com.problem12;

    public class Task implements Runnable {
        private final String threadNo;

        public Task(String no) {
            this.threadNo = no;
        }

        @Override
        public void run() {
            // printing thread information
            System.out.println(
                    Thread.currentThread().getName() + " start execution. Thread No = " + threadNo);

            // calling processThread() method for processing thread
            processThread();

            // printing a statement to show the end of the thread
            System.out.println(Thread.currentThread().getName() + " stop execution.");
        }

        // creating processThread() method to execute thread
        private void processThread() {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // overriding toString() method
        @Override
        public String toString() {
            return this.threadNo;
        }
}
