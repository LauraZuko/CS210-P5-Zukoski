/*
 * Laura Zukoski
 * CS 210 - Programming and Data Structures
 * Programming Assignment 5 - Set ADT
 * Fall 2015
 */
//This class encapsulates an int value as a linked node
public class LinkedNode {
	int x;            // The data value
	LinkedNode next;  // Reference to the next LinkedNode
	
	// Default constructor
	LinkedNode() {
		next = null;
	}
	
	// Constructor that initializes the data value
	LinkedNode(int x) {
		this.x = x;
	}
	
}
