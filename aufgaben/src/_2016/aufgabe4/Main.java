package _2016.aufgabe4;

public class Main {

	public static void main(String[] args) {

		List l = new List();
		
		l.contains(12);
		
		l.add(2);
		l.add(12);
		l.add(122);
		
		if( l.contains(12) ) {
			System.out.println("OK");
		}else {
			System.out.println("ERROR");
		}
	}

}
