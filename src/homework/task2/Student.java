package homework.task2;

public class Student {
	private String name;
	private int course;
	
	public Student(String n,int c) {
		name = n;
		course = c;
	}
	
	public String getName(){
		return name;	
	}
	
	public int getCourse(){
		return course;
	}
	
	public String toString() {	
		return "ÔÈÎ: " + name + "ãğóïïà: " + course;  
	}
	
}
