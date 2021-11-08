package com.neka;



        /*threads - sub process/unit of a process
        ex : in Microsoft word, when you are typing, there is spellcheck
        spellcheck is a process

        uses of thread
        ~using complete power of CPU
        ~asynctask in android - if you are using aMAZON AND SEARCHING a product, a thread will be created to send request
        to the amazon server and the main thread will allow the user to search for something else parallely
        ~web application : multiple users to access same servlet, differnt thread will be created for each user
         ~gaming : multiple work happening at the same time

         Thread t1 = new myThread();

         class myThread extends Thread{}

         method sleep - static method - provides a delay like 2s = 2000
         wait and notify
         stop

         now what if you have a class and you also want to use thread
         you can't write
         class myThread extends A,Thread ---> not allowed
         class mythread extends A implements Runnable{
         //runnable has a method run

         by default we have one thread which is main thread that calls everything
         }
         */

    //10.1 Java Tutorial | Multithreading | Thread class

    class Hi extends Thread{
   // public void show(){
        public void run(){
            //as this a thread, we have to start and rename the method as run
        for (int i=0; i<5;i++){
            System.out.println("Hi");
            //suspending the thread - pauses the thread for a certain time
            //printing hi after 1sec
           try{
               Thread.sleep(1000); //critical stmtnt throws exception
         }
           catch (Exception e){}
           //half second --->1000 millisecond = 1sec
        }
        }
    }
/*in class hi we have introduced delay, so only after hi hello gets executed. To avoid this
we can run hello parallely
extend thread class
now,to have alternate hi and hello (i.e) to run llely we create method start
a class is extended from thread so now the class itself is a thread
for a thread to start give
objName.start();
NOTE :
WHEN YOU CALL START , THE METHOD NAME IS SUPPOSED TO BE RUN ONLY

 */

    class Hello extends Thread{
        public void run(){
            for (int i=0; i<5;i++){
                System.out.println("Hello");
            }
        }
    }

public class Main {
    public static void main(String[] args) {
    Hi obj1 = new Hi();
    Hello obj2 = new Hello();

    //obj1.show(); // the main thread goes to show method in Hi class and executes the complete method
    //obj2.show();

    obj1.start();
        try{
            Thread.sleep(10); //critical stmtnt throws exception
        }
        catch (Exception e){}
        //half second --1000 millisecond = 1sec

    obj2.start();
/*
Hi
Hello
Hello
Hello
Hello
Hello
Hi
Hi
Hi
Hi
 */


    }
}
