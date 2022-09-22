import java.io.*;
import java.net.*;
public class RiClient
{
  public static void main(String[] args) throws Exception
  {
     Socket s = new Socket("127.0.0.1", 4444);
                               // reading from keyboard (keyRead object)
     BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
                              // sending to client (pwrite object)
     OutputStream ostream = s.getOutputStream(); 
     PrintWriter pwrite = new PrintWriter(ostream, true);
 
                              // receiving from server ( receiveRead  object)
     InputStream istream = s.getInputStream();
     BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
 
     System.out.println("Start the chitchat, type and press Enter key");
 
     String receiveMessage, sendMessage;               
     while(true)
     {
        sendMessage = keyRead.readLine();  // keyboard reading
	pwrite.println(sendMessage);       // sending to server
        pwrite.flush();                    // flush the data
        if((receiveMessage = receiveRead.readLine()) != null) //receive from server
        {
	    System.out.println("\n");
            System.out.println("     "+receiveMessage+"(server)"); // displaying at DOS prompt
        }         
      }               
    }                    
} 