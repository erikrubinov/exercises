
public class Rechteck_Programm {

	public static void main(String[] args) {

		Rechteck r = new Rechteck();
		r.breite = 10;
		r.laenge = 5;

		Rechteck s = new Rechteck(210, 52);
		
//		s.breite = 210;
//		s.laenge = 52;


		double flaeche = flaeche(r);

		double flaeche1 = r.flaeche();

		double flaeche2 = s.flaeche();

		

		
	}

	public static double flaeche(Rechteck this_) {
		return this_.laenge * this_.breite;
	}

	public static int plus5( int a ) {
		Rechteck s = new Rechteck();

		return a + 5;
	}

	public static int f(int [] arr) {

		{
			int a = 5;
			{
				//int a = 10;
			}
		}
		{
			int b = 5;
			{
				int a = 10;
			}
		}
		int a = 10;

		for( int x : arr) {
			int y = 10;
			System.out.print(x);
		}

		int x = 10;
		int y = x;

		return 10;
	}

}
