package com.util;
import java.util.*;
public class Matrix
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
				System.out.println(a[i][j]+" ");
			}
			System.out.println("");
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
	
}


		
		





		
		






		

