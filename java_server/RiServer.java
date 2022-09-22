import java.io.*;
import java.net.*;
public class RiServer
{
  public static void main(String[] args) throws Exception
  {
      ServerSocket sersock = new ServerSocket(4444);
      System.out.println("Server  ready for chatting");
      Socket sock = sersock.accept( );                          
                              // reading from keyboard (keyRead object)
      BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
	                      // sending to client (pwrite object)
      OutputStream ostream = sock.getOutputStream(); 
      PrintWriter pwrite = new PrintWriter(ostream, true);
 
                              // receiving from client ( receiveRead  object)
      InputStream istream = sock.getInputStream();
      BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
 
      String receiveMessage, sendMessage;               
      while(true)
      {
        if((receiveMessage = receiveRead.readLine()) != null)  
        {
	   System.out.println("      "+receiveMessage+"(client)");         
        }         
        sendMessage = keyRead.readLine();
	pwrite.println(sendMessage);             
        pwrite.flush();
      }               
    }                    
}  
