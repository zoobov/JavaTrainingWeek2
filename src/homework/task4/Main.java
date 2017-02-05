package homework.task4;

public class Main {

	public static void main(String[] args) {
		
	
		WordTranslator wt = new WordTranslator("dic.txt");
		wt.loadDic();
		
		System.out.println(wt.translate("red"));
	}
}
