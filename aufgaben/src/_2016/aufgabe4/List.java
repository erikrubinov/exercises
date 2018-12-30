package _2016.aufgabe4;

import java.util.LinkedList;

public class List {

	private Element head;

	public List() {
		this.head = null;
	}
	
	public void add(int value) {
		Element p=new Element(value,head);
		head=p;
	}

	public boolean contains(int value) {
		if (head==null) {
			return false;
		}
		else {
			return head.contains(value);
		}
	}
	
	public boolean contains2(int value) {
		Element l = head;
		while (l.next!=null) {
			if (l.value!=value) {
				l=l.next;
			}else {
				return true;
			}
		}
		return true;
	}

	public LinkedList<Integer> copyElement() {
		return null;
	}
}









