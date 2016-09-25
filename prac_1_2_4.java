import edu.princeton.cs.algs4.StdOut;

public class prac_1_2_4 {
	
	public static void main(String[] args){
		String s1 = "Hello";
		String s2 = s1;
		s1 = "World!";
		
		StdOut.println(s1); // World!
		StdOut.println(s2); // Hello
	}
}