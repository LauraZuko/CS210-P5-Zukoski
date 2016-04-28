/*
 * Laura Zukoski
 * CS 210 - Programming and Data Structures
 * Programming Assignment 5 - Set ADT
 * Fall 2015
 */

import java.util.*;

public class Set{
	LinkedNode front;  // Reference to the first LinkedNode in the list
	int count;         // Number of nodes in the list
	
	// Constructor - initializes the front and count variables
	Set() {
		front = null;
		count = 0;
	}

	// Adds number if it doesn't already exist
	void add (int data) {
		LinkedNode newNode = new LinkedNode(data);
		if (front == null)
			front = newNode;
		else if (exists(data) == true)
			newNode = newNode.next;	
		else{
			newNode.next = front;
			front = newNode;
		}    	
    	count++;
	}
	
	
	// deletes number, sets the next number to front if deleted number was front
	// sets the next node to previous nodes reference if not front
	public void delete (int data) {
		LinkedNode currentNode = front;
		LinkedNode prevNode = null;
		while(currentNode != null) {
			if(data == (currentNode.x)) {
				if(prevNode == null) {
					front = currentNode.next;
					
				} else {
					prevNode.next = currentNode.next;
				}
				count--;
			} else {
				prevNode = currentNode;
			}
			currentNode = currentNode.next;
		}
	}
	
	// checks to see if number if in list
	public boolean exists (int data) {
		LinkedNode currentNode = front;
		while(currentNode != null) {
			if(data == (currentNode.x)) {
				return true;
			}
			currentNode = currentNode.next;	
		} 	
		return false;		
	}
		
	
	
	// This method returns a String containing seperated by space
	public String toString() {
		String str = "";
		
		LinkedNode cur = front;
		while (cur!=null) {
			str += cur.x + " ";
			cur = cur.next;
		}		
		return str;
	}
}