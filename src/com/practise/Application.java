package com.practise;

import com.practise.linkedList.LinkedList;
import com.practise.linkedList.LinkedList.Node;

public class Application {

	
	public static void main(String arg[]) {
		
		Application obj = new Application();
	
		// Linked List basics
		
		LinkedList lklist = new LinkedList();
		
		lklist.insertNode(new Node(11));
		lklist.insertNode(new Node(12));		
		lklist.inserAtBegning(new Node(10));	
		
		lklist.printList();
		
		int nthNode = lklist.nthNode(3);
		System.out.println(nthNode);
		
		/*lklist.insertAtMiddle(new Node(11), new Node(9));	
		
		lklist.printList();
		
		System.out.println(" ");
		
		lklist.deleteNode(new Node(9));
		
		lklist.moveLastToFirst();

		int length = lklist.findLength();
		System.out.println(length);*/
		
		
		
	}
}
