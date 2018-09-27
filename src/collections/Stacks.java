package collections;
import java.util.*;
public class Stacks {
static Stack<String> stack = new Stack<String>();
static void display() {
stack.push("first");
stack.push("sec");
stack.push("ok");
stack.pop();
Iterator<String> itr = stack.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}

}
public static void main(String []args) {
	//Stacks ob= new Stacks();
	display();
}
}
