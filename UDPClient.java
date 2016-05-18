import java.io.*;
import java.util.*;
import java.net.*;
public class UDPClient{
    public static void main(String[] args)throws Exception  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DatagramSocket sock = new DatagramSocket();
        DatagramPacket inPacket, outPacket;
        byte[] in = new byte[1024], out = new byte[1024];
        while(true){
            out = (br.readLine()).getBytes();
            outPacket = new DatagramPacket(out, out.length, InetAddress.getByName("127.0.0.1"), 34567);
            sock.send(outPacket);
            inPacket = new DatagramPacket(in, in.length);
            sock.receive(inPacket);
            System.out.println(new String(inPacket.getData(),0,inPacket.getLength()));
        }
    }
}