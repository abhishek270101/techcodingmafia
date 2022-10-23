//package tech.codingclub;
////import com.google.gson.Gson;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
////import org.jsoup.nodes.Element;
////import org.jsoup.select.Elements;
//
//import java.io.IOException;
//
//public class WikiPediaFetcher implements Runnable{
//    //package utility;
//
//   // public class WikiPediaFetcher implements Runnable {
//        private String  keyWord;
//        private String  response;
//        WikiPediaFetcher(String keyWord)
//        {
//            this.keyWord = keyWord;
//        }
//        public void run() {
//            if (keyWord == "" || keyWord.length() == 0)
//                return;
//            this.keyWord = this.keyWord.trim().replaceAll(" ", "_");
//            String url = "https://en.wikipedia.org/wiki/" + this.keyWord;
//            // String url = "https://en.wikipedia.org/wiki/Albert_Einstein";
//            String wikiresponse;
//            try {
//                wikiresponse = HttpURLConnectionExample.sendGet(url);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//            Document document = Jsoup.parse(wikiresponse);
//
//            Elements childElements=  document.body().select(".mw-parser-output > *");
//            int state=0;
//            for(Element childElement : childElements)
//            {
//                if(state==0)
//                {
//                    if(childElement.tagName().equals("table"))
//                    {
//                        state=1;
//                    }
//                }
//                else if(state==1)
//                {
//                    if(childElement.tagName().equals("p"))
//                    {
//                        state=2;
//                        response = childElement.text();
//                    }
//                }
//            }
//            //System.out.println(response);
//            String imgUrl = document.body().select(".infobox img").get(0).attr("src");
//            System.out.println(imgUrl);
//            WikiResult  wikiResult = new WikiResult(this.keyWord,response,imgUrl);
//            System.out.println(new Gson().toJson(wikiResult));
//
//        }
//        public static void main(String[] args) {
//            Taskmanager tm = new Taskmanager(10);
//            String arr[] = {"India","United States"};
//            for(int i=0;i<arr.length;i++) {
//
//                WikiPediaFetcher wpf = new WikiPediaFetcher(arr[i]);
//                tm.waitTillQueueSizeIsFreeAndAddTask(wpf);
//            }
//
//        }
//
//
//}
