
public final class Fakultaet {

	public static int counter = 0;
	
	public static void main(String[] args) {
		int c;
		c = 4;
		c = (5+6);
		c = add(5,6);
		
		int x = 5;
		System.out.println("Fakultät("+x+")="+fakel(x));

	}

	public static int add ( int a, int b) {
		
		if(counter < 5) {
			return add(a,b);
		}
		
		counter++;
		
		int result = a+ b;
		return result;
	}
	
	public static int fak2 (int x) {

		int res = 1;

		while (x > 1) {
			res = x * res;
			x = x - 1;
		}
		return res;
	}

	public static int fakel (final int x) {
		System.out.println("fak("+x+")");
		if (x > 1) {
			int f = fakel (x - 1);
			int result = x * f;
			System.out.println("return "+result);
			return result;
		}
		else {
			System.out.println("return 1");
			return 1;
		}
	}
	
	public static int fakl33 (int x) {
		if (x > 1) {
			int f = fakl33 (x - 1);
			return x * f;
		}
		else {
			return 1;
		}
	}

}