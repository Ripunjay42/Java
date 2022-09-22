import java.util.Scanner;
public class Fact
{
	public static void main(String args[])
	{
		int a,f=1;
		Scanner s=new Scanner(System.in);
		System.out.println("input a number;");
		a=s.nextInt();
		for(int i=a;i!=0;i--)
			f=f*i;
		System.out.println("result is" +f);
	}
}
 
