package main.java.chapter.chapter03.variantA.n08;

public class Starter {
	static Car[] arr;

	public static void main(String[] args) {
		System.out.println("Начало выполнения задания");
		initArray();
		printEntitiesByMarka("Taiota");
		printEntitiesByModelAndUseageMoreThan("BBC", 40);
		printEntitiesByYearAndPriceMoreThan(2000, 10000);
		System.out.println("Конец выполнения задания");
		System.out.println();
	}

	private static void initArray() {
		arr = new Car[] { new Car("Volvo", "BBC", 1972, 13600), new Car("Taiota", "S5da", 2000, 13500),
				new Car("Jigul", "65sda1", 2015, 78000), new Car("Tesla", "BBC", 1990, 125000),
				new Car("BMV", "sa*c59", 2001, 654000), };
	}

	private static void printEntitiesByMarka(String marka) {
		System.out.println("Список автомобилей заданной марки");
		System.out.println("Заданная марка: " + marka);
		for (Car entity : arr) {
			if (entity.getMark().equals(marka))
				System.out.println(entity);
		}
		System.out.println("Конец вывода");
	}

	private static void printEntitiesByModelAndUseageMoreThan(String model, int ageToUsed) {
		System.out.println("Список автомобилей заданной модели, которые эксплуатируются больше n лет");
		System.out.println("Заданная модель: " + model + ". Срок эксплуатации больше: " + ageToUsed);
		for (Car entity : arr) {
			if (entity.getModel().equals(model) && entity.getYear() + ageToUsed <= 2021)
				System.out.println(entity);
		}
		System.out.println("Конец вывода");
	}

	private static void printEntitiesByYearAndPriceMoreThan(int year, float startPrice) {
		System.out.println("Список автомобилей заданного года выпуска, цена которых больше указанной");
		System.out.println("Заданный год: " + year + ", указанная цена: " + startPrice);
		for (Car entity : arr) {
			if (entity.getYear() == year && entity.getPrice() >= startPrice)
				System.out.println(entity);
		}
		System.out.println("Конец вывода");
	}

	public static void printTaskInfo() {
		System.out.println("8. Car: id, Марка, Модель, Год выпуска, Цвет, Цена, Регистрационный номер.");
		System.out.println("Создать массив объектов. Вывести:");
		System.out.println("a) список автомобилей заданной марки;");
		System.out.println("b) список автомобилей заданной модели, которые эксплуатируются больше n лет;");
		System.out.println("c) список автомобилей заданного года выпуска, цена которых больше указанной.");
		System.out.println();
	}
}
