
public final class Rechteck {
		
		public double laenge, breite;
		public int strichstraerke;
		
		public static int counter = 0;
		
		public Rechteck() {
			this.breite = 0;
			this.laenge = 0;
		}

		public Rechteck(Rechteck other) {
			this.breite = other.breite;
			this.laenge = other.laenge;
		}

		public Rechteck(double laenge, double breite) {
			this.breite = breite;
			this.laenge = laenge;
		}

		public double flaeche() {
			laenge = 6;
			return laenge * breite;
		}
		
		public static double flaeche(Rechteck this_) {
			this_.breite = 6;
			return this_.laenge * this_.breite;
		}
		
	}