package homework.task6;

import java.util.Comparator;

public class PperformerComparator implements Comparator {
	public int compare(Object ob1,Object ob2){  
		Song song1=(Song)ob1;  
		Song song2=(Song)ob2;
		
		String sPerformer1 = song1.getPerformer();
		String sPerformer2 = song2.getPerformer();
		
		return sPerformer1.compareToIgnoreCase(sPerformer2);  

	}
}
