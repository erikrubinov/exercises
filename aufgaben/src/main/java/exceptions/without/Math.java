package exceptions.without;

public class Math {

	/**
	 * 
	 * if ok result is 0; 
	 * 
	 * other case
	 * : -22 : overflow;
	 * : -23 : zero division; 
	 * 
	 * @param i1
	 * @param i2
	 * 
	 * 
	 * @return
	 */
	public static int devide(int i1, int i2, int[] result) {
		if(i2==0) {
			return -23;
		}
		result[0] = i1/i2; 
		return 0;
		
	}
	
	
}
