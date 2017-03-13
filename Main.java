package Homework3;

public class Main {

	public static void main (String [] args){
		NodeList list = new NodeList();
		Node node = new Node("Dog");
		Node node2 = new Node("Cat");
		Node node3 = new Node("Duck");
		
		list.add(node);
		list.add(node2);
		list.add(node3);
		
		System.out.println("getNext and getPrev test");
		System.out.println(node2.getNext());
		System.out.println(node2.getPrev());
		System.out.println(" ");
		
		System.out.println("printForward and printBackwards test");
		list.printForward();
		list.printBackward();
		System.out.println(" ");
		
		
		
		System.out.println("findString test");
		list.findString("Duck");
		list.findString("Fish");
		
	}
}
