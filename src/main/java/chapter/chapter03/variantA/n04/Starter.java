package main.java.chapter.chapter03.variantA.n04;

import java.util.Arrays;

public class Starter {
	static Abiturient[] arr;

	public static void main(String[] args) {
		System.out.println("Начало выполнения задания");
		initArray();
		printEntitiesWithBadScore();
		printEntitiesWithSummScoreMoreThan(23);
		printTopEntitiesWithHightScore(3);
		printEntitiesWithScoreMoreThanMiddle();
		System.out.println("Конец выполнения задания");
		System.out.println();
	}

	private static void initArray() {
		arr = new Abiturient[] { 
				new Abiturient("Firstname1", new int[]{1,2,3,4,5}) ,
				new Abiturient("Firstname2", new int[]{5,5,5,5,5}) ,
				new Abiturient("Firstname3", new int[]{5,5,4,5,5}) ,
				new Abiturient("Firstname4", new int[]{4,5,5,4,5}) ,
				new Abiturient("Firstname5", new int[]{2,5,5,5,5}) 
				};
	}

	private static void printEntitiesWithBadScore() {
		System.out.println("Cписок абитуриентов, имеющих неудовлетворительные оценки");		
		for (Abiturient entity : arr) {
			if (isHasBagScore(entity))
				System.out.println(entity);
		}
		System.out.println("Конец вывода");
	}
	private static boolean isHasBagScore(Abiturient entity) {
		for(int score:entity.getScores())
			if(score<=2)
				return true;
		return false;
	}

	private static void printEntitiesWithSummScoreMoreThan(int scoreSumm) {
		System.out.println("Cписок абитуриентов, у которых сумма баллов выше заданной");
		System.out.println("Сумма: " + scoreSumm);
		for (Abiturient entity : arr) {
			if (entity.scoresSumm()>=scoreSumm)
				System.out.println(entity);
		}
		System.out.println("Конец вывода");
	}

	private static void printTopEntitiesWithHightScore(int countOfTop) {
		System.out.println("Выбрать заданное число n абитуриентов, имеющих самую высокую сумму баллов");
		Arrays.sort(arr);
		for (int i=0; i<countOfTop;i++) {			
				System.out.println(arr[i]);
		}
		System.out.println("Конец вывода");
	}
	private static void printEntitiesWithScoreMoreThanMiddle() {
		System.out.println("Полный список абитуриентов, имеющих полупроходную сумму");
		Arrays.sort(arr);
		for (Abiturient entity:arr) {
			if(entity.scoresSumm()>=arr[0].scoresSumm()/2)
				System.out.println(entity);
		}
		System.out.println("Конец вывода");
	}
	
	public static void printTaskInfo() {
		System.out.println("4. Abiturient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Оценки.");
		System.out.println("Создать массив объектов. Вывести:");
		System.out.println("a) список абитуриентов, имеющих неудовлетворительные оценки;");
		System.out.println("b) список абитуриентов, у которых сумма баллов выше заданной;");
		System.out.println("c) выбрать заданное число n абитуриентов, имеющих самую высокую сумму баллов "
				+ "(вывести также полный список абитуриентов, имеющих полупроходную сумму).");
		System.out.println();
	}
}
