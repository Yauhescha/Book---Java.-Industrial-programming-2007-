package main.java.chapter.chapter03.variantA.n01;

public enum Facultet {
	FITR("ФИТР"), 
	AI("Искуственный интелект"),
	DESIGN("Дизайн");
	
	private String name;
	
	Facultet(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
