package test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;

public class InputOutputurl
    {

public static void main(String[] args)
    {
    URLConnection urlcon=null;

    try
    {

    URL url = new URL("https://www.firstpost.com/firstcricket/sports-news");
        urlcon=url.openConnection();

    }catch(Exception e)
    {
        e.printStackTrace();
    }

    try
    (    BufferedInputStream bio=new BufferedInputStream(urlcon.getInputStream());
        FileOutputStream fio=new FileOutputStream("cricket.html");        
    )
    {
        byte [] b=new byte[128];
         int bytes= 0;
     while((bytes=bio.read(b))!=-1){



         fio. write(b,0,bytes);


     }
    }catch(Exception e
            )
    {
        e.printStackTrace();
    }
    }
}