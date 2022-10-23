package tech.codingclub;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;


public class FileUtility {

        public static boolean create(String path,String fileName) {
            return false;
        }
        public static ArrayList<String> readFile(String path)
        {
            ArrayList<String> arr = new ArrayList<String>();
            try {
                File file = new File(path);
                FileReader fr = new FileReader(file);
                BufferedReader bf = new BufferedReader(fr);
                String line =  bf.readLine();
                while (line != null) {
                    arr.add(line);
                    line=bf.readLine();
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            return arr;
        }

//        public static void main(String[] args) {
//
//              System.out.println(create("C:\\raghav\\MyFirstProject\\file","\\raghav1"));
//             readFile("C:\\raghav\\MyFirstProject\\file\\raghav");
//        }
    }


