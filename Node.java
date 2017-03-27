/*
 * Germaine Dadulla
 * ICI/CEN 213
 * Professor Magnus
 * March 26, 2017
 * 
 * H3 Linked Lists Completed
 */
package Homework3;

public class Node {
		
		//instance variables
		private String name;
		private Node next;
		private Node prev;
		
		//constructor class 
		public Node(String name){
			this.name = name;
			this.next = null;
			this.prev = null;
		}
		
		//setName method with parameter String name
		public void setName(String name){
			this.name = name;
		}
		
		//getName method that returns name
		public String getName(){
			return name;
		}
		
		//setNext method that sets the next node
		public void setNext(Node node){
			this.next = node;
		}
		
		//getNext method that returns next
		public Node getNext(){
			return next;
		}
		
		//setPrev method that sets the prev node
		public void setPrev(Node node){
			this.prev = node;
		}
		
		//getPrev method that gets the prev node
		public Node getPrev(){
			return prev;
		}
		
		//toString method
		public String toString() {
			return "Name: " + this.name;
		}
}
