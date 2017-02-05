package homework.task6;

public class Main {

	public static void main(String[] args) {
	
		SongParser sp = new SongParser("songs2.txt");
		sp.loadPls();
		sp.sort();
		sp.printPls();
		
	}
}
