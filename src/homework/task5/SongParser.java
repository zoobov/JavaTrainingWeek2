package homework.task5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class SongParser {
	String fileLoc;
	ArrayList<String> playList = new ArrayList<String>();
	
	SongParser(String fileLoc){
		this.fileLoc = fileLoc;
	}

	public void loadPlayList(){
		String tLine = null;
		try(BufferedReader br = new BufferedReader(new FileReader(fileLoc))){
			while((tLine=br.readLine())!=null){
				playList.add(tLine);
				//System.out.println(tLine);
			}
		}catch(IOException ioe){
			ioe.getMessage();	
		}
	}
	
	public void sort(){
		Collections.sort(playList);
	}
	
	public void print(){
		ListIterator<String> li = playList.listIterator(); 
		while (li.hasNext())
			System.out.println(li.next());
	}
	
	
	
}
