public class Nutzerfrage {

	public static void main(String[] args) {

		//Nutzer wird nach Eingabemethode gefragt

		String answer= 	SimpleIO.getString("Bitte ja für dez.zu binär und nein für binär zu dez.");


		//Abhängig von seiner Entscheidung wird die Zahl in die jeweilige Funktion eingesetzt

		//Ergebnis wird im Ausgabe

		while (!(answer.equals("ja")|| answer.equals("nein"))){
			answer =SimpleIO.getString("Bitte ja für dez.zu binär und nein für binär zu dez.");
		}	 


		if 	(answer.equals("ja")) {
			int result = SimpleIO.getInt("Bitte eine ganze Zahl eingeben");
			while (result>127||result<-128) {
				result= SimpleIO.getInt("Bitte eine ganze Zahl zwischen -128 bis 127 eingeben");
			}
			String ergebnis = inttobinaer(result);
			SimpleIO.output(ergebnis,"Ausgabe");
		} 
		else{
			String result= SimpleIO.getString("gebe eine Binärzahl ein");
			while (provebinaer(result)==false) {
				result= SimpleIO.getString("gebe eine gültige Binaerzahl ein");
				
			}
			int ergebnis= binaer2int(result);
			String ergebnis_string=""+ ergebnis;
			SimpleIO.output(ergebnis_string,"Ausgabe");
		}


	}



	public static boolean provebinaer(String binaer) {
		if (binaer.length()!=8){
			return false;
		}
		else {
			return true;
		}

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

		String result="";

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

