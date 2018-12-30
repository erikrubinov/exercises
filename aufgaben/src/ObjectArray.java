
public class ObjectArray {

	public static void main ( String [] args ) {
		Wrapper [] ws = new Wrapper [2];
		ws[0] = new Wrapper ();
		ws[1] = new Wrapper ();
		ws[0].value = 2;
		ws[1].value = 1;
		
		Wrapper w = new Wrapper();
		w.value = 0;
		
		Person p1 = new Person("Erik Rubinov");
		
		Person p = new Person("Erik", "Rubinov");
		p.setName("Erik2", "Rubinov");
	}

	public static  class Wrapper {
		int value ;
		
//		public Wrapper() {
//		}
	}		

	public static class Person{
		private String vorname;
		private String nachname;
		
		public Person(String v, String n) {
//			this.vorname = v;
//			this.nachname = n;
		}

		public Person(String n) {
			this.nachname = n;
		}

		public void setName(String v, String n) {
			this.vorname = v;
			this.nachname = n;
		}

	}
}
