package main.java.chapter.chapter03.variantB.n3;

import java.util.ArrayList;

public class Starter {
	static QuadraticEquation[] arr;

	public void printTaskInfo() {
		System.out.println("3. Определить класс Квадратное уравнение. "
				+ "Реализовать методы для поиска корней, экстремумов, а также интервалов убывания/возрастания. "
				+ "Создать массив/список/множество объектов и определить наибольшие и наименьшие по значению корни.");
		System.out.println();
	}

	public void run() {
		printTaskInfo();
		System.out.println("Начало выполнения задания");
		initArray();
		printAll();
		tryMathFraction();
		minAndMaxRoot();
		System.out.println("Конец выполнения задания");
		System.out.println();
	}

	private void initArray() {
		arr = new QuadraticEquation[] { new QuadraticEquation(3, -6, 10), new QuadraticEquation(3, 2, 5),
				new QuadraticEquation(-1, 3, 5), new QuadraticEquation(15, -20, -42) };
	}

	private void printAll() {
		System.out.println("Вывод всех уравнений");
		for (QuadraticEquation o : arr) {
			System.out.println(o);
		}
		System.out.println("Конец вывода");
	}

	private void tryMathFraction() {
		System.out.println("Проверка математических выражений");
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.println("Уравнение: " + arr[i]);
			System.out.println("Корни уравнения: " + MathQuadraticQquation.getRoots(arr[i]));
			System.out.println("Минимум уравнения: " + MathQuadraticQquation.getExtremes(arr[i], -10, 10)[0]);
			System.out.println("Максимум уравнения: " + MathQuadraticQquation.getExtremes(arr[i], -10, 10)[1]);
			System.out.println(
					"Интервалы роста от -10 до 10: " + MathQuadraticQquation.getRisingIntervals(arr[i], -10, 10));
			System.out.println(
					"Интервалы падения от -10 до 10: " + MathQuadraticQquation.getFallingIntervals(arr[i], -10, 10));
			System.out.println();
		}
		System.out.println("Конец вывода");
	}

	private void minAndMaxRoot() {
		System.out.println("Получение минимального и максимального корней");
		ArrayList<Double> roots = new ArrayList<Double>();
		for (int i = 0; i < arr.length; i++) {
			SolveVariant temp = MathQuadraticQquation.getRoots(arr[i]);
			for (double d : temp.roots)
				roots.add(d);
		}
		double min,max;
		min=max=roots.get(0);
		for(double d:roots) {
			if(d<min)min=d;
			else if(d>max)max=d;
		}

		System.out.println("Минимальный: "+min);
		System.out.println("Максимальный: "+max);
		System.out.println("Конец вывода");
	}

}
