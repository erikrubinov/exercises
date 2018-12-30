package bonnieclyde;

public class Main {
	
	public static void main(String[] args) {

		Pilz steinpilz = new Pilz();
		steinpilz.name= "steinpilz";// TODO a.1)

		Pilz champignon = new Pilz();// TODO a.1)
		champignon.name = "champignon";

		Pilz pfifferling = new Pilz(); // TODO a.1)
		pfifferling.name="pfifferlinge";

		Mensch bonnie = new Mensch("bonnie",4); // TODO a.2)

		Mensch clyde = new Mensch("clyde",3);// TODO a.2)


		Pilz[] wald = {steinpilz, champignon, champignon, pfifferling,
				steinpilz, pfifferling, champignon};

		Mensch[] menschen = { bonnie, clyde };

		sammle(wald, menschen);
	}

	public static void sammle(Pilz[] wald, Mensch[] menschen){

		int pilsmenge=0;
		for(Mensch m: menschen) {

			for (int i=pilsmenge;i<wald.length;i++){
				Pilz p= wald[i];

				//Mensch.hatPlatz(m);
				
				if (m.hatPlatz()) {
					// save pilz in korb
					m.addPilz(p);
					pilsmenge++;
					//print ou all menschen korbs
					for(Mensch x: menschen) {
						x.ausgabe();

					}
					System.out.println("---");
				}

			}
		}
	}

}
