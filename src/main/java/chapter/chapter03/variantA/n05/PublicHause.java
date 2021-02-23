package main.java.chapter.chapter03.variantA.n05;

public enum PublicHause {
	MOSCOW("Московский дом"),MINSK("Минская халупа"),JAPAN("Японская манга");

	private String name;

	PublicHause(String name) {
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
