package homework.task3;

import java.util.HashMap;

public class Employees {
	public HashMap<Integer,Employee> eMap;
	
	Employees(){
		eMap = new HashMap<Integer,Employee>(); 
	}
	public boolean addEmployee (String n, String s, int i){
		Integer id = i;
		Employee employee = new Employee(n, s); 
		if (eMap.containsKey(id))
			return false;
		else {
			eMap.put(id, employee);
			return false;
		}	
	}
	
	public Employee getEmployee(int id){
		return eMap.get(id);
	}
	
	
	
}
