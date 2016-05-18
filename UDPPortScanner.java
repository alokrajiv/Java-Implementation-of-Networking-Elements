import java.io.*;
import java.net.*;
import java.util.*;
public class UDPPortScanner{
    public static void main(String[] args){
        DatagramSocket sock;
        for(int i =1; i<64000;i++){
            try{
                sock = new DatagramSocket(i);
                System.out.println(i + " Port is available");
            }catch(Exception e){
                continue;
            }
        }
    }
}