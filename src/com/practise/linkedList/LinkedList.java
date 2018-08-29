package com.practise.linkedList;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {

	public Node head ;
		
	public static class Node{
		int data ;
		public Node next ;
		
		public Node(int d){
			data = d ;
			next = null ;
		}
	}	
	// nth node
	public int nthNode(int index) {
		Node temp = head ;
		int count = 0 ;
		//int length = (new LinkedList).findLength();
		while(temp!=null) {		
			
			if(count == index) {
				return temp.data ;
			}
			count++ ;
			temp = temp.next ;
		}
		return temp.data ;
	}
	
	
	// delete node
	public void deleteNode(Node deleteNode) {
		Node temp = head ;
		while(temp.next.data!=deleteNode.data) {
			temp = temp.next ;
		}
		temp.next = temp.next.next ;		
	}
	//length of linked list
	public int findLength() {
		Node temp = head ;
		int count = 0 ;
		if(head!=null) {			
			while(temp!= null) {
				count++ ;
				temp = temp.next ;			
			}
			return count ; 
		}
		
		return count ;
	}
	
	// shift by 2 nodes // -> Incomplete
	public List<Node> shiftBytwo() {
		List<Node> obj = new ArrayList();
		Node temp  = head ;
		Node tail = head ;
		while(temp.next!=null) {
			Node n = temp.next.next ;
			obj.add(n);
			temp = temp.next ;			
		}
		
		return obj ;	
		
	}
	
	// move last to first
	public void moveLastToFirst() {
		
		Node temp = head ;
		Node tail = head ;
		while(temp.next!=null) {
			tail = temp ;
			temp = temp.next ;
		}
		tail.next = null ;
		temp.next = head ;
		head = temp ;
		
	}
	
	
	// display list
	public void printList() {
		Node temp = head ;
		while(temp!=null) {
			System.out.print(temp.data);
			System.out.print("->");
			temp = temp.next ;
		}
		System.out.print("NULL");
	}
	//insert node 
	public void insertNode(Node newNode) {
		if(head!=null) {
			Node temp = head ;			
			while(temp.next!=null) {
				temp = temp.next ;
			}
			temp.next = newNode ;
		}else {
			head = newNode ;
		}		
	}
	//inserAt begning
	public void inserAtBegning(Node newNode) {
		Node temp = head ;
		head = newNode ;
		head.next = temp ;
	}
	//inserAt middle
		public void insertAtMiddle(Node n, Node newNode) {
			Node temp = head ;
			while(temp.data!=n.data) {
				temp = temp.next ;
			}
			Node nn = temp.next ;
			temp.next = newNode ;
			newNode.next = nn ;
		}
	
}
