import java.util.*;
import java.net.*;
import java.io.*;
public class ImageDownload{
    public static void main(String[] args)throws Exception{
        URL url = new URL("https://placekitten.com/g/200/300");
        InputStream isr = url.openStream();
        byte[] b = new byte[4096];
        FileOutputStream fo = new FileOutputStream("data.jpg");
        int len;
        while((len=isr.read(b))> -1){
            fo.write(b, 0, len);
        }
        fo.close();
    }
}