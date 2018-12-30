
public class Call_by_value {

	public static void f (double r) {
		
		
		System.out.println("r: " + r);
		r = 4.6;
		System.out.println("r: " + r);
	}

	//	public static void f (double[] r) {
	//		r[0] = 4.6;
	//	}

	//	public static void f (double[] r) {
	//
	//		r = new double[3];
	//		r[0] = 4.6;
	//	}

	public static void main (String [] args) {
		
		double s = 2.1;
		System.out.println("s: " + s);
		f(s);
		System.out.println("s: " + s);
	}

	//	public static void main (String [] args) {
	//
	//		double[] s = new double[3];
	//
	//		s[0] = 2.1; 
	//
	//		System.out.println("s: " + s[0]);
	//
	//		f(s);
	//
	//		System.out.println("s: " + s[0]);
	//	}
}
