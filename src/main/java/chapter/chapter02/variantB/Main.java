package main.java.chapter.chapter02.variantB;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		float[][] arr = main.getRandomMatrix(5, 5, 20);
		main.printArray(arr);
		int k = 3;

//		System.out.println(
//				"1. Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).");
//		main.task1(arr,3);

//		System.out.println("2. Выполнить циклический сдвиг заданной матрицы на k позиций вправо (влево, вверх, вниз).");
//		main.task2(arr,k);

//		System.out.println(
//				"3. Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.");
//		main.task3(arr);
//
//		System.out.println(
//				"4. Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки.");
//		main.task4(arr);
//
//		System.out.println("5. Транспонировать квадратную матрицу.");
//		main.task5(arr);
//
//		System.out.println("6. Вычислить норму матрицы.");
//		main.task6(arr);
//
//		System.out.println("7. Повернуть матрицу на 90 (180, 270) градусов против часовой стрелки.");
//		main.task7(arr);
//
//		System.out.println("8. Вычислить определитель матрицы.");
//		main.task8(arr);
//
		System.out
				.println("9. Построить матрицу, вычитая из элементов каждой строки матрицы ее среднее арифметическое.");
		main.task9(arr);
//
//		System.out.println(
//				"10. Найти максимальный элемент(ы) в матрице и удалить из матрицы все строки и столбцы, его содержащие.");
//		main.task10(arr);
//
//		System.out.println("11. Уплотнить матрицу, удаляя из нее строки и столбцы, заполненные нулями.");
//		main.task11(arr);
//
//		System.out.println(
//				"12. В матрице найти минимальный элемент и переместить его на место за-данного элемента путем перестановки строк и столбцов.");
//		main.task12(arr);
//
//		System.out.println(
//				"13. Преобразовать строки матрицы таким образом, чтобы элементы, рав-ные нулю, располагались после всех остальных.");
//		main.task13(arr);
//
//		System.out.println("14. Округлить все элементы матрицы до целого числа.");
//		main.task14(arr);
//
//		System.out.println(
//				"15. Найти количество всех седловых точек матрицы. (Матрица А имеет седловую точку Аi,j, если Аi,j является минимальным элементом в i-й строке и максимальным в j-м столбце).");
//		main.task15(arr);
//
//		System.out.println(
//				"16. Перестроить матрицу, переставляя в ней строки так, чтобы сумма эле-ментов в строках полученной матрицы возрастала.");
//		main.task16(arr);
//
//		System.out.println(
//				"17. Найти число локальных минимумов. (Соседями элемента матрицы назовем элементы, имеющие с ним общую сторону или угол. Элемент матрицы называется локальным минимумом, если он строго меньше всех своих соседей.)");
//		main.task17(arr);
//
//		System.out.println(
//				"18. Найти наибольший среди локальных максимумов. (Элемент матрицы называется локальным максимумом, если он строго больше всех своих соседей.)");
//		main.task18(arr);
//
//		System.out.println(
//				"19. Перестроить заданную матрицу, переставляя в ней столбцы так, чтобы значения их характеристик убывали. (Характеристикой столбца прямо-угольной матрицы называется сумма модулей его элементов).");
//		main.task19(arr);
//
//		System.out.println(
//				"20. Путем перестановки элементов квадратной вещественной матрицы до-биться того, чтобы ее максимальный элемент находился в левом верх-нем углу, следующий по величине – в позиции (2,2), следующий по ве-личине – в позиции (3,3) и т. д., заполнив таким образом всю главную диагональ.");
//		main.task20(arr);

	}

	public float[][] getRandomMatrix(int row, int col, int countNumbers) {
		float arr[][] = new float[row][col];
		Random random = new Random();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = random.nextFloat() * countNumbers * (random.nextBoolean() ? -1 : 1);
			}
		}
		return arr;
	}

	private void printArray(float[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}

	private void printArray(float[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

//	1. Упорядочить столбцы матрицы в порядке возрастания значений элементов k-го строки.
	public void task1(float arr[][], int k) {
		boolean next = true;
		while (next) {
			next = false;
			for (int j = 0; j < arr[k].length - 1; j++) {
				if (arr[k][j] > arr[k][j + 1]) {
					next = true;
					arr = changeCollsMatrix(arr, j, j + 1);
				}
			}
		}
		printArray(arr);

	}

	private float[][] changeCollsMatrix(float arr[][], int a, int b) {
		for (int i = 0; i < arr.length; i++) {
			float temp = arr[i][a];
			arr[i][a] = arr[i][b];
			arr[i][b] = temp;
		}
		return arr;
	}

//	2. Выполнить циклический сдвиг заданной матрицы на k позиций вправо .
	public void task2(float arr[][], int sdvig) {
		int newIndex;
		sdvig = arr[0].length - sdvig;
		while (sdvig >= arr[0].length) {
			sdvig -= arr[0].length;
		}
		float[][] newArr = new float[arr.length][arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				newIndex = sdvig + j;
				while (newIndex >= arr[i].length) {
					newIndex -= arr[0].length;
				}
				newIndex = newIndex % (arr[i].length - 1) != 0 ? newIndex % arr[i].length : newIndex;
				newArr[i][j] = arr[i][newIndex];
			}
		}
		printArray(newArr);
	}

//	3. Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.
	public void task3(float arr[][]) {
		int count = 0, max = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				if (arr[i][j] < arr[i][j + 1]) {
					count++;
					max = count > max ? count : max;
				} else
					count = 0;
			}
		}
		System.out.println("Максимальное количнсьвл возрастающих элементов: " + max);
	}

