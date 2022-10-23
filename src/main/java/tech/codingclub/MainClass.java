package tech.codingclub;

public class MainClass {
   // package utility;

   // public class MainClass {

        public static void main(String[] args) {
            ReadingFileByThread rf = new ReadingFileByThread("C:\\raghav\\MyFirstProject\\file\\raghav");
            Taskmanager tm = new Taskmanager(1);
            //  tm.waitTillQueueSizeIsFreeAndAddTask(rf);
        }


}
