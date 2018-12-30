package exceptions.with;

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
	 * @throws MathException 
	 */
	public static int devide(int i1, int i2) throws MathException {
		if(i2==0) {
			throw new MathException();
		}
		return i1/i2; 
	}
	
	
}
