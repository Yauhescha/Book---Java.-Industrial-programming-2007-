package main.java.chapter.chapter03.variantA.n08;

import java.awt.Color;

public class Car {
	private long id;
	private String mark;
	private String model;
	private int year;
	private Color color;
	private float price;
	private String registrationNumber;
	private int credit;
	private int timeCityConversation;
	private int timeUncityConversation;

	public Car() {
		super();
	}

	public Car(long id, String mark, String model, int year, Color color, float price, String registrationNumber,
			int credit, int timeCityConversation, int timeUncityConversation) {
		super();
		this.id = id;
		this.mark = mark;
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;
		this.registrationNumber = registrationNumber;
		this.credit = credit;
		this.timeCityConversation = timeCityConversation;
		this.timeUncityConversation = timeUncityConversation;
	}

	public Car(String mark, String model, int year, float price) {
		super();
		this.mark = mark;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [mark=" + mark + ", model=" + model + ", year=" + year + ", color=" + color + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public int getTimeCityConversation() {
		return timeCityConversation;
	}

	public void setTimeCityConversation(int timeCityConversation) {
		this.timeCityConversation = timeCityConversation;
	}

	public int getTimeUncityConversation() {
		return timeUncityConversation;
	}

	public void setTimeUncityConversation(int timeUncityConversation) {
		this.timeUncityConversation = timeUncityConversation;
	}

}
