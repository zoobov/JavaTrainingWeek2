package homework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Start {
	public static void main(String[] args){
		
		/*typed text save into file,and read from file to console  */
		ReadWrite.writeFile("c:/tmp.txt",ReadWrite.readUserInput());
		ReadWrite.readFile("c:/tmp.txt");
		
		/* serializing-restoring object house */
		House house = new House();
		System.out.println("house: " + house.toString());
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c:/house.ser"))){
			oos.writeObject(house);
		}catch(IOException ioe){
			ioe.getMessage();
		}
		
		House houseSer = null;
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c:/house.ser"))){
			houseSer = (House) ois.readObject();
		}catch(IOException | ClassNotFoundException e){
			e.getMessage();
		}
		System.out.println("houseSer: " + houseSer.toString());
	}
	
}
