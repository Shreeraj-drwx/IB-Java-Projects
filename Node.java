public class Node {
	
	double data;
	Node next;
		
	public Node() {	
		data = 0;
		next = null;
	}
	public Node(double data){
		setData(data);
		next = null;
	}
	
	public Node getNext(Node next){
		return next;
	}

	public Node setData(double data){
		this.data = data;
		return this;
	}

	public Node setNext(Node next){
		this.next = next;
		return this;
	}

} 