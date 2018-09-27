package collections;
import java.util.*;
public  class Lists {

	public void insert() {
		ArrayList<String> list = new ArrayList<String>();
	
	list.add("saru");
	list.add("mathi");
	list.add("abi");
	list.add("ap");
list.remove("ap");
	
	Iterator<String> t = list.iterator();
	//ListIterator<String> u = list.listIterator();
	while(t.hasNext()) {
//		String x = (String)t.next();
//		if(x =="saru") {
//			t.remove();
//		}
		System.out.println(t.next());
		System.out.println("traversing elements in backward direction...");  
		
		}
//	while(u.hasPrevious()){  
//		System.out.println(u.previous());  
//		}
	}
	

public static void main(String[] args) {
	Lists ob = new Lists();
	ob.insert();
}
}

