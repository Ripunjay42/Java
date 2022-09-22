import java.io.*;
public class Count
{ 
	public static void main(String args[])
		throws IOException
	{
		int cv=0,cc=0,i;			
		FileInputStream fin;
	try 
	{
		fin = new FileInputStream(args[0]);
		
	}
	catch(FileNotFoundException e) 
	{
		System.out.println("File Not Found");
		return;
	} 
	catch(ArrayIndexOutOfBoundsException e) 
	{
		System.out.println("Usage: ShowFile File");
		return;
	}
	do 
	{
		i = fin.read();
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
			
	} 
	while(i != -1);
	fin.close();
	}
}		
									
