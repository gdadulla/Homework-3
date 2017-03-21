package Homework3;

public class Node {
		
		private int id;
		private String name;
		private Node next;
		private Node prev;
		
		public Node(int id, String name){
			this.id = id;
			this.name = name;
			this.next = null;
			this.prev = null;
		}
		
		public void setName(String name){
			this.name = name;
		}
		
		public String getName(){
			return name;
		}
		
		public void setId(int id){
			this.id = id;
		}
		
		public int getId(){
			return id;
		}
		public void setNext(Node node){
			this.next = node;
		}
		
		public Node getNext(){
			return next;
		}
		
		public void setPrev(Node node){
			this.prev = node;
		}
		
		public Node getPrev(){
			return prev;
		}
		
		public String toString() {
			return "Id: " + this.id + " Name: " + this.name;
		}
}
