package main.java.chapter.chapter03.variantA.n06;

public class Starter {
	static Hause[] arr;

	public static void main(String[] args) {
		System.out.println("Начало выполнения задания");
		initArray();
		printEntitiesByRoomCount(3);
		printEntitiesByRoomCountAndFloorBetween(2,2,4);
		printEntitiesWuthSquareMoreThan(20f);
		System.out.println("Конец выполнения задания");
		System.out.println();
	}

	private static void initArray() {
		arr = new Hause[] { 
				new Hause(1,1,25.5f,5),
				new Hause(2,3,40f,11),
				new Hause(3,3,30.2f,13),
				new Hause(4,2,18.8f,4),
				new Hause(5,1,55f,3),
				};
	}

	private static void printEntitiesByRoomCount(int countOfRoom) {
		System.out.println("Cписок квартир, имеющих заданное число комнат");
		System.out.println("Число комнат: "+countOfRoom);
		for (Hause entity : arr) {
			if (entity.getRoomCount()==countOfRoom)
				System.out.println(entity);
		}
		System.out.println("Конец вывода");
	}

	private static void printEntitiesByRoomCountAndFloorBetween(int countOfRoom, int floorStart, int floorEnd) {
		System.out.println("Cписок квартир, имеющих заданное число комнат и расположенных на этаже, который находится в заданном промежутке");
		System.out.println("Число комнат: "+countOfRoom+", С "+ floorStart +" этожа и по "+floorEnd);
		for (Hause entity : arr) {
			if (entity.getRoomCount()==countOfRoom && (entity.getFloor()>=floorEnd && entity.getFloor()<=floorStart))
				System.out.println(entity);
		}
		System.out.println("Конец вывода");
	}

	private static void printEntitiesWuthSquareMoreThan(float square) {
		System.out.println("Cписок квартир, имеющих площадь, превосходящую заданную");
		System.out.println("Заданная площадь: "+square);
		for (Hause entity : arr) {
			if (entity.getSquare()>=square)
				System.out.println(entity);
		}
		System.out.println("Конец вывода");
	}	

	public static void printTaskInfo() {
		System.out.println("6. House: id, Номер квартиры, Площадь, Этаж, Количество комнат, Улица, Тип здания, Срок эксплуатации.");
		System.out.println("Создать массив объектов. Вывести:");
		System.out.println("a) список квартир, имеющих заданное число комнат;");
		System.out.println("b) список квартир, имеющих заданное число комнат и расположенных на этаже, который находится в заданном промежутке;");
		System.out.println("c) список квартир, имеющих площадь, превосходящую заданную.");
		System.out.println();
	}
}
