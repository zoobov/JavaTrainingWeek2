package homework;

import java.io.Serializable;

public class Color implements Serializable {
	private int  i = 145;
	private transient int  j = 500;
	private String colorName = "White";
	public String toString(){
		return "class Color fields: i=" + i + ", j=" + j + ", colorName=" + colorName;
	}
}

