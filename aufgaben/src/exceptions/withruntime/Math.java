package exceptions.withruntime;

public class Math {

	
	public static int devide(int i1, int i2){
		if(i2==0) {
			throw new MathException();
		}
		return i1/i2; 
	}
	
	
}
