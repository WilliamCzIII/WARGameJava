package war;
import java.util.*;
public class Card {
	
	private int value;
	private String name;
	

	
	public Card() {//constructor for the Card object
		this.setValue(value);
		this.setName(name);
	}
	
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void describe() {
		System.out.println( name);
	}
	
	
	

}
