public class BinConvetrer2 {

	public static void main(String[] args) {

		int v = -31;
		String inttobinaer = inttobinaer(v);
		System.out.println("inttobinaer:\t"+inttobinaer);

		int back = binaer2int(inttobinaer);
		System.out.println("binaer2int:\t"+back);

		String zweiCompliment = zweiCompliment(inttobinaer);
		System.out.println("zweiCompliment:\t"+zweiCompliment);


		//		int input = SimpleIO.getInt("Bitte eine ganze Zahl eingeben");
		//		
		//		
		//		String s = inttobinaer(input);
		//		
		//		
		//	
		//		SimpleIO.output(""+s ,"Ausgabe");



	}

	
	public static int binaer2int(final String binary) {

		int result = 0;
		for(int i = binary.length()-1; i >= 1; i--) {
			int posValue = binary.charAt(i) == '1' ? 1<<(7-i) : 0;
			//System.out.println("pos: "+i+ "; posValue:"+posValue);
			result = result + posValue;
		}
		if(binary.charAt(0) == '1') {
			result = -result;
		}
		return result;
	}

	public static String inttobinaer(final int arg) {
		//System.out.println("start of inttobinaer with:"+arg);

		int y = (arg >=0) ? arg: -arg;

		String result = new String("");

		while (y>0) {
			final int x=y%2;	
			char c;
			if (x==1) {
				c= '1';
			}
			else {
				c='0';
			}
			y=y/2;


			result = c + result;

		}

		//l ist die Anzahl der fehlenden Bits
		final int l = 7 - result.length();

		for (int i=1;i<=l;i++) {
			result=	'0'+result;
		}

		final char leadingBit = (arg >= 0) ? '0' : '1';

		result = leadingBit+result;

		//System.out.println("result of inttobinaer:"+result);
		return result;
	}


	public static boolean isPositive(final String binary) {
		return binary.charAt(0) == '0';
	}


	public static String zweiCompliment(final String binary) {

		if(isPositive(binary)) {
			return binary;
		}
		else {
			String compliment = compliment(binary);
			String plus1 = plus1( compliment );
			return plus1;
		}
	}

	public static String compliment(final String binary2compliment) {

		if(isPositive(binary2compliment)) {
			return binary2compliment;
		}

		String result = "";
		for( int i = 0; i < binary2compliment.length(); i++) {
			char c = (binary2compliment.charAt(i)=='0') ? '1': '0';
			result = result + c;
		}
		return result;
	}

	public static String plus1(final String arg) {

		String result = "";
		char add = '1'; 

		for(int i = arg.length()-1; i >= 0; i--) {
			char res;
			if( arg.charAt(i) == '1') {
				if( add == '1' ) {
					res = '0';
					add = '1';
				}
				else {
					res = '1';
					add = '0';

				}
			}
			else {
				if( add == '1' ) {
					res = '1';
					add = '0';
				}
				else {
					res = '0';
					add = '0';
				}
			}
			result = res+result;
		}
		return result;
	}

	

}
