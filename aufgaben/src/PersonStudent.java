
public class PersonStudent {

	
	public static void main(String[] args) {
		
		f(2);
		
		new Person(1);
		new Student();
	//	new Student(1,"v", "n", true, 22);
	}
	
	
	private static void f(int x) {
		g();
	}
	
	private static void g() {
		
	}
	
	public static class Person extends Object{

		int key; 
		boolean male;
		String vorname, nachname;

		public Person () {
			this.key = 10;
		}

		public Person (int key) {
//			this.key = key;
		}

		public Person ( int key, String vorname, String nachname, boolean male) {

//			this.key = key;
//			this.vorname = vorname;
//			this.nachname = nachname;
//			this.male = male;
		}
	}


	public static class Student extends Person {
		int matrikelnr;
		
		public Student() {
			super();
			//super(1, "n", "", false);
			matrikelnr = 22;
		}

		public Student( int key, String vorname, String nachname, boolean male) {
			//super(1, "n", "", false);
			matrikelnr = 22;
		}


//		public Student() {
//			super(2+2);
//			matrikelnr = SimpleIO.getInt("Matrikelnr");
//		}
//
//		public Student (int key, String vorname, String nachname, boolean male, int matrikelnr) {
//
//			super (key, vorname, nachname, male);
//
//			this.matrikelnr = matrikelnr;
//		}
	}
	
	public static class Student2 {
		
		int key; 
		boolean male;
		String vorname, nachname;
		int matrikelnr;
		
		public Student2() {
			super();
		}
	}
}
