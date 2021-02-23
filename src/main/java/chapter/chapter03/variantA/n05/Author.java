package main.java.chapter.chapter03.variantA.n05;

public enum Author {
	PUSHKIN("Александр Сергеевич Пушкин"),
	DOSTOEVSKI("Фёдр Михайилович Достоевский"),
	ESENIN("Just Есенин");

	private String name;
	

	Author(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
