package homework.task6;

import java.util.Comparator;

public class NameComparator implements Comparator {
	
	public int compare(Object ob1,Object ob2){  
		Song song1=(Song)ob1;  
		Song song2=(Song)ob2;
		
		String sName1 = song1.getName();
		String sName2 = song2.getName();
		return sName1.compareToIgnoreCase(sName2);  
	
	}
}
