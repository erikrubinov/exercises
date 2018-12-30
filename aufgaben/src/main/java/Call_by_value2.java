
public class Call_by_value2 {

	public static void f (Rechteck r) {
		
		r = new Rechteck();
		System.out.println("r: " + r.laenge);
		r.laenge = 4.6;
		System.out.println("r: " + r.laenge);
	}

	public static void main (String [] args) {
		
		Rechteck s = new Rechteck();
		s.laenge = 2.1;
		System.out.println("s: " + s.laenge);
		f(s);
		System.out.println("s: " + s.laenge);
	}
}
