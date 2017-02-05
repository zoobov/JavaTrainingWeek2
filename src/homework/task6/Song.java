package homework.task6;

public class Song {
	private String name;
	private String performer;
	private int rating;
	
	Song(String n, String p, int r){
		name = n;
		performer = p;
		rating = r;
	}
	
	public String getName(){
		return name;
	}
	
	public String getPerformer(){
		return performer;
	}
	
	public int  getRating(){
		return rating;
	}
}
