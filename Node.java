package Homework3;

public class Node {

		private String name;
		private Node next;
		
		public Node(String name){
			this.name = name;
			this.next = null;
		}
		
		public void setName(String name){
			this.name = name;
		}
		
		public String getName(){
			return name;
		}
 
}
