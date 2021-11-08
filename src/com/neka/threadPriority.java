package com.neka;

//10.5 Java Tutorial | Multithreading | Thread Priority
public class threadPriority {

    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi " + Thread.currentThread().getPriority());
                try {
                    Thread.sleep(1000); //critical stmtnt throws exception
                } catch (Exception e) {
                }
            }
        },"Testing another way to name hi");
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello ");
                try {
                    Thread.sleep(1000); //critical stmtnt throws exception
                } catch (Exception e) {
                }
            }
        },"Testing another way to name hi");



        /*to change threadName
        t1.setName("Hi thread");            //helps in mangaing multiple threads by provifing proper name
        t2.setName("Hello thread");

        to get thread name
         */
        System.out.println(t1.getName());  // by deafult, Thread-0
        System.out.println(t2.getName());  //Thread-1
        //after the thread name is changed it will change to what you set that into

        //printing the priority
        //priority ranges from 1 to 10 - 1 : being least and 10 being highest
        System.out.println(t1.getPriority()); //prints 5
        System.out.println(t2.getPriority()); //prints 5 --> by default

        /*
        t1.setPriority(1);
        //t1.setPriority(Thread.MIN_PRIORITY)
        t2.setPriority(10);
        //t2.setPriority(Thread.MAX_PRIORITY)
*/

        t1.start();
        try {
            Thread.sleep(10); //critical stmtnt throws exception
        } catch (Exception e) {
        }
        t2.start();

        System.out.println(t1.isAlive()); //prints true
        t1.join();
        t2.join();

        System.out.println(t1.isAlive()); //prints false

        System.out.println("Byeeee");

    }
}

