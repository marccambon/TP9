import java.io.*;
import java.net.*;

public class ServeurUDP

{
    public static void main(String args[]) throws Exception
    {
       DatagramSocket sock = new DatagramSocket(1234);
       while (true) 
       {
        System.out.println("Waiting data");
        DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
        sock.receive(packet);
        String str = new String(packet.getData());
        int Clientport = packet.getPort();
        System.out.println("str="+str);
        
        InetAddress addr = InetAddress.getLocalHost();
        DatagramPacket packet2 = new DatagramPacket(packet.getData(), packet.getData().length, addr ,Clientport);
        sock.send(packet2);
       }
    }
}