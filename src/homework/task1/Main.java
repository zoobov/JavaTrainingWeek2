package homework.task1;

public class Main {

	public static void main(String[] args) {
		
		Employees e = new Employees();
		e.addEmployee("����", "�������");
		e.addEmployee("���������", "�������");
		e.addEmployee("����", "��������");
		e.addEmployee("������", "������");
		
		e.printAll();
		System.out.println();
		System.out.println("� ���� ������ ������ �������� -- " + e.getAwardWinner());
	}

}
