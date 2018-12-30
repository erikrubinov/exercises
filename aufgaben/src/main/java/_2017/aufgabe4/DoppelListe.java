package _2017.aufgabe4;

public class DoppelListe {

	int value;
	DoppelListe next;
	DoppelListe overnext;



	public DoppelListe (int value, DoppelListe next) {
		this.value=value;
		if (next!=null) {
			this.next=next;
			this.overnext=next.next;
		}


	}

	public DoppelListe finde (int value ) {
		DoppelListe l=this;
		while (l!=null) {
			if (l.value!=value) {
				l=l.next;
			}else {
				return l;

			}
		}
		return null;
	}

	public DoppelListe rueckwerts() {
		DoppelListe l=this;
		DoppelListe res= null;
		while (l != null) {
			res=new DoppelListe(l.value,res);
			l=l.next;
		}
		return res;
	}


}
