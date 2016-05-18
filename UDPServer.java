import java.io.*;
import java.util.*;
import java.net.*;
public class UDPServer{
    public static void main(String[] args)throws Exception{
        DatagramSocket sock = new DatagramSocket(34567);
        DatagramPacket inPacket, outPacket;
        byte[] in = new byte[1024], out = new byte[1024];
        while(true){
            inPacket = new DatagramPacket(in, in.length);
            sock.receive(inPacket);
            out = ("FROM UDP SERVER: " + new String(inPacket.getData(),0,inPacket.getLength())).getBytes();
            System.out.println("FROM UDP CLIENT: " + new String(inPacket.getData(),0,inPacket.getLength()));
            outPacket = new DatagramPacket(out, out.length, inPacket.getAddress(), inPacket.getPort());
            sock.send(outPacket);
        }
    }
}