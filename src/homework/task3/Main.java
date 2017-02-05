package homework.task3;

public class Main {

	public static void main(String[] args) {
		Employee employee;
		Employees e = new Employees();
		int eId = 15;
		e.addEmployee("Иван", "Сидоров", 7);
		e.addEmployee("Александр", "Потапов",8);
		e.addEmployee("Илья", "Шевченко",15);
		e.addEmployee("Михаил", "Гуров",20);
		
		employee = e.getEmployee(eId);
		if (employee!=null)
			System.out.println("ФИО сотрудника: " +  employee.getName() + " Id: " + eId);
	}

}
