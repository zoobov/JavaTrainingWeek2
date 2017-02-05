package homework.task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordTranslator {
	String fileLoc;
	Map<String, String> dic = new HashMap<String, String>();
	
	WordTranslator(String fileLoc){
		this.fileLoc = fileLoc;
	}

	public void loadDic(){
		String tLine = null;
		String sLine[] = null;
		try(BufferedReader br = new BufferedReader(new FileReader(fileLoc))){
			while((tLine=br.readLine())!=null){
				sLine=tLine.split(" ");
				dic.put(sLine[0], sLine[1]);
				//System.out.println(sLine[0] + " - " + sLine[1]);
			}
		}catch(IOException ioe){
			ioe.getMessage();	
		}
	}
	
	public String translate(String word) {
		return dic.get(word);
		
	}
}
