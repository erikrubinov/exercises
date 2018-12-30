
public class Mensch {
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







