import java.util.*;
class Matrix
{
	private int [][]a;
	public  Matrix(){}
	public Matrix(int n)
	{
		a=new int[n][n];
	}
	public Matrix(int m,int n)
	{
		a=new int[m][n];
	}
	public void getData()
	{
		Scanner s=new Scanner(System.in);
		int i,j;
		for(i=0;i<a.length;i++)
			for(j=0;j<a[i].length;j++)
			{
				a[i][j]=s.nextInt();
			}
	}
	public void displayData()
	{
		int i,j;
		for(i=0;i<a.length;i++)
			for(j=0;j<a[i].length;j++)
			{
				System.out.printf("  %d   ",a[i][j]);
				System.out.printf("\n");

			}
			
			
	}
	public Matrix add(Matrix b)
	{
		if(this.a.length==b.a.length&&this.a[0].length==b.a[0].length)
		{
			Matrix c=new Matrix(b.a.length,b.a[0].length);
			int i,j;
			for(i=0;i<this.a.length;i++)
				for(j=0;j<this.a[i].length;j++)
				{
					c.a[i][j]=this.a[i][j]+b.a[i][j];
				}
				return c;
		}
		else return new Matrix(0);
	}
	public Matrix diff(Matrix b)
	{
		if(this.a.length==b.a.length&&this.a[0].length==b.a[0].length)
		{
			Matrix c=new Matrix(b.a.length,b.a[0].length);
			int i,j;
			for(i=0;i<this.a.length;i++)
				for(j=0;j<this.a[i].length;j++)
				{
					c.a[i][j]=this.a[i][j]-b.a[i][j];
				}
				return c;
		}
		else return new Matrix(0);
	}
	public Matrix mult(Matrix b)
	{
		if(this.a[0].length==b.a.length)
		{
		int i,j,k;
		Matrix c=new Matrix(this.a.length,b.a[0].length);
		for(i=0;i<c.a.length;i++)
			for(j=0;j<c.a[0].length;j++)
			{
				c.a[i][j]=0;
				for(k=0;k<this.a[0].length;k++)
					c.a[i][j]=c.a[i][j]+this.a[i][k]*b.a[k][j];
			}
		return c;
		}
		else return new Matrix(0);
	}
	public Matrix transpose()
	{
	int i,j;
	Matrix c=new Matrix(this.a.length,this.a[0].length);
	for(i=0;i<this.a.length;i++)
		for(j=0;j<this.a[0].length;j++)
			{
				c.a[j][i]=this.a[i][j];
			}
	return c;

	}

}

public class Main
{
	public static void main(String[] args)
	{
		int m,n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the dimention of 1st matrix:");
		m=s.nextInt();
		n=s.nextInt();
		Matrix x=new Matrix(m,n);
		System.out.println("enter the elements:");
		x.getData();	
		System.out.println("1st matrix is:");
		x.displayData();
		System.out.println("enter the dimention of 2nd matrix:");
		m=s.nextInt();
		n=s.nextInt();
		Matrix y=new Matrix(m,n);
		System.out.println("enter the elements:");
		y.getData();	
		System.out.println("1st matrix is:");
		y.displayData();
		Matrix z;
		z=x.add(y);
		System.out.println("sum is:");
		z.displayData();
		z=x.diff(y);
		System.out.println("diff is:");
		z.displayData();
		z=x.mult(y);
		System.out.println("multiple is:");
		z.displayData();
		z=x.transpose();
		System.out.println("transpose of the 1st matrix is:");
		z.displayData();
	}
}

		
		






		

