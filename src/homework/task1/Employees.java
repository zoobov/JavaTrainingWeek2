package homework.task1;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

public class Employees {
	public ArrayList<Employee> eList;
	
	Employees(){
		eList = new ArrayList<Employee>(); 
	}
	public void addEmployee(String n, String s){
		eList.add(new Employee(n, s));
	}
	
	public Employee getAwardWinner(){
		int winnerIdx;
		Random r = new Random();
		if (eList.isEmpty())
			return null;
		else {
		winnerIdx = r.nextInt(eList.size());
		return eList.get(winnerIdx);
		}
	}
	
	public void printAll(){
		ListIterator<Employee> li = eList.listIterator();
		System.out.println("Сотрудники фирмы рога и копыта:");
		while (li.hasNext()){
			System.out.println(li.next());
		}
	}
	
	class Employee{
		private String name;
		private String surname;
		
		public Employee(String n,String s) {
			name = n;
			surname = s;
		}
		
		public String toString() {	
			return name + " " + surname;  
		}
		
		
	}
	
	
}
