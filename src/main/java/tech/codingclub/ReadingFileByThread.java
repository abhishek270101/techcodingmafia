package tech.codingclub;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class ReadingFileByThread implements Runnable{
    //package utility;

   // public class ReadingFileByThread implements Runnable{
        String filePath;
        ReadingFileByThread(String filePath){
            this.filePath = filePath;
        }
        public void run()
        {
            ArrayList<String> str = new ArrayList<String>();
            File file = new File(filePath);
            FileReader fr = null;
            try {
                fr = new FileReader(file);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            try {
                line = br.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            while(line!=null){
                String arr[] = line.split(" ");
                for(int i=0;i<arr.length;i++)
                    str.add(arr[i].toLowerCase());
                try {
                    line = br.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
            HashMap<String,Integer> h = new HashMap<String,Integer>();
            for(int i=0;i<str.size();i++)
            {
                if(h.containsKey(str.get(i)))
                {
                    int k = h.get(str.get(i));
                    h.put(str.get(i),k+1);
                }
                else {
                    h.put(str.get(i),1);
                }
            }
            ArrayList<KeyWordCount> arr = new ArrayList<KeyWordCount>();
            for(String i : h.keySet()) {
                int k = (int)h.get(i);
                arr.add(new KeyWordCount(i,k));
            }
            String json = new Gson().toJson(arr);
            //System.out.println(json.toString());
            String convertedJson =
                    "[{\"str\":\"gujarata\",\"count\":1},{\"str\":\"mage\",\"count\":1},{\"str\":\"jaladhi\",\"count\":1},{\"str\":\"himachala\",\"count\":1},{\"str\":\"dravida\",\"count\":1},";

            ArrayList<KeyWordCount> k;
            k = new Gson().fromJson(convertedJson, new TypeToken<ArrayList<KeyWordCount>>(){}.getType());
            System.out.println(k);
            for(int i=0;i<k.size();i++)
            {
                System.out.println(k.get(i).str+" "+k.get(i).count);
            }

        }
    }


