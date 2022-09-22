import java.util.Scanner;
public class Prime
{
	public static void main(String args[])
	{
		int n,i,t;
		boolean isPrime=true;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number to check prime:");
		n=s.nextInt();
		if(n==0||n==1)
		System.out.println(n+"is not prime");
		for(i=2;i<n/2;i++)
		{
		  t=n%i;	
		  if(t==0)
		  {
			isPrime=false; 
				break;	
		   }
		}
		   	
		if(isPrime)
			System.out.println(n+" is a prime number");
		else
			System.out.println(n+" is not a prime number");
				

	}

}
