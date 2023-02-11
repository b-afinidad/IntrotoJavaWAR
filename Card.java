package finalProjectWarGame;

public class Card {
	
	//Fields
	String name;
	int value;
	
	Card(int value, String name) {
		this.name = name;
		this.value = value;
	}

	//Methods
	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	//Describe
	public void describe() {
		System.out.println(this.name);
	}
	
}
