package com.neka;

//10.4 Java Tutorial | Multithreading | Lambda Expression
//reduce the no. of lines | make code more efficient


public class isAliveMethod {

    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi implementing lambda");
                try {
                    Thread.sleep(1000); //critical stmtnt throws exception
                } catch (Exception e) {
                }
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello implementing lambda");
                try {
                    Thread.sleep(1000); //critical stmtnt throws exception
                } catch (Exception e) {
                }
            }
        });

        t1.start();
        try {
            Thread.sleep(10); //critical stmtnt throws exception
        } catch (Exception e) {
        }
        t2.start();

        System.out.println(t1.isAlive()); //prints true
        t1.join();
        t2.join(); //now byee gets executed at the last

        System.out.println(t1.isAlive()); //prints false

        System.out.println("Byeeee");
        /*
Hi implementing lambda      ----> this gets called first,  a delay is given, t2 starts but before that byeee gets executed
Byeeee                      ---> we want bye at the end
Hello implementing lambda
Hi implementing lambda
Hello implementing lambda
Hi implementing lambda
Hello implementing lambda
Hi implementing lambda
Hello implementing lambda
Hi implementing lambda
Hello implementing lambda


join method is used so that t1 and t2 first executes and the join again until that particular methods gets executed completly
         */
    }
}

