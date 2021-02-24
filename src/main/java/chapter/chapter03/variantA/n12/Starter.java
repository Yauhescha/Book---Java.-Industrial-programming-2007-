package main.java.chapter.chapter03.variantA.n12;

import java.sql.Time;

public class Starter {
	static Airline[] arr;

	public static void main(String[] args) {
		System.out.println("Начало выполнения задания");
		initArray();
		printEntitiesByStationOfDestination("Лондон");
		printEntitiesByDayOfWeek(DaysOfWeek.Friday);
		printEntitiesByDayOfWeekAndStartTimeMoreThan(DaysOfWeek.Saturday,Time.valueOf("10:10:00"));
		System.out.println("Конец выполнения задания");
		System.out.println();
	}

	private static void initArray() {
		arr = new Airline[] {
				new Airline("Лондон", Time.valueOf("10:10:00"),DaysOfWeek.Friday),
				new Airline("Москва", Time.valueOf("22:33:00"),DaysOfWeek.Monday, DaysOfWeek.Sunday),
				new Airline("Питер", Time.valueOf("33:22:00"),DaysOfWeek.Monday, DaysOfWeek.Sunday),
				new Airline("Лондон", Time.valueOf("11:00:00"),DaysOfWeek.Saturday),
				new Airline("Ливан", Time.valueOf("09:50:00"),DaysOfWeek.Saturday, DaysOfWeek.Friday),
							};
	}
	
	
	private static void printEntitiesByStationOfDestination(String station) {
		System.out.println("Список рейсов для заданного пункта назначения");
		System.out.println("Заданный пункт: " + station);
		for (Airline entity : arr) {
			if (entity.getStationOfDestination().equals(station))
				System.out.println(entity);
		}
		System.out.println("Конец вывода");
	}

	private static void printEntitiesByDayOfWeek(DaysOfWeek day) {
		System.out.println("Список рейсов для заданного дня недели");
		System.out.println("Заданный день: " + day);
		for (Airline entity : arr) {
			for(DaysOfWeek d:entity.getDaysOfWeek())
				if (d==day)
					System.out.println(entity);
		}
		System.out.println("Конец вывода");
	}

	private static void printEntitiesByDayOfWeekAndStartTimeMoreThan(DaysOfWeek day, Time time) {
		System.out.println("Список рейсов для заданного дня недели, время вылета для которых больше заданного");
		System.out.println("Заданный день: " + day+", заданное время: " + time);
		for (Airline entity : arr) {
			for(DaysOfWeek d:entity.getDaysOfWeek())
				if (d==day && entity.getStartTime().compareTo(time)>0)
					System.out.println(entity);
		}
		System.out.println("Конец вывода");
	}

	public static void printTaskInfo() {
		System.out.println("12. Airline: Пункт назначения, Номер рейса, Тип самолета, Время вылета, Дни недели.");
		System.out.println("Создать массив объектов. Вывести:");
		System.out.println("a) список рейсов для заданного пункта назначения;");
		System.out.println("b) список рейсов для заданного дня недели;");
		System.out.println("c) список рейсов для заданного дня недели, время вылета для которыхбольше заданного.");
		System.out.println();
	}
}
