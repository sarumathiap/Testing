package collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priority {
	PriorityQueue<String> q = new PriorityQueue<String>();
void dis() {
	q.add("que");
	q.add("lll");
	q.add("lll");
	q.add("okay");
	q.remove();
	//q.poll(); // remove last inserted value 
	Iterator<String> i = q.iterator();
	while(i.hasNext()) {
//		String x = (String)t.next();
//		if(x =="saru") {
//			t.remove();
//		}
		System.out.println(i.next());
		}}

public static void main(String[] args) {
	Priority ob = new Priority();
	ob.dis();
}
}
