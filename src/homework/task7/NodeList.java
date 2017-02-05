package homework.task7;

public class NodeList {
	private Node first;
	
	public NodeList(){
		first = null;
	}
	
	public Node getFirst(){
		return first;
	}
	
	public boolean isEmpty() {
		return (first==null);
	}
	
	public void insertFirst(int el){
		Node newNode = new Node(el);
		newNode.next = first; 
		first = newNode;
	}
	
	public void print(){
		Node current = first;
		while(current != null) {
			System.out.print(current.getElem() + " " );
			current = current.next;
		}	
	}
	
	public void reverse(Node n){
		Node prev = null; 
		Node current = n; 
		Node next = null; 
		
		while(current != null){
				next  = current.next;  
		        current.next = prev;   
		        prev = current;
		        current = next;
		}
		first=prev;
	}

}