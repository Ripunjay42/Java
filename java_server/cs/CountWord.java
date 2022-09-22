import java.io.*;
import java.io.BufferedReader;  
import java.io.FileReader;  
   
public class CountWord   
{  
    public static void main(String args[]) 
	throws IOException 
	{  
        	int i;  
        	int cv = 0;  
          	int cc=0;
        FileReader file = new FileReader("r.txt");  
        BufferedReader br = new BufferedReader(file);
         i = br.read();
	while(i != -1)
		{
			if( i =='A'|| i =='a'
					||i=='E'||i=='e'
					||i=='I'||i=='i'
					||i=='O'||i=='o'
					||i=='U'||i=='u')
					 cv=cv+1;
				else   
					 cc=cc+1;
			 
		}
			System.out.println("VOWEL:"+cv);
			System.out.println("CONSONANT:"+cc);    
			br.close();  
    }  
}  