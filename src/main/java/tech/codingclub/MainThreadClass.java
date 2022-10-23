package tech.codingclub;
//package ThreadPackage;
public class MainThreadClass {



    //public class MainThreadClass {
        public static void main(String[] args) {
            ThreadByExtendsThreadClass th1 = new ThreadByExtendsThreadClass(50,"A");
            ThreadByExtendsThreadClass th2 = new ThreadByExtendsThreadClass(100,"B");
            ThreadByExtendsThreadClass th3 = new ThreadByExtendsThreadClass(100,"C");
            // th1.start();
            //th2.start();
            // th3.start();
            ThreadByRunnable  run1 = new ThreadByRunnable(50,"A");
            ThreadByRunnable  run2 = new ThreadByRunnable(100,"B");
            ThreadByRunnable  run3 = new ThreadByRunnable(200,"C");
            Thread t1 = new Thread(run1);
            Thread t2 = new Thread(run2);
            Thread t3 = new Thread(run3);
            t1.start();
            t2.start();
            t3.start();
        }

}
