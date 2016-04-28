/*
 * Laura Zukoski
 * CS 210 - Programming and Data Structures
 * Programming Assignment 5 - Set ADT
 * Fall 2015
 */

import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// create set object and scanner
		Set set = new Set();		
		Scanner reader = new Scanner(System.in);
		// display header
		System.out.println("CLASS: 70-210, Lewis University");
		System.out.println("NAME: Laura Zukoski");
		System.out.println("PROGRAMMING ASSIGNMENT 5 - SET");
		
		// define variables
		int infinite = 1;
		String command, com;
		int num;
		String[] comArray;
		// enter infinite loop
		while (infinite > 0) {
			do{
				// catch input exceptions, prompt user to re-enter 
				// splits input into command and int
				try {
					System.out.print("\nEnter command: ");
					com = reader.nextLine();
					comArray = com.split(" ");
					command = comArray[0];
					num = Integer.parseInt(comArray[1]);
				} catch(ArrayIndexOutOfBoundsException e) {
					System.out.print("Invalid Input\nEnter a command and a number: ");
					com = reader.nextLine();
					comArray = com.split(" ");
					command = comArray[0];
					num = Integer.parseInt(comArray[1]);
				} catch(NumberFormatException e) {
					System.out.print("Invalid Input\nEnter a command and a number: ");
					com = reader.nextLine();
					comArray = com.split(" ");
					command = comArray[0];
					num = Integer.parseInt(comArray[1]);
				}
				// for corresponding command call set function
				// else prompt user to enter correct format
				switch (command)
				{
				case "add":
					set.add(num);
					System.out.print(set.toString());
					break;
				case "del":
					set.delete(num);
					System.out.print(set.toString());
					break;
				case "exists":
					System.out.print(set.exists(num));
					break;
				default:
					System.out.print("Invalid action. You can 'add', 'del' or 'exists'.");
					break;
				}	
			} while(command != "add" || command != "del" || command != "exists");
		}
		reader.close();

	}
}