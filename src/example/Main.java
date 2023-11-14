package example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws Exception
    {
        /*
            http://google.com
        */
        URL url = new URL("http://finance.yahoo.com/q?s=ORCL");
        URLConnection myURL = url.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(myURL.getInputStream()));
        String inputLine;
        String pattern = "<span id=\"yfs_l84_orcl\">(.+?)</span>";
        Pattern r = Pattern.compile(pattern);
        while ((inputLine = in.readLine()) != null)
        {
            if(inputLine.contains("yfs_l84_orcl"))
            {
                Matcher m = r.matcher(inputLine);
                if (m.find( )) {
                    System.out.println(m.group(1));
                }
            }
        }
        in.close();

    }
}
