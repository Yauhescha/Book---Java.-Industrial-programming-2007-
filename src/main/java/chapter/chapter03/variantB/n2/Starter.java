package main.java.chapter.chapter03.variantB.n2;

public class Starter {
	static Complex[] arr;

	public void printTaskInfo() {
		System.out.println("2. Определить класс Комплекс. "
				+ "Создать массив/список/множество размерности n из комплексных координат. "
				+ "Передать его в метод, который выполнит сложение/умножение его элементов.");
		System.out.println();
	}

	public void run() {
		printTaskInfo();
		System.out.println("Начало выполнения задания");
		initArray();
		printAll();
		tryMthFraction();
		printAll();
		System.out.println("Конец выполнения задания");
		System.out.println();
	}

	private void initArray() {
		arr = new Complex[] { 
				new Complex(3,4),
				new Complex(1,2),
				new Complex(2,3),
				new Complex(5,6),
				new Complex(10,20)
				};
	}

	private void printAll() {
		System.out.println("Вывод всех дробей");
		for (Complex st : arr) {
			System.out.println(st);
		}
		System.out.println("Конец вывода");
	}

	private void tryMthFraction() {
		System.out.println("Проверка математических выражений");
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.println(arr[i] + " + " + arr[i + 1] + " = " + MathComplex.add(arr[i], arr[i + 1]));
			System.out.println(arr[i] + " - " + arr[i + 1] + " = " + MathComplex.subtract(arr[i], arr[i + 1]));
			System.out.println(arr[i] + " * " + arr[i + 1] + " = " + MathComplex.multiply(arr[i], arr[i + 1]));
			System.out.println(arr[i] + " / " + arr[i + 1] + " = " + MathComplex.divide(arr[i], arr[i + 1]));

			System.out.println();
		}
		System.out.println("Конец вывода");
	}

}
