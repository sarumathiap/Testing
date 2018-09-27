package collections;

import java.util.ArrayDeque;

import java.util.*;   


public class Deques {

	public static void main(String[] args) {   

	//Creating Deque and adding elements   

	Deque<String> deque = new ArrayDeque<String>();   

	deque.add("Gautam");   

	deque.add("Karan");   

	deque.add("Ajay");   
	//deque.removeLast();
	//deque.remove();
	
	//Traversing elements   

	for (String str : deque) {   

	System.out.println(str);   

	} 
	boolean returnval = deque.remove("karan"); 
	if (returnval==true) {
		System.out.println("okay");
	}}   

	}   

