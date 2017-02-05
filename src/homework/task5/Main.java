package homework.task5;

public class Main {

	public static void main(String[] args) {
	
		SongParser sp = new SongParser("songs.txt");
		sp.loadPlayList();
		sp.sort();
		sp.print();
		
	}
}
