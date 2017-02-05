package homework.task2;

public class Main {

	public static void main(String[] args) {
		Students s = new Students();
		s.addStudent("Иван Сидоров", 1);
		s.addStudent("Павел Ильин", 1);
		s.addStudent("Николай Носов", 2);
		s.addStudent("Константин Григорян", 1);
		s.addStudent("Сергей Белинский", 1);
		s.addStudent("Ян Боромян", 2);
		s.addStudent("Аркадий Шевченко", 1);
		s.addStudent("Александр Белов", 1);
		s.addStudent("Антон Белый", 2);
		s.addStudent("Игорь Минин", 2);
		
		s.printAllInCourse(1);
		System.out.println();
		s.printAllInCourse(2);

	}

}
