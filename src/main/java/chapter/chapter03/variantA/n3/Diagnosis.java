package main.java.chapter.chapter03.variantA.n3;

public enum Diagnosis {
	ORZ("ОРЗ"), KORONA("Короновирус"), DEATH("Умер");

	private String name;

	Diagnosis(String name) {
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
