package main.java.chapter.chapter03.variantA.n12;

import java.sql.Time;
import java.util.Arrays;

public class Airline {
	private String stationOfDestination;
	private int flightNumber;
	private String typeOfAircraft;
	private Time startTime;
	private DaysOfWeek[] daysOfWeek;

	public Airline() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Airline(String stationOfDestination, int flightNumber, String typeOfAircraft, Time startTime,
			DaysOfWeek... daysOfWeek) {
		super();
		this.stationOfDestination = stationOfDestination;
		this.flightNumber = flightNumber;
		this.typeOfAircraft = typeOfAircraft;
		this.startTime = startTime;
		this.daysOfWeek = daysOfWeek;
	}

	public Airline(String stationOfDestination, Time startTime, DaysOfWeek... daysOfWeek) {
		super();
		this.stationOfDestination = stationOfDestination;
		this.startTime = startTime;
		this.daysOfWeek = daysOfWeek;
	}

	public String getStationOfDestination() {
		return stationOfDestination;
	}

	public void setStationOfDestination(String stationOfDestination) {
		this.stationOfDestination = stationOfDestination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getTypeOfAircraft() {
		return typeOfAircraft;
	}

	public void setTypeOfAircraft(String typeOfAircraft) {
		this.typeOfAircraft = typeOfAircraft;
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public DaysOfWeek[] getDaysOfWeek() {
		return daysOfWeek;
	}

	public void setDaysOfWeek(DaysOfWeek[] daysOfWeek) {
		this.daysOfWeek = daysOfWeek;
	}

	@Override
	public String toString() {
		return "Airline [stationOfDestination=" + stationOfDestination + ", startTime=" + startTime + ", daysOfWeek="
				+ Arrays.toString(daysOfWeek) + "]";
	}

}
