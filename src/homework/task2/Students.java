package homework.task2;

import java.util.ArrayList;
import java.util.ListIterator;

public class Students {
	
public ArrayList<Student> sList;
	
	Students(){
		sList = new ArrayList<Student>(); 
	}
	public void addStudent(String n, int c){
		sList.add(new Student(n, c));
	}
	
	public void printAllInCourse(int c){
		Student curStudent;
		ListIterator<Student> li = sList.listIterator();
		System.out.println("На курсе №" + c + " учатся:");
		while (li.hasNext()){
			curStudent = li.next();
			if (curStudent.getCourse() == c){
			System.out.println(curStudent.getName());
			}
		}
	}
	
	
}
