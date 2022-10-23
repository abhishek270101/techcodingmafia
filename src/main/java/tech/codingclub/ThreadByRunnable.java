package tech.codingclub;

public class ThreadByRunnable implements Runnable{
   // package ThreadPackage;

    //public class ThreadByRunnable implements Runnable{

        int counter=0;
        String name;
        public  ThreadByRunnable(int counter,String name)
        {
            this.counter = counter;
            this.name = name;
        }
        public void run()
        {
            while(counter<500) {
                counter++;
                System.out.println(name+" "+counter);
            }

        }

    }


