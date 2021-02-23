package main.java.chapter.chapter03.variantA.n05;

public enum TypeOfCover {
	LITE("Мягкий"), HARD("Твердый"), OTHER("Другой");

	private String name;

	TypeOfCover(String name) {
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
