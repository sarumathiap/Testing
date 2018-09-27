package collections;

import java.util.*;

public class Linked {
	public void insert() {
		LinkedList <String> list = new LinkedList<String>();
		LinkedList <Integer> lists = new LinkedList<Integer>();
	list.add("saru");
	list.add("mathi");
	list.add("saru");
	lists.add(4);
	
	list.remove("saru");
	lists.add(0,8); // with index value
	//list.remove(3);
	Iterator<String> t = list.iterator();
	Iterator<Integer> u = lists.iterator();
	while(u.hasNext()) {
		
		System.out.println(u.next());
		}

	}
	
	

public static void main(String[] args) {
	Linked ob = new Linked();
	ob.insert();
	
}
}
