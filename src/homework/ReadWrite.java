package homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadWrite {
	
	public static void readFile(String fileLoc){
		char[] c = new char[1024];
		int len;
		try(FileReader fis = new FileReader(fileLoc)){
			while((len=fis.read(c))>0){
				for (int i=0; i<len; i++){
					System.out.print(c[i]);
				}
				System.out.println();
			}
		}catch(IOException ioe){
			ioe.getMessage();	
		}
	}
	
	public static void writeFile(String fileLoc,String s){
		try(BufferedWriter out = new BufferedWriter(new FileWriter(fileLoc))){
			out.write(s);
		} catch (IOException ioe) {
			ioe.getMessage();
		}
	}
	
	public static String readUserInput(){
		String s=null;
		System.out.println("Enter some text");
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			s = br.readLine();

		} catch (IOException ioe) {
			ioe.getMessage();
		}
		return s;
	}
	

}
