package main.java.chapter.chapter03.variantA.n10;

import java.sql.Time;
import java.util.Arrays;

public class Train {
	private String stationOfDestination;
	private int number;
	private Time startTime;
	private int[] seatsCount = new int[4];// {commons, coupe, platscart, lux}

	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Train(String stationOfDestination, int number, Time startTime, int commons, int coupe, int platscart, int lux) {
		super();
		this.stationOfDestination = stationOfDestination;
		this.number = number;
		this.startTime = startTime;
		this.seatsCount[0]=commons;
		this.seatsCount[1]=coupe;
		this.seatsCount[2]=platscart;
		this.seatsCount[3]=lux;
	}

	public Train(String stationOfDestination, Time startTime, int commons, int coupe, int platscart, int lux) {
		super();
		this.stationOfDestination = stationOfDestination;
		this.startTime = startTime;
		this.seatsCount[0]=commons;
		this.seatsCount[1]=coupe;
		this.seatsCount[2]=platscart;
		this.seatsCount[3]=lux;
	}

	public String getStationOfDestination() {
		return stationOfDestination;
	}

	public void setStationOfDestination(String stationOfDestination) {
		this.stationOfDestination = stationOfDestination;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public int[] getSeatsCount() {
		return seatsCount;
	}

	public void setSeatsCount(int[] seatsCount) {
		this.seatsCount = seatsCount;
	}

	@Override
	public String toString() {
		return "Train [stationOfDestination=" + stationOfDestination + ", startTime=" + startTime + ", seatsCount="
				+ Arrays.toString(seatsCount) + "]";
	}

}
