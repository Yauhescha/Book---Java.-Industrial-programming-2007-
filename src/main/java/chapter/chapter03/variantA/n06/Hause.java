package main.java.chapter.chapter03.variantA.n06;

public class Hause {
	private long id;
	private int number;
	private float square;
	private int floor;
	private int roomCount;
	private String streetName;
	private String buildingName;
	private int periodOfUse;

	public Hause() {
		super();
	}

	public Hause(long id, int number, float square, int floor, int roomCount, String streetName, String buildingName,
			int periodOfUse) {
		super();
		this.id = id;
		this.number = number;
		this.square = square;
		this.floor = floor;
		this.roomCount = roomCount;
		this.streetName = streetName;
		this.buildingName = buildingName;
		this.periodOfUse = periodOfUse;
	}

	public Hause(int number, int roomCount, float square, int floor) {
		super();
		this.number = number;
		this.roomCount = roomCount;
		this.square = square;
		this.floor = floor;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public float getSquare() {
		return square;
	}

	public void setSquare(float square) {
		this.square = square;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getRoomCount() {
		return roomCount;
	}

	public void setRoomCount(int roomCount) {
		this.roomCount = roomCount;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public int getPeriodOfUse() {
		return periodOfUse;
	}

	public void setPeriodOfUse(int periodOfUse) {
		this.periodOfUse = periodOfUse;
	}

	@Override
	public String toString() {
		return "Hause [number=" + number + ", square=" + square + ", floor=" + floor + ", roomCount=" + roomCount + "]";
	}

}
