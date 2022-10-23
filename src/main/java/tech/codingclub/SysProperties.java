package tech.codingclub;
import java.net.URL;
import java.util.Properties;

public class SysProperties {
   // package utility;


    //public class SysProperties {
        private static Properties prop =null;
        private SysProperties(){

        }
        public static Properties getInstance(){
            if(prop==null)
            {
                ClassLoader loader = SysProperties.class.getClassLoader();
                if(loader ==null)
                    loader = ClassLoader.getSystemClassLoader();
                String propFile = "application.properties";
                URL url = loader.getResource(propFile);
                prop = new Properties();
                try{
                    prop.load(url.openStream());
                }
                catch (Exception e)
                {
                    System.out.println(e);
                }
            }
            return  prop;
        }
        public static String getPropertyValue(String key)
        {

            return SysProperties.getInstance().getProperty(key);
        }

        public static void main(String[] args) {

            System.out.println(SysProperties.getPropertyValue("DB_PASSWORD"));
        }


}
