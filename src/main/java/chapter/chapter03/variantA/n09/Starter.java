package main.java.chapter.chapter03.variantA.n09;

public class Starter {
	static Product[] arr;

	public static void main(String[] args) {
		System.out.println("Начало выполнения задания");
		initArray();
		printEntitiesByName("Молоко");
		printEntitiesByNameAndPriceLessThan("Молоко",15000);
		printEntitiesBySaveMonthMoreThan(12);
		System.out.println("Конец выполнения задания");
		System.out.println();
	}

	private static void initArray() {
		arr = new Product[] {
				new Product("Молоко", 13000,1),
				new Product("Квас", 20000,6),
				new Product("Пиво", 1000,8),
				new Product("Машина", 990000,36),
				new Product("Молоко", 16000,14),
							};
	}

	private static void printEntitiesByName(String name) {
		System.out.println("Список товаров для заданного наименования");
		System.out.println("Заданное наименование: " + name);
		for (Product entity : arr) {
			if (entity.getName().equals(name))
				System.out.println(entity);
		}
		System.out.println("Конец вывода");
	}

	private static void printEntitiesByNameAndPriceLessThan(String name, float price) {
		System.out.println("Список товаров для заданного наименования, цена которых не превосходит заданную");
		System.out.println("Заданное наименование: " + name + ". Заданная цена: " + price);
		for (Product entity : arr) {
			if (entity.getName().equals(name) && entity.getPrice() <= price)
				System.out.println(entity);
		}
		System.out.println("Конец вывода");
	}

	private static void printEntitiesBySaveMonthMoreThan(int saveMonthCount) {
		System.out.println("Список товаров, срок хранения которых больше заданного");
		System.out.println("Заданное количество месяцеу: " + saveMonthCount);
		for (Product entity : arr) {
			if (entity.getCountSaveMonth() >= saveMonthCount)
				System.out.println(entity);
		}
		System.out.println("Конец вывода");
	}

	public static void printTaskInfo() {
		System.out.println("9. Product: id, Наименование, UPC, Производитель, Цена, Срок хранения, Количество.");
		System.out.println("Создать массив объектов. Вывести:");
		System.out.println("a) список товаров для заданного наименования;");
		System.out.println("b) список товаров для заданного наименования, цена которых не превосходит заданную;");
		System.out.println("c) список товаров, срок хранения которых больше заданного.");
		System.out.println();
	}
}
