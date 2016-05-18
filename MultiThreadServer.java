import java.io.*;
import java.util.*;
import java.net.*;
public class MultiThreadServer  {
    public static void main(String[] args)throws IOException{
        ServerSocket serverSock = new ServerSocket(34567);
        while(true){
            (new Thread(new WorkerThread(serverSock.accept()))).start();
        }
    }
}
class WorkerThread implements Runnable{
    Socket sock;
    WorkerThread(Socket sock){
        this.sock = sock;
    }
    public void run(){
        try{
            BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            DataOutputStream out = new DataOutputStream(sock.getOutputStream());
            while(true){
                out.writeBytes((in.readLine()).toUpperCase());
                out.flush();
            }
        }catch(Exception e){
            
        }
        
    }
}