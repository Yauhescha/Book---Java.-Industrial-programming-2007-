package main.java.chapter.chapter03.variantA.n07;

import java.util.Arrays;

public class Starter {
	static Phone[] arr;

	public static void main(String[] args) {
		System.out.println("Начало выполнения задания");
		initArray();
		printEntitiesWithCitytimeMoreThen(80);
		printEntitiesWidthuncitytime();
		printEntitiesSortByFirstname();
		System.out.println("Конец выполнения задания");
		System.out.println();
	}

	private static void initArray() {
		arr = new Phone[] { 
				new Phone("Firstname 1", 10,0),
				new Phone("Alex 2", 0,54),
				new Phone("Zahar 3", 156,688),
				new Phone("Londont 4", 68,0),
				new Phone("Greg 5", 0,168),
				};
	}

	private static void printEntitiesWithCitytimeMoreThen(int citytime) {
		System.out.println("Сведения об абонентах, у которых время внутригородских разговоров превышает заданное");
		System.out.println("Заданное время: "+citytime);
		for (Phone entity : arr) {
			if (entity.getTimeSityConversation()>=citytime)
				System.out.println(entity);
		}
		System.out.println("Конец вывода");
	}

	private static void printEntitiesWidthuncitytime() {
		System.out.println("Сведения об абонентах, которые пользовались междугородной связью");
		for (Phone entity : arr) {
			if (entity.getTimeUnsityConversation()>0)
				System.out.println(entity);
		}
		System.out.println("Конец вывода");
	}

	private static void printEntitiesSortByFirstname() {
		System.out.println("сведения об абонентах в алфавитном порядке");
		Arrays.sort(arr);
		for (Phone entity : arr) {
			System.out.println(entity);
		}
		System.out.println("Конец вывода");
	}	

	public static void printTaskInfo() {
		System.out.println("7. Phone: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Дебет, Кредит, Время городских и междугородных разговоров.");
		System.out.println("Создать массив объектов. Вывести:");
		System.out.println("a) сведения об абонентах, у которых время внутригородских разговоров превышает заданное");
		System.out.println("b) сведения об абонентах, которые пользовались междугородной связью;");
		System.out.println("c) сведения об абонентах в алфавитном порядке.");
		System.out.println();
	}
}
