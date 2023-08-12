import java.lang.Math;
public class LinkedList{
	
	public static void main(String [] args){

		Node first = new Node(1);
		Node current = first;
		for(int x = 0; x < 10; x++){
			Node a = new Node(Math.random());
			current.setNext(a);
			System.out.println(" Value of node " + (x) + ": " + current.data + ", address of node " + (x+1) + ": " + current.next );
			Node previous = current;
			current = a; 
			System.out.println(" pointer of node " + x  + ": " + previous.next );

			
		}
		System.out.println("Value: " + current.data + " address: " + current.next );

		for(int x = 0; x < 10; x++){
			
		}

		
		
	}
}