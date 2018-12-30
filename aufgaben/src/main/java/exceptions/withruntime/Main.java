package exceptions.withruntime;

public class Main {

	public static void main(String[] args) {

		int input1 = 30;
		int input2 = 4;

		try {

			calculate(input1, input2);

		} catch (Exception e) {
			System.out.println("error");
		}
	}

	private static void calculate(int input1, int input2) {

		int result = Math.devide(input1, input2);
		System.out.println("result: "+ result);

	}

}
