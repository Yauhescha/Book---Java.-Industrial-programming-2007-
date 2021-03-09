package main.java.chapter.chapter03.variantB.n5;

public class Starter {
	static Interval[] arr;

	public void printTaskInfo() {
		System.out.println("5. Определить класс Интервал с учетом включения/невключения концов. "
				+ "Создать методы по определению пересечения и объединения интервалов, причем интервалы, не имеющие общих точек, пересекаться/объединятся не могут. "
				+ "Объявить массив/список/множество и n интервалов и определить расстояние между самыми удаленными концами.");
		System.out.println();
	}

	public void run() {
		printTaskInfo();
		System.out.println("Начало выполнения задания");
		initArray();
		printAll();
		tryMathFraction();
		sumAllArray();
		System.out.println("Конец выполнения задания");
		System.out.println();
	}

	private void initArray() {
		arr = new Interval[] { 
				new Interval(1,10,true),
				new Interval(5, 10, true),
				new Interval(-1, 1,false),
				new Interval(-1,1,true)
		};
	}

	private void printAll() {
		System.out.println("Вывод всех уравнений");
		for (Interval o : arr) {
			System.out.println(o);
		}
		System.out.println("Конец вывода");
	}

	private void tryMathFraction() {
		System.out.println("Проверка пересечения интервалов");
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.println(arr[i] +" и "+arr[i + 1] + " = "+MathInterval.isIntersection(arr[i], arr[i+1]));
			System.out.println(arr[i] +" и "+arr[i + 1] + " = "+MathInterval.intersection(arr[i], arr[i+1], 0.1));
			System.out.println();
		}
		System.out.println("Конец вывода");
	}

	private void sumAllArray() {
		System.out.println("Определить расстояние между самыми удаленными концами");
		for (int i = 0; i < arr.length; i++) {
//			p  = MathPolynominal.add(arr[i], p);
		}
		System.out.println("Конец вывода");
	}

}
