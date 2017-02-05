package homework.task3;

public class Employee {
	private String name;
	private String surname;
	
	public Employee(String n,String s) {
		name = n;
		surname = s;
	}
	
	public String getName(){
		return name + " " + surname;  
	}
	
	public String toString() {	
		return name + " " + surname;  
	}
	
}
