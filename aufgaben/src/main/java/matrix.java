

public class matrix {



	public static void main(String[] args) {

		f2();
	}

	private static void f2() {


		int Zeile = SimpleIO.getInt("Bitte eine ganze Zeile eingeben");
		int Spalte = SimpleIO.getInt("Bitte eine ganze Spalte eingeben");
		int  [][] array = new int[Zeile][Spalte];

		for (int z=0;z<Zeile;z++) {

			for (int s=0;s<Spalte;s++) {
				array[z] [s] = SimpleIO.getInt("Wie lautet die Zahl fuer Position Zeile "+(z+1)+", Spalte "+(s+1));
			}


		}


		for (int z=0;z<Zeile;z++) {


			System.out.println();
			for (int s=0;s<Spalte;s++) {
				System.out.print(" "+ array[z][s]);
			}

		}

		System.out.println("");

		System.out.print("Transpostion");

		int[][] neuerarray =new int [Spalte][Zeile];



		for (int z=0;z<Zeile;z++) {

			for (int s=0;s<Spalte;s++) {
				neuerarray[s][z] = array[z][s];

			}

		}

		for (int z=0;z<Spalte;z++) {


			System.out.println();
			for (int s=0;s<Zeile;s++) {
				System.out.print(" "+ neuerarray[z][s]);
			}

		}





	}



}




