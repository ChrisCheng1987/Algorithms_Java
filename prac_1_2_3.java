import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdOut;

public class prac_1_2_3 {
	public static void main(String[] args){
		int N = Integer.parseInt(args[0]);
		double min = Double.parseDouble(args[1]); // should be between 0 and 1
		double max = Double.parseDouble(args[2]); // should be between 0 and 1
		
		if (min>max){
			double temp = max;
			max = min;
			min = temp;
		}
		
		Interval2D[] intervals = new Interval2D[N];
		for(int i=0;i<N;i++){
			double startx = StdRandom.random()*max;
			double starty = StdRandom.random()*max;
			Interval1D x1D = new Interval1D(startx,startx+min+(max-min)*StdRandom.random());
			Interval1D y1D = new Interval1D(starty,starty+min+(max-min)*StdRandom.random());
			intervals[i] = new Interval2D(x1D,y1D);
			intervals[i].draw();
		}
	}
}