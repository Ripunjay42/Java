import java.util.Scanner;
public class Comma
{
	public static void main(String[] args)
	{
		int sum=0,i;
		Scanner s=new Scanner(System.in);
		i=Integer.parseInt(args[0]);
		for( ;i>0;i--)
			sum=sum+s.nextInt();
		System.out.println("sum="+sum);
	}
}
