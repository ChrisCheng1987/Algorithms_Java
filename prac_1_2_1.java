import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdOut;

public class prac_1_2_1 {
	
	
	public static void main(String[] args)
	{
		int N = Integer.parseInt(args[0]);
		double minDist = 1.5; // the maximum distance in a unit square is sqrt(2)
		Point2D[] points = new Point2D[N];
		
		for(int i=0;i<N;i++)
		{
			points[i] = new Point2D(StdRandom.random(),StdRandom.random());
			points[i].draw();
		}
		
		for(int i=0;i<N-1;i++)
			for(int j=i+1;j<N;j++)
			{
				double dist = points[i].distanceTo(points[j]);
				if(dist<minDist)
					minDist = dist;
			}
		StdOut.println(minDist);
	}
}