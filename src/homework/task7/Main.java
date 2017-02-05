package homework.task7;

public class Main {

	public static void main(String[] args) {
		Node n;
		NodeList nl = new NodeList();
		
		nl.insertFirst(1);
		n = nl.getFirst();
		for(int i=2; i<51; i++)
			nl.insertFirst(i);	
		nl.print();
		System.out.println();
		nl.reverse(nl.getFirst());
		nl.print(); 
	}
}
