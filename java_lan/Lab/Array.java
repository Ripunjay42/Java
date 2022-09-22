import java.util.Scanner;
public class Array
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("input the array:");
		for(int i=0;i<5;i++)
			a[i]=s.nextInt();
		System.out.println("the array is:");
		for(int i:a)
			System.out.println(i);
	}
}
