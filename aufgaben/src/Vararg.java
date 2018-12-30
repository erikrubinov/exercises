
public class Vararg {

	public static int addiere (int... args) {

		int x = 0;
		for (int i : args) {
			x = x + i;
		}
		return x;
	}

	public static int addiere2 (int[] args) {

		int x = 0;
		for (int i : args) {
			x = x+i;
		}
		return x;
	}

	public static int addiere3(int arg1, int arg2, int arg3, int arg4) {

		int[] args = new int[] { arg1,arg2,arg3,arg4};
		
		int x = 0;
		for (int i : args) {
			x += i;
		}
		return x;
	}

	public static void main (String [] args) {

		System.out.println( addiere( new int[] { 1,2,3,7} ) );
		
		System.out.println( addiere(1,2,3,7) );

	}
}
