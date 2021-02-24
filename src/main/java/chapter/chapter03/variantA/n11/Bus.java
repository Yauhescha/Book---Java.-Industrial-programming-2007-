package main.java.chapter.chapter03.variantA.n11;

public class Bus {
	private String fio;
	private int autoNumber;
	private int wayNumber;
	private String brand;
	private int year;
	private int mileage;

	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bus(String fio, int autoNumber, int wayNumber, String brand, int year, int mileage) {
		super();
		this.fio = fio;
		this.autoNumber = autoNumber;
		this.wayNumber = wayNumber;
		this.brand = brand;
		this.year = year;
		this.mileage = mileage;
	}

	public Bus(int wayNumber, int year, int mileage) {
		super();
		this.wayNumber = wayNumber;
		this.year = year;
		this.mileage = mileage;
	}

	public String getFio() {
		return fio;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

	public int getAutoNumber() {
		return autoNumber;
	}

	public void setAutoNumber(int autoNumber) {
		this.autoNumber = autoNumber;
	}

	public int getWayNumber() {
		return wayNumber;
	}

	public void setWayNumber(int wayNumber) {
		this.wayNumber = wayNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Bus [wayNumber=" + wayNumber + ", year=" + year + ", mileage=" + mileage + "]";
	}

}
