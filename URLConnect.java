import java.io.*;
import java.net.*;
import java.util.*;
public class URLConnect{
    public static void main(String[] args)throws Exception{
        URL u = new URL("http://google.com");
        URLConnection connObj = (URLConnection)u.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(connObj.getInputStream()));
        String in;
        System.out.println("Content-Type : " + connObj.getContentType());
        System.out.println("Content-Length : " + connObj.getContentLength());
        while((in = br.readLine()) != null ){
            System.out.println(in);
        }
    }
}