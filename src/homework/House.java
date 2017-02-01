package homework;

import java.io.Serializable;

public class House implements Serializable {
	private int count = 2;
	private Color color = new Color();
	
	public String toString(){
		return "class House fields: count=" + count + ", color=" + color;
	}
}