//	4. Найти сумму элементов матрицы, расположенных между	первым и вторым положительными элементами каждой строки.
	public void task4(float arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			int first = -1, sum = 0;
			inner: for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > 0 && first != -1)
					break inner;
				if (arr[i][j] > 0 && first == -1) {
					first = j;
					continue;
				}
				if (first != -1)
					sum += arr[i][j];
			}
			System.out.println("Строка: " + i + ", Сумма: " + sum);
		}
	}

//	5. Транспонировать квадратную матрицу.
	public void task5(float arr[][]) {
		float[][] newArr = new float[arr[0].length][arr.length];

		for (int i = 0; i < newArr.length; i++) {
			for (int j = 0; j < newArr[i].length; j++) {
				newArr[i][j] = arr[j][i];
			}
		}
		printArray(newArr);
	}

//	6. Вычислить норму матрицы.
	public void task6(float arr[][]) {
		int summ3 = 0;
		System.out.println("Максимальная из сумм элементов строк матрицы");
		float[] col = new float[arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				col[j] += Math.abs(arr[i][j]);
				summ3 += arr[i][j] * arr[i][j];
			}
		}
		System.out.println(getMax(col));

		System.out.println("Максимальная из сумм элементов столбцов матрицы");
		float[] row = new float[arr.length];
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr.length; j++) {
				row[i] += Math.abs(arr[i][j]);
			}
		}
		System.out.println(getMax(row));

		System.out.println("Корень из суммы квадратов элементов матрицы");
		System.out.println(Math.sqrt(summ3));
	}

	private float getMax(float[] arr) {
		float max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		return max;
	}

//	7. Повернуть матрицу на 90 (180, 270) градусов против часовой стрелки.
	public void task7(float arr[][]) {
		arr = new float[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		printArray(arr);
		float[][] newArr;
		newArr = rotate90Left(arr);
		printArray(newArr);
		newArr = rotate180Left(arr);
		printArray(newArr);
		newArr = rotate270Left(arr);
		printArray(newArr);

	}

	private float[][] rotate270Left(float[][] arr) {
		float newArr[][] = new float[arr.length][arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				newArr[j][arr[i].length - i - 1] = arr[i][j];
			}
		}
		return newArr;
	}

	private float[][] rotate90Left(float[][] arr) {
		float newArr[][] = new float[arr.length][arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				newArr[arr[i].length - 1 - j][i] = arr[i][j];
			}
		}
		return newArr;
	}

	private float[][] rotate180Left(float[][] arr) {
		float newArr[][] = new float[arr.length][arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				newArr[arr[i].length - 1 - i][arr[i].length - 1 - j] = arr[i][j];
			}
		}
		return newArr;
	}

