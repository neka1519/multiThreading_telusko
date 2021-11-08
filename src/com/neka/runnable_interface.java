package com.neka;

//10.2 Java Tutorial | Multithreading | Thread class
/*
Runnable is a functional interface ---> SAM -->single abstartc method and we lambda expersion only for sam
 */
class HiRun implements  Runnable{
    public void run(){
        for (int i=0; i<5;i++){
            System.out.println("Hi implementing runnable interface");
            try{
                Thread.sleep(1000); //critical stmtnt throws exception
            }
            catch (Exception e){}
        }
    }
}


class HelloRun implements Runnable{
    public void run(){
        for (int i=0; i<5;i++){
            System.out.println("Hello implementing runnable interface");
        }
    }
}

public class runnable_interface {

    public static void main(String[] args) {
        HiRun obj1 = new HiRun();
        HelloRun obj2 = new HelloRun();

        Thread t1 = new Thread(obj1); //you can pass the object in thread so that it calls our run method
        Thread t2 = new Thread(obj2);

        t1.start();
        try{
            Thread.sleep(10); //critical stmtnt throws exception
        }
        catch (Exception e){}
        t2.start();
/*
Hi implementing runnable interface
Hello implementing runnable interface
Hello implementing runnable interface
Hello implementing runnable interface
Hello implementing runnable interface
Hello implementing runnable interface
Hi implementing runnable interface
Hi implementing runnable interface
Hi implementing runnable interface
Hi implementing runnable interface

Note :
you can create thread by implementing runnable interface or extending thread class
if you are using runnable interface, you have to pass the object within the thread
 */


    }
}

