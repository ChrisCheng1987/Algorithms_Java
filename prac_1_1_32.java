// practice 1.1.32: draw histgram
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class prac_1_1_32 {
	
	private prac_1_1_32(){};
	
	
	
	public static int drawHist(int num, int N, double l, double r)
	{
		double step = (r-l)/N;
		return (int)((num-l)/step);
	}
	
	public static void main(String[] args)
	{
		double l,r;
		int N;
		l = Double.parseDouble(args[1]);
		r = Double.parseDouble(args[2]);
		N = Integer.parseInt(args[3]);
		int[] count = new int[N];
		int belong; 
		
		// read integers
		In in = new In(args[0]);
        int[] whitelist = in.readAllInts();
        
		if(r<=l)
		{
			double temp = l;
			l = r;
			r = temp;
		}
		
		for(int i=0;i<whitelist.length;i++)
		{
			if(whitelist[i]<l || whitelist[i]>r)
				continue;
			belong = drawHist(whitelist[i],N,l,r);
			count[belong] += 1;
		}
		
		for(int i=0;i<count.length;i++)
		{
			StdOut.println(count[i]); // StdOut must be used to indicate the library
		}
		
		// draw histgram
		for (int i = 0; i < N; i++)
		{
			double x = 1.0*i/N;
			double y = count[i]/2.0/StdStats.max(count); // here divide by N or max(count) because the draw is normalized to unit
			double rw = 0.5/N;
			double rh = count[i]/2.0/StdStats.max(count);
			StdDraw.filledRectangle(x, y, rw, rh);
		}
	}
}