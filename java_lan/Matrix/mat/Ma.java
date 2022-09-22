package matrix;
import matrix.Matrix;
public class Ma
{
	public static void main(String[] args)
	{
		Matrix a=new Matrix(2);
		Matrix b=new Matrix(2);
		Matrix c;
		a.getData();
		b.getData();
		c=a.add(b);
		c.displayData();
	}
}
