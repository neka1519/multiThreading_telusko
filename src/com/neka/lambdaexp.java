package com.neka;

//10.3 Java Tutorial | Multithreading | Lambda Expression
//reduce the no. of lines | make code more efficient


public class lambdaexp {

    public static void main(String[] args) {


      /*  Runnable obj1 = ()->{
            //  new Runnable()
        //{ -->removing this
            //anonymous class
            //public void run(){
                for (int i=0; i<5;i++){
                    System.out.println("Hi implementing lambda");
                    try{
                        Thread.sleep(1000); //critical stmtnt throws exception
                    }
                    catch (Exception e){}
                }
            };
       // };


       Runnable obj2 = () -> {

               for (int i=0; i<5;i++){
                   System.out.println("Hello implementing lambda");
                   try{
                       Thread.sleep(1000); //critical stmtnt throws exception
                   }
                   catch (Exception e){}
               }

       };
*/
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
    }
}
/*
Hi implementing lambda
Hello implementing lambda
Hi implementing lambda
Hello implementing lambda
Hi implementing lambda
Hello implementing lambda
Hi implementing lambda
Hello implementing lambda
Hi implementing lambda
Hello implementing lambda
 */



