package homework.task6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;

public class SongParser {
	String fileLoc;
	ArrayList<Song> playList = new ArrayList<Song>();
	
	SongParser(String fileLoc){
		this.fileLoc = fileLoc;
	}

	public void loadPls(){
		Song song = null;
		String tLine = null;
		String sLine[] = null;
		try(BufferedReader br = new BufferedReader(new FileReader(fileLoc))){
			while((tLine=br.readLine())!=null){
				sLine=tLine.split("/");
				song = new Song(sLine[0], sLine[1], Integer.parseInt(sLine[2]));
				playList.add(song);

			}
		}catch(IOException ioe){
			ioe.getMessage();	
		}
	}
	
	public void sort(){
		Collections.sort(playList, new NameComparator());
		Collections.sort(playList, new PperformerComparator());
	}
	
	public void printPls(){
		ListIterator<Song> li = playList.listIterator();
		Song song;
		while (li.hasNext()){
			song = li.next();
			System.out.println(song.getPerformer() + " " + song.getName());
		}
	}
}
