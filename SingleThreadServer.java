import java.io.*;
import java.util.*;
import java.net.*;
public class SingleThreadServer  {
    public static void main(String[] args)throws IOException{
        Socket sock = (new ServerSocket(34567)).accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
        DataOutputStream out = new DataOutputStream(sock.getOutputStream());
        while(true){
            out.writeBytes((in.readLine()).toUpperCase());
            out.flush();
        }
    }
}