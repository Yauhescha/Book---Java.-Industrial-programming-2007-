package main.java.chapter.chapter2.variantB;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		float[][] arr = main.getRandomMatrix(5, 5, 20);

		System.out.println(
				"1. Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).");
		main.task1(arr);

		System.out.println("2. Выполнить циклический сдвиг заданной матрицы на k позиций вправо (влево, вверх, вниз).");
		main.task2(arr);

		System.out.println(
				"3. Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.");
		main.task3(arr);

		System.out.println(
				"4. Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки.");
		main.task4(arr);

		System.out.println("5. Транспонировать квадратную матрицу.");
		main.task5(arr);

		System.out.println("6. Вычислить норму матрицы.");
		main.task6(arr);

		System.out.println("7. Повернуть матрицу на 90 (180, 270) градусов против часовой стрелки.");
		main.task7(arr);

		System.out.println("8. Вычислить определитель матрицы.");
		main.task8(arr);

		System.out
				.println("9. Построить матрицу, вычитая из элементов каждой строки матрицы ее среднее арифметическое.");
		main.task9(arr);

		System.out.println(
				"10. Найти максимальный элемент(ы) в матрице и удалить из матрицы все строки и столбцы, его содержащие.");
		main.task10(arr);

		System.out.println("11. Уплотнить матрицу, удаляя из нее строки и столбцы, заполненные нулями.");
		main.task11(arr);

		System.out.println(
				"12. В матрице найти минимальный элемент и переместить его на место за-данного элемента путем перестановки строк и столбцов.");
		main.task12(arr);

		System.out.println(
				"13. Преобразовать строки матрицы таким образом, чтобы элементы, рав-ные нулю, располагались после всех остальных.");
		main.task13(arr);

		System.out.println("14. Округлить все элементы матрицы до целого числа.");
		main.task14(arr);

		System.out.println(
				"15. Найти количество всех седловых точек матрицы. (Матрица А имеет седловую точку Аi,j, если Аi,j является минимальным элементом в i-й строке и максимальным в j-м столбце).");
		main.task15(arr);

		System.out.println(
				"16. Перестроить матрицу, переставляя в ней строки так, чтобы сумма эле-ментов в строках полученной матрицы возрастала.");
		main.task16(arr);

		System.out.println(
				"17. Найти число локальных минимумов. (Соседями элемента матрицы назовем элементы, имеющие с ним общую сторону или угол. Элемент матрицы называется локальным минимумом, если он строго меньше всех своих соседей.)");
		main.task17(arr);

		System.out.println(
				"18. Найти наибольший среди локальных максимумов. (Элемент матрицы называется локальным максимумом, если он строго больше всех своих соседей.)");
		main.task18(arr);

		System.out.println(
				"19. Перестроить заданную матрицу, переставляя в ней столбцы так, чтобы значения их характеристик убывали. (Характеристикой столбца прямо-угольной матрицы называется сумма модулей его элементов).");
		main.task19(arr);

		System.out.println(
				"20. Путем перестановки элементов квадратной вещественной матрицы до-биться того, чтобы ее максимальный элемент находился в левом верх-нем углу, следующий по величине – в позиции (2,2), следующий по ве-личине – в позиции (3,3) и т. д., заполнив таким образом всю главную диагональ.");
		main.task20(arr);

	}

	public float[][] getRandomMatrix(int row, int col, int countNumbers) {
		float arr[][] = new float[row][col];
		Random random = new Random();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[row][col] = random.nextFloat() * countNumbers;
			}
		}
		return arr;
	}

	private void printArray(float[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void task1(float arr[][]) {
		
	}

	public void task2(float arr[][]) {
	}

	public void task3(float arr[][]) {
	}

	public void task4(float arr[][]) {
	}

	public void task5(float arr[][]) {
	}

	public void task6(float arr[][]) {
	}

	public void task7(float arr[][]) {
	}

	public void task8(float arr[][]) {
	}

	public void task9(float arr[][]) {
	}

	public void task10(float arr[][]) {
	}

	public void task11(float arr[][]) {
	}

	public void task12(float arr[][]) {
	}

	public void task13(float arr[][]) {
	}

	public void task14(float arr[][]) {
	}

	public void task15(float arr[][]) {
	}

	public void task16(float arr[][]) {
	}

	public void task17(float arr[][]) {
	}

	public void task18(float arr[][]) {
	}

	public void task19(float arr[][]) {
	}

	public void task20(float arr[][]) {
	}

}
