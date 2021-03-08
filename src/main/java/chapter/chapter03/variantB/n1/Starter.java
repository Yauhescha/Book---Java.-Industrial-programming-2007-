package main.java.chapter.chapter03.variantB.n1;

public class Starter {
	static Fraction[] arr;

	public void printTaskInfo() {
		System.out.println("1. Определить класс Дробь (Рациональная Дробь) в виде пары чисел m и n. "
				+ "Объявить и инициализировать массив из k дробей, ввести/вывести значения для массива дробей. "
				+ "Создать массив/список/множество объектов и передать его в метод, который изменяет каждый элемент массива с четным индексом "
				+ "путем добавления следующего за ним элемента.");
		System.out.println();
	}

	public void run() {
		printTaskInfo();
		System.out.println("Начало выполнения задания");
		initArray();
		printAll();
		tryMthFraction();
		changeElements(arr);
		printAll();
		System.out.println("Конец выполнения задания");
		System.out.println();
	}

	private void initArray() {
		arr = new Fraction[] { new Fraction(1, 2), new Fraction(3, 4), new Fraction(10, 5), new Fraction(6, 8),
				new Fraction(25, 5), new Fraction(1, 3) };
	}

	private void printAll() {
		System.out.println("Вывод всех дробей");
		for (Fraction st : arr) {
			System.out.println(st);
		}
		System.out.println("Конец вывода");
	}

	private void changeElements(Fraction[] a) {
		System.out.println("Смена значений четных элементов");
		for (int i = 0; i < a.length; i++) {
			if (i % 2 != 0 && i + 1 < a.length) {
				a[i].add(a[i + 1]);
			}
		}
		System.out.println("Конец вывода");
	}

	private void tryMthFraction() {
		System.out.println("Проверка математических выражений");
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.println(arr[i] + " + " + arr[i + 1] + " = " + MathFraction.add(arr[i], arr[i + 1]));
			System.out.println(arr[i] + " - " + arr[i + 1] + " = " + MathFraction.subtract(arr[i], arr[i + 1]));
			System.out.println(arr[i] + " * " + arr[i + 1] + " = " + MathFraction.multiply(arr[i], arr[i + 1]));
			System.out.println(arr[i] + " / " + arr[i + 1] + " = " + MathFraction.divide(arr[i], arr[i + 1]));

			System.out.println();
		}
		System.out.println("Конец вывода");
	}

}
