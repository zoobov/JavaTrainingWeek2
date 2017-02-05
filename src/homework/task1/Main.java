package homework.task1;

public class Main {

	public static void main(String[] args) {
		
		Employees e = new Employees();
		e.addEmployee("Иван", "Сидоров");
		e.addEmployee("Александр", "Потапов");
		e.addEmployee("Илья", "Шевченко");
		e.addEmployee("Михаил", "Веллер");
		
		e.printAll();
		System.out.println();
		System.out.println("В этом месяце премию получает -- " + e.getAwardWinner());
	}

}
