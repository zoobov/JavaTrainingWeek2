package homework.task3;

public class DublicateIDException extends Exception{
	private static final long serialVersionUID = 1567L;

	@Override
	public String getMessage() {
		return "Этот ID уже занят";
	}
}
