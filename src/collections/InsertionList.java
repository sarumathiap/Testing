package collections;
import java.util.*;


import java.io.*; 
  

class InsertionList {
	static  Node head;
  static class Node{
	
	  int data;
	  Node next;
	
	  Node(int d){
		  data =d;
		  next = null;
	  }
  }
	static void insertmid(int x) {
		if (head==null)
		
			head = new Node(x);
		else {
		Node newnode = new Node(x);
		Node ptr = head;
		int len=0;
		while(ptr != null)
		{
	
			len++;
			ptr = ptr.next;
		}
		  int count = ((len % 2) == 0) ? (len / 2) : 
              (len + 1) / 2; 
			ptr = head;
		while (count-- > 1) {
			ptr=ptr.next;
			newnode = ptr.next;
			ptr.next = newnode;
		}}
	}
	
	static void display() {
		Node temp = head;
		while(temp!= null) {
			temp = temp.next;
			System.out.println(temp.next);
		}
	}
	public static void main(String []args ) {
		head = null;
	
		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(4);
		head.next.next.next = new Node(5);
		display();
		int x =3;
		insertmid(x);
		display();
	}
	  }
