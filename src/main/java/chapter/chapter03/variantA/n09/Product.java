package main.java.chapter.chapter03.variantA.n09;

import java.awt.Color;

public class Product {
	private long id;
	private String name;
	private String UPC;
	private int speed;
	private float price;
	private int countSaveMonth;
	private int count;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(long id, String name, String uPC, int speed, float price, int countSaveMonth, int count) {
		super();
		this.id = id;
		this.name = name;
		UPC = uPC;
		this.speed = speed;
		this.price = price;
		this.countSaveMonth = countSaveMonth;
		this.count = count;
	}
	public Product(String name, float price, int countSaveMonth) {
		super();
		this.name = name;
		this.price = price;
		this.countSaveMonth = countSaveMonth;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUPC() {
		return UPC;
	}
	public void setUPC(String uPC) {
		UPC = uPC;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getCountSaveMonth() {
		return countSaveMonth;
	}
	public void setCountSaveMonth(int countSaveMonth) {
		this.countSaveMonth = countSaveMonth;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", countSaveMonth=" + countSaveMonth + "]";
	}
	
	

}