//	8. Вычислить определитель матрицы.
	public void task8(float arr[][]) {
		float opred = getOpred(arr);
		System.out.println(opred);
	}

	private float getOpred(float[][] arr) {
		float opr = 0;
		if (arr.length == 2 && arr[0].length == 2)
			return arr[0][0] * arr[1][1] - arr[1][0] * arr[0][1];

		for (int i = 0; i < arr.length; i++) {
			int znak = i % 2 == 0 ? 1 : -1;
			opr += getOpred(getRowMinor(arr, i)) * znak * arr[0][i];
		}
		return opr;
	}

	private float[][] getRowMinor(float[][] arr, int col) {
		float[][] newArr = new float[arr.length - 1][arr[0].length - 1];
		for (int i = 0; i < newArr.length; i++) {
			for (int j = 0; j < newArr[i].length; j++) {
				newArr[i][j] = col <= j ? arr[i + 1][j + 1] : arr[i + 1][j];
			}
		}
		return newArr;
	}

//	9. Построить матрицу, вычитая из элементов каждой строки матрицы ее среднее арифметическое.
	public void task9(float arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			float average = 0;
			for (int j = 0; j < arr[i].length; j++) {
				average += arr[i][j];
			}

			average = average / arr[i].length;
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] -= average;
			}
		}
		printArray(arr);
	}

//	10. Найти максимальный элемент(ы) в матрице и удалить из матрицы все строки и столбцы, его содержащие.
	public void task10(float arr[][]) {
	}

//	System.out.println("11. Уплотнить матрицу, удаляя из нее строки и столбцы, заполненные нулями.
	public void task11(float arr[][]) {
	}

//	12. В матрице найти минимальный элемент и переместить его на место за-данного элемента путем перестановки строк и столбцов.
	public void task12(float arr[][]) {
	}

//	13. Преобразовать строки матрицы таким образом, чтобы элементы, рав-ные нулю, располагались после всех остальных.
	public void task13(float arr[][]) {
	}

//	14. Округлить все элементы матрицы до целого числа.
	public void task14(float arr[][]) {
	}

//	15. Найти количество всех седловых точек матрицы. (Матрица А имеет седловую точку Аi,j, если Аi,j является минимальным элементом в i-й строке и максимальным в j-м столбце).
	public void task15(float arr[][]) {
	}

//	16. Перестроить матрицу, переставляя в ней строки так, чтобы сумма эле-ментов в строках полученной матрицы возрастала.
	public void task16(float arr[][]) {
	}

//	17. Найти число локальных минимумов. (Соседями элемента матрицы назовем элементы, имеющие с ним общую сторону или угол. Элемент матрицы называется локальным минимумом, если он строго меньше всех своих соседей.)
	public void task17(float arr[][]) {
	}

//	18. Найти наибольший среди локальных максимумов. (Элемент матрицы называется локальным максимумом, если он строго больше всех своих соседей.)
	public void task18(float arr[][]) {
	}

//	19. Перестроить заданную матрицу, переставляя в ней столбцы так, чтобы значения их характеристик убывали. (Характеристикой столбца прямо-угольной матрицы называется сумма модулей его элементов).
	public void task19(float arr[][]) {
	}

//	20. Путем перестановки элементов квадратной вещественной матрицы до-биться того, чтобы ее максимальный элемент находился в левом верх-нем углу, следующий по величине – в позиции (2,2), следующий по ве-личине – в позиции (3,3) и т. д., заполнив таким образом всю главную диагональ.
	public void task20(float arr[][]) {
	}

}
