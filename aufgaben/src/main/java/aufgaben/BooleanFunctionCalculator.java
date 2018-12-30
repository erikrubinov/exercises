package aufgaben;

public class BooleanFunctionCalculator {

	public static void main( String[] arg) {

		System.out.println("Result 1");
		aufgabe(BooleanFunctionCalculator::aufgabe1);
		System.out.println("Result 2");
		aufgabe(BooleanFunctionCalculator::aufgabe2);
	}

	public static void aufgabe(FourParameter f) {
		for( int x0 = 0; x0 < 2; x0++) {
			for( int x1 = 0; x1 < 2; x1++) {
				for( int x2 = 0; x2 < 2; x2++) {
					for( int x3 = 0; x3 < 2; x3++) {
						boolean unequal = f.apply(x0, x1, x2, x3);
						if(unequal) {
							System.out.println(String.format("%d %d %d %d",x3,x2,x1,x0 ));
						}
					}
				}
			}
		}
	}

	private static boolean aufgabe1(int x0, int x1, int x2, int x3) {
		boolean original = aufgabe1_f1(tob(x3),tob(x2),tob(x1),tob(x0));
		boolean fault = aufgabe1_f1_fault(tob(x3),tob(x2),tob(x1),tob(x0));
		return original != fault;
	}

	private static boolean aufgabe2(int x0, int x1, int x2, int x3) {
		boolean original = aufgabe2_f1(tob(x3),tob(x2),tob(x1),tob(x0));
		boolean fault = aufgabe2_f1_fault(tob(x3),tob(x2),tob(x1),tob(x0));
		return original != fault;
	}

	public static boolean aufgabe1_f1(boolean x3, boolean x2, boolean x1, boolean x0) {
		return ( ( (( (!x3) && (x3||x2) ) || ( x2 || x0 ))  && (!(x2&&x1))) ) && (  (!(x2&&x1)) || (!( (x2&&x1) || (x1&&x0) ) ) );
	}

	public static boolean aufgabe1_f1_fault(boolean x3, boolean x2, boolean x1, boolean x0) {
		return ( (( (!x3)                 || ( x2 || x0 ))  && (!(x2&&x1))) ) && (  (!(x2&&x1)) || (!( (x2&&x1) || (x1&&x0) ) ) );
	}

	public static boolean aufgabe2_f1(boolean x3, boolean x2, boolean x1, boolean x0) {
		return ( ((x3&&x2) || (x2 || x1)) && (!(x1&&x2)) ) || (!(x1&&x0));
	}

	public static boolean aufgabe2_f1_fault(boolean x3, boolean x2, boolean x1, boolean x0) {
		return ( ((x3&&x2) || (x2)) && (!(x1&&x2)) ) || (!(x1&&x0));
	}

	private static boolean tob(int v) {
		return v == 1;
	}
	
	interface FourParameter{
		boolean apply(int x3, int x2, int x1, int x0);
	}
}
