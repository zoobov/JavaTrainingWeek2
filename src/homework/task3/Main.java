package homework.task3;

public class Main {

	public static void main(String[] args) {
		Employee employee;
		Employees e = new Employees();
		int eId = 15;
		e.addEmployee("����", "�������", 7);
		e.addEmployee("���������", "�������",8);
		e.addEmployee("����", "��������",15);
		e.addEmployee("������", "�����",20);
		
		employee = e.getEmployee(eId);
		if (employee!=null)
			System.out.println("��� ����������: " +  employee.getName() + " Id: " + eId);
	}

}
