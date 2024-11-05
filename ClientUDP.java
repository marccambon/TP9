import java.io.*;
import java.net.*;

public class ClientUDP

{
    public static void main(String args[]) throws Exception
    {
        InetAddress addr = InetAddress.getLocalHost();
        System.out.println("adresse="+addr.getHostName());
        String s = "tpsocket";
        byte[] data = s.getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length, addr,1234);
        DatagramSocket sock = new DatagramSocket();
        sock.send(packet);
        

        while(true)
        {
        DatagramPacket packet3 = new DatagramPacket(new byte[1024], 1024);
        sock.receive(packet3);
        String s2 = "message receive";
        byte[] data2 = s2.getBytes();
        String str = new String(data2);
        System.out.println("str="+str);
        
        }
    }
}