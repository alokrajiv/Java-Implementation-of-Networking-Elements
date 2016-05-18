import java.io.*;
import java.util.*;
import java.net.*;
public class WebClient{
    public static void main(String[] args)throws Exception{
        Socket client = new Socket("23.38.230.138", 80);
        DataOutputStream out = new DataOutputStream(client.getOutputStream());
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        String header = "Get  /index.html  HTTP/1.1\nHost: www.oracle.com\n\n", str;
        out.writeBytes(header);
        FileWriter fw = new FileWriter("data.sav");
        while((str=in.readLine())!=null){
            fw.write(str + "\n");
            System.out.println(str + "\n");
        }
        fw.close();
    }
}