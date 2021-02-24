package main.java.chapter.chapter03.variantA.n10;

import java.sql.Time;

public class Starter {
	static Train[] arr;

	public static void main(String[] args) {
		System.out.println("Начало выполнения задания");
		initArray();
		printEntitiesByDestinationStation("Дом");
		printEntitiesByDestinationStationAndStartTimeAfter("Дом", Time.valueOf("15:15:00"));
		printEntitiesByDestinationStationAndHasCommonsSeats("Дом");
		System.out.println("Конец выполнения задания");
		System.out.println();
	}

	private static void initArray() {
		arr = new Train[] {
				new Train("Дом",Time.valueOf("15:15:00"),120,40,60,10),
				new Train("Дагестан",Time.valueOf("18:40:00"),120,40,60,10),
				new Train("Дом",Time.valueOf("14:45:00"),0,40,60,10),
				new Train("Дом",Time.valueOf("22:01:00"),3,40,60,10),
				new Train("Въетнам",Time.valueOf("15:15:00"),0,40,60,10),
							};
	}
	
	
	private static void printEntitiesByDestinationStation(String station) {
		System.out.println("Список поездов, следующих до заданного пункта назначения");
		System.out.println("Заданный пункт: " + station);
		for (Train entity : arr) {
			if (entity.getStationOfDestination().equals(station))
				System.out.println(entity);
		}
		System.out.println("Конец вывода");
	}

	private static void printEntitiesByDestinationStationAndStartTimeAfter(String station, Time startTime) {
		System.out.println("Список список поездов, следующих до заданного пункта назначения и отправляющихся после заданного часа");
		System.out.println("Заданный пункт: " + station + ". Заданное время отправления: " + startTime);
		for (Train entity : arr) {
			if (entity.getStationOfDestination().equals(station) && entity.getStartTime().compareTo(startTime) >0)
				System.out.println(entity);
		}
		System.out.println("Конец вывода");
	}

	private static void printEntitiesByDestinationStationAndHasCommonsSeats(String station) {
		System.out.println("Список список поездов, отправляющихся до заданного пункта назначения и имеющих общие места");
		System.out.println("Заданный пункт: " + station);
		for (Train entity : arr) {
			if (entity.getStationOfDestination().equals(station) && entity.getSeatsCount()[0]>0)
				System.out.println(entity);
		}
		System.out.println("Конец вывода");
	}

	public static void printTaskInfo() {
		System.out.println("10. Train: Пункт назначения, Номер поезда, Время отправления, Число мест (общих, купе, плацкарт, люкс).");
		System.out.println("Создать массив объектов. Вывести:");
		System.out.println("a) список поездов, следующих до заданного пункта назначения;");
		System.out.println("b) список поездов, следующих до заданного пункта назначения и отправляющихся после заданного часа;");
		System.out.println("c) список поездов, отправляющихся до заданного пункта назначения и имеющих общие места.");
		System.out.println();
	}
}
