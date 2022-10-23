package tech.codingclub;
//package SongsDownloder;

import database.GenericDB;
import entity.coders;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import tech.codingclub.tables.Songs;
import java.io.IOException;
import java.util.ArrayList;

public class SongsDownload implements  Runnable{
        String url;
        public SongsDownload(String url)
        {
            this.url = url;
        }
        public void run()
        {
            String str = "";
            try {
                str =  HttpURLConnectionExample.sendGet(url);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Document document =    Jsoup.parse(str);
            Elements  elements =  document.body().select(".col-md-12 .list a");
            for(Element element : elements)
            {
                // System.out.println(element.text());
                SongResult song =  new SongResult(element.text(),element.attr("href"));

                new GenericDB<SongResult>().addRow(tech.codingclub.tables.Songs.SONGS,song);
            }
        }

        public static void main(String[] args) {
            Taskmanager tm = new Taskmanager(5);
            ArrayList<String> arr = FileUtility.readFile("C:\\Users\\hp\\IdeaProjects\\techcodingmafia\\src\\main\\java\\tech\\codingclub\\songlist.txt");
            //System.out.println(arr);

            for(String str : arr) {
                SongsDownload sd = new SongsDownload(str);
                tm.waitTillQueueSizeIsFreeAndAddTask(sd);
            }

        }

    }


