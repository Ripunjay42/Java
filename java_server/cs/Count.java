import java.io.*;
public class Count
{ 
	public static void main(String args[])
	{
		
		File in = new File("r.txt");
		FileReader fr=null;
	try
	{
		int vowel=0,cont=0,ch;		
		fr=new FileReader(in);
		ch=fr.read();
		if(ch!=-1)
		{
		       if(ch=='A' || ch=='a'
			||ch=='E' || ch=='e'
			||ch=='I' || ch=='i'
			||ch=='O' || ch=='o'
			||ch=='U' || ch=='u')
				vowel++;
			else
				cont++;
		}
		cont-=1;
		System.out.println("VOWEL:"+vowel);
		System.out.println("CONSONANT:"+cont);
	}
	catch(IOException e)
	{
		System.out.println(e);
		System.exit(-1);	
	}
	finally{
		try{
			fr.close();
		   }
		catch(IOException e){}
		}
	}
}
		
