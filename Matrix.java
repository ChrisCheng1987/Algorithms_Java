// Practice 1.1.33. Create a Matrix library to implement vector dot, product(Mat-Mat, Vec-Mat, Mat-Vec, through overload), transpose,
import edu.princeton.cs.algs4.StdOut;

public class Matrix{
	
	public static double[] dot(double[] a, double[] b)
	{
		double[] c = new double[a.length];
		if(a.length!=b.length)
		{
			StdOut.println("Vector sizes must match!");
			return c;
		}
		
		if(a.length==0 || b.length==0)
		{
			StdOut.println("Vector is empty!");
			return c;
		}
		
		for(int i=0;i<a.length;i++)
		{
			c[i] = a[i] * b[i];
		}
		return c;
	}
	
	public static double[][] mult(double[][] a, double[][] b)
	{
		double[][] c = new double[a.length][a.length];
		if(a.length==0 || b.length==0)
		{
			StdOut.println("Error: Vector is empty!");
			return c;
		}
		if(a.length!=a[0].length || b.length!=b[0].length)
		{
			StdOut.println("Error: Matrix must be square");
			return c;
		}
		if(a.length!=b.length)
		{
			StdOut.println("Vector sizes must match!");
			return c;
		}
		int size = a.length;
		for(int i=0;i<size;i++)
			for(int j=0;j<size;j++)
				for(int k=0;k<size;k++)
				{
					c[i][j] += a[i][k] * b[k][j];
				}
		
		return c;
	}
	
	public static void main(String[] args)
	{
		int[][] c = new int[3][4];
		int d = c[1].length;
		StdOut.println(d);
	}
}