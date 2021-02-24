package main.java.chapter.chapter03.variantA.n11;

public class Starter {
	static Bus[] arr;

	public static void main(String[] args) {
		System.out.println("Начало выполнения задания");
		initArray();
		printEntitiesByWayNumber(18);
		printEntitiesByExploitationMoreThan(20);
		printEntitiesByMileageMoreThan(300);
		System.out.println("Конец выполнения задания");
		System.out.println();
	}

	private static void initArray() {
		arr = new Bus[] {
				new Bus(1,1980,5000),
				new Bus(18,2020,2),
				new Bus(40,2010,150),
				new Bus(35,2015,8000),
				new Bus(18,1730,666),
							};
	}
	
	
	private static void printEntitiesByWayNumber(int WayNumber) {
		System.out.println("Список автобусов для заданного номера маршрута");
		System.out.println("Заданный номер: " + WayNumber);
		for (Bus entity : arr) {
			if (entity.getWayNumber()==WayNumber)
				System.out.println(entity);
		}
		System.out.println("Конец вывода");
	}

	private static void printEntitiesByExploitationMoreThan(int countExploitationYear) {
		System.out.println("Список автобусов, которые эксплуатируются больше заданного срока");
		System.out.println("Заданный срок: " + countExploitationYear);
		for (Bus entity : arr) {
			if (2021-entity.getYear() >=countExploitationYear)
				System.out.println(entity);
		}
		System.out.println("Конец вывода");
	}

	private static void printEntitiesByMileageMoreThan(int mileage) {
		System.out.println("Список автобусов, пробег у которых больше заданного расстояния");
		System.out.println("Заданный пробег: " + mileage);
		for (Bus entity : arr) {
			if (entity.getMileage()>=mileage)
				System.out.println(entity);
		}
		System.out.println("Конец вывода");
	}

	public static void printTaskInfo() {
		System.out.println("11. Bus: Фамилия и инициалы водителя, Номер автобуса, Номер маршрута, Марка, Год начала эксплуатации, Пробег.");
		System.out.println("Создать массив объектов. Вывести:");
		System.out.println("a) список автобусов для заданного номера маршрута;");
		System.out.println("b) список автобусов, которые эксплуатируются больше заданного срока; ");
		System.out.println("c) список автобусов, пробег у которых больше заданного расстояния.");
		System.out.println();
	}
}
