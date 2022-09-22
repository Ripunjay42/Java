import java.util.Scanner;
public class Commandla
{
	public static void main(String args[])
	{
		int sum=0,i;
		for(i=0;i<args.length;i++)
			sum=sum+Integer.parseInt(args[i]);
			System.out.println("sum="+sum);
	}
}

		
