package Homework3;

public class Main {

	public static void main (String [] args){
		NodeList list = new NodeList();
		Node node = new Node("Dog");
		Node node2 = new Node("Cat");
		Node node3 = new Node("Duck");
		Node node4 = new Node("Frog");
		
		
		list.add(node);
		list.add(node2);
		list.add(node3);
		list.add(node4);
		
		System.out.println("getNext and getPrev test");
		System.out.println(node4.getNext());
		System.out.println(node.getPrev());
		System.out.println(" ");
		
		System.out.println("printForward and printBackwards test");
		list.printForward();
		list.printBackward();
		System.out.println(" ");	
		
		System.out.println("findString test");
		list.find("Duck");
		list.find("Fish");
		System.out.println(" ");	
		
		list.delete(null);
		list.printForward();
		
		
	}
}
