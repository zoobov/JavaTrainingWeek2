package homework.task2;

public class Main {

	public static void main(String[] args) {
		Students s = new Students();
		s.addStudent("���� �������", 1);
		s.addStudent("����� �����", 1);
		s.addStudent("������� �����", 2);
		s.addStudent("���������� ��������", 1);
		s.addStudent("������ ���������", 1);
		s.addStudent("�� �������", 2);
		s.addStudent("������� ��������", 1);
		s.addStudent("��������� �����", 1);
		s.addStudent("����� �����", 2);
		s.addStudent("����� �����", 2);
		
		s.printAllInCourse(1);
		System.out.println();
		s.printAllInCourse(2);

	}

}
