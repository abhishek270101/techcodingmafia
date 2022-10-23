package tech.codingclub;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ThreadexecutorService {
    //ackage ThreadPackage;



   // public class ThreadExecutorService {

        public static void main(String[] args) {
            Taskmanager tm = new Taskmanager(10);
            for(int i=0;i<100;i++)
            {
                ThreadByRunnable t1 = new ThreadByRunnable(100+i,""+i);
                tm.addTask(t1);
            }
        }



}
