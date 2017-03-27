package Homework3;

public class Main {

	public static void main (String [] args){
		NodeList list = new NodeList();
		
		//adds nodes to list
		list.add("Dog");
		list.add("Cat");
		list.add("Duck");
		list.add("Frog");
		
		//iterate list forwards
		list.printForward();
		System.out.println(" ");
		
		//iterate list backwards
		list.printBackward();
		System.out.println(" ");	
		
		//tests find method
		list.find("Duck");
		list.find("Fish");
		System.out.println(" ");	
		
		//tests delete method
		list.delete("Duck");
		list.printForward();
		System.out.println(" ");
		
		//tests destroy method
		list.destroy();
		list.printForward();
		
		
	}
}
