import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServeurTCP1 

{
 public static void main(String[] args) throws Exception
 
 {
  ServerSocket sockerserver = new ServerSocket(2016);
  System.out.println("seveur en attente");
  Socket socket = sockerserver.accept();
  System.out.println("Connection d'un client");
  DataInputStream dIn = new DataInputStream(socket.getInputStream());
  System.out.println("Message:"+dIn.readUTF());
  socket.close();
  sockerserver.close();
 }   
}
