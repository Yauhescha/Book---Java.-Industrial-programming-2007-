package main.java.chapter.chapter03.variantB.n4;

public class Starter {
	static Polynominal[] arr;

	public void printTaskInfo() {
		System.out.println("4. Определить класс Полином степени n. "
						 + "Объявить массив/список/множество из m полиномов и определить сумму полиномов массива.");
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
		arr = new Polynominal[] { 
				new Polynominal(3, -6, 10),
				new Polynominal(1,  2,  3,  4, 5),
				new Polynominal(0,  2,  0,  5),
				new Polynominal(-1, 3,  0,  0, 5, -3),
				new Polynominal(1,  1, -1)
		};
	}

	private void printAll() {
		System.out.println("Вывод всех уравнений");
		for (Polynominal o : arr) {
			System.out.println(o);
		}
		System.out.println("Конец вывода");
	}

	private void tryMathFraction() {
		System.out.println("Проверка математических выражений");
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.println("("+arr[i] + ")  +  (" + arr[i + 1] + ") = " + MathPolynominal.add(arr[i], arr[i + 1]));
			System.out.println("("+arr[i] + ")  -  (" + arr[i + 1] + ") = " + MathPolynominal.subtract(arr[i], arr[i + 1]));
			System.out.println("("+arr[i] + ")  *  (" + arr[i + 1] + ") = " + MathPolynominal.multiply(arr[i], arr[i + 1]));
			System.out.println("("+arr[i] + ")  /  (" + arr[i + 1] + ") = ");
			Polynominal[] divide = MathPolynominal.divide(arr[i], arr[i + 1]);
			if(divide!=null) {
			System.out.println("Коэфициент: "+divide[0]);
			System.out.println("Остаток: "+divide[1]);
			}
			System.out.println();
		}
		System.out.println("Конец вывода");
	}

	private void sumAllArray() {
		Polynominal p = new Polynominal();
		
		System.out.println("Сумма уравнений всего массива");
		for (int i = 0; i < arr.length; i++) {
			p  = MathPolynominal.add(arr[i], p);
		}
		System.out.println("Общая сумма: "+p);
		System.out.println("Конец вывода");
	}

}
