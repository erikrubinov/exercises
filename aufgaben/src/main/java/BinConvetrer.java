public class BinConvetrer {

	public static void main(String[] args) {
		

		int input = SimpleIO.getInt("Bitte eine ganze Zahl eingeben");
		
		
		String s = inttobinaer(input);
		
		
	
	SimpleIO.output(""+s ,"Ausgabe");
		

		
	}
	
	public static String inttobinaer(int y) {
		System.out.println("start of inttobinaer with:"+y);

		
		String result="";
		while (y>2) {
			int x=y%2;	
			char c;
			if (x==1) {
				 c='1';
			}
			else {
				 c='0';
			}
			y=y/2;
		
			
			result=c+ result;
			
		}
		System.out.println("result of inttobinaer:"+result);
		return result;
	}
	
	
	

}
