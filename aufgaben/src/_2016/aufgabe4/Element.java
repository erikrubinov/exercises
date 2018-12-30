package _2016.aufgabe4;

public class Element {

	int value;
	Element next;

	public Element(int value, Element next) {
		this.value=value;
		this.next=next;
	}

	public boolean contains(int value) {
		Element l=this;
		while (l.next!=null) {
			if (l.value!=value) {
				l=l.next;
			}else {
				return true;
			}
		}
		return true;
	}
}


