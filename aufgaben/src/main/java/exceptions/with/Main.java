package exceptions.with;

public class Main {

	public static void main(String[] args) {
		
		int input1 = 30;
		int input2 = 4;
		
		try {
			int result = calculate(input1, input2);
			
			System.out.println("result: "+ result);

		} catch (MathException e) {
			System.out.println("error");
		}
		
		//fffff

	}

	private static int calculate(int input1, int input2) throws MathException {
		int result = Math.devide(input1, input2);
		return result;
	}

	private static int calculate2(int input1, int input2){
		try {
			return Math.devide(input1, input2);
		} catch (MathException e) {
			return 0;
		}
	}

}
