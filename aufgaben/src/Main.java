
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


	public static class Pilz {
		String name;
	}


	public static class Mensch {
		
		private String name;
		private Pilz[] korb;
		private int anzahl;

		public Mensch (String name, int groesse) {
			this.name=name;
			this.korb = new Pilz[groesse];
		}


		public boolean hatPlatz() {
			return anzahl < korb.length;

		}


		public void addPilz(Pilz pilz) {
			korb[anzahl]=pilz;
			anzahl++;
		}

		public static boolean hatPlatz(Mensch _this) {
			return _this.anzahl<_this.korb.length;

		}

		public void ausgabe() {
			System.out.println(name + ":");
			for(Pilz p: this.korb) {
				if (p!=null) {
					System.out.println(p.name);
				}
			}

		}
	}




}


