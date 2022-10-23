package tech.codingclub;

public class ThreadByExtendsThreadClass extends Thread {
   // package ThreadPackage;

    //public class ThreadByExtendsThreadClass extends Thread{
        int counter=0;
        String name;
        public  ThreadByExtendsThreadClass(int counter,String name)
        {
            this.counter = counter;
            this.name = name;
        }
        public void run()
        {
            while(counter<500) {
                counter++;
                System.out.println(name+counter);
            }

        }
    }


