package exceptions.without;

public class Main {

	public static void main(String[] args) {
		
		int input1 = 30;
		int input2 = 0;
		int[] result = new int[1];
		
		int error = Math.devide(input1, input2, result);
		
		if(error != 0) {
			System.out.println("could nor calculate, error code: "+error);
			return;
		}
		
		System.out.println("result: "+ result[0]);

	}

}
