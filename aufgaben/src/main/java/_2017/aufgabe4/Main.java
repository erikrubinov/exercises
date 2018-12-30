package _2017.aufgabe4;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		DoppelListe o1= new DoppelListe(5,null);
		DoppelListe o2= new DoppelListe(10,o1);

		DoppelListe o3= new DoppelListe(11,o2);
		
		DoppelListe v1 = o3.finde(3);
		System.out.println("v1="+v1);

		DoppelListe v5 = o3.finde(5);
		System.out.println("v5="+v5.value);

	}

}
