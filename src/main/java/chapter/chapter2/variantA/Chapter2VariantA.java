package main.java.chapter.chapter2.variantA;

import java.time.Month;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Chapter2VariantA {
	Scanner sc = new Scanner(System.in);
	int countLinesToInput;
	String[] arrString;

	public static void main(String[] args) {
		Chapter2VariantA chapter2 = new Chapter2VariantA();
		String[] strings = chapter2.getNLinesFromConsole();
		System.out.println(
				"1. Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.");
		chapter2.task1(strings);
		System.out.println(
				"2. Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) значений их длины.");
		chapter2.task2(strings);
		System.out.println(
				"3. Ввести n строк с консоли. Вывести на консоль те строки, длина кото-рых меньше (больше) средней, а также длину.");
		chapter2.task3(strings);
		System.out.println(
				"4. Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. Если таких слов несколько, найти первое из них.");
		chapter2.task4(strings);
		System.out.println(
				"5. Ввести n слов с консоли. Найти количество слов,  содержащих только символы латинского алфавита, а среди них – количество слов с равным числом гласных и согласных букв.");
		chapter2.task5(strings);
		System.out.println(
				"6. Ввести n слов с консоли. Найти слово,  символы в котором идут в стро-гом порядке возрастания их кодов. Если таких слов несколько, найти первое из них.");
		chapter2.task6(strings);
		System.out.println(
				"7. Ввести n слов с консоли. Найти слово,  состоящее только из различных символов. Если таких слов несколько, найти первое из них.");
		chapter2.task7(strings);
		System.out.println(
				"8. Ввести n слов с консоли. Среди слов, состоящих только из цифр, найти слово-палиндром. Если таких слов больше одного, найти вто-рое из них.");
		chapter2.task8(strings);
		System.out.println(
				"9. Написать программы решения задач 1–8, осуществляя ввод строк как аргументов командной строки.");
		chapter2.task9(strings);
		System.out.println(
				"10. Используя оператор switch, написать программу, которая выводит на экран сообщения о принадлежности некоторого значения k интерва-лам (-10k, 0], (0, 5], (5, 10], (10, 10k].");
		chapter2.task10(6);
		System.out.println(
				"11. Используя оператор switch, написать программу, которая выводит на экран сообщения о принадлежности некоторого значения k интервалам (-10k, 5], [0, 10], [5, 15], [10, 10k].");
		chapter2.task11(8);
		System.out.println(
				"12. Написать программу, которая выводит числа от 1 до 25 в виде матрицы 5x5 слева направо и сверху вниз.");
		chapter2.task12();
		System.out.println(
				"13. Написать программу, позволяющую корректно находить корни квад-ратного уравнения. Параметры уравнения должны задаваться с ко-мандной строки.");
		chapter2.task13();
		System.out.println(
				"14. Ввести число от 1 до 12. Вывести на консоль название месяца, соответ-ствующего данному числу. (Осуществить проверку корректности ввода чисел).");
		chapter2.task14(3);

	}

	private void print(String[] obArr) {
		for (int i = 0; i < obArr.length; i++) {
			System.out.println(obArr[i]);
		}
	}

	private String[] getNLinesFromConsole() {
		System.out.println("Cколько слов/строк будет введено?");
		int n = sc.nextInt();
		sc.nextLine();
		String arr[] = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLine();
		}
		return arr;
	}

//	1. Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
	public void task1(String[] strings) {

		int indexMin, indexMax;
		indexMax = indexMin = 0;
		for (int i = 0; i < strings.length; i++) {
			if (strings[indexMin].length() > strings[i].length())
				indexMin = i;
			if (strings[indexMax].length() < strings[i].length())
				indexMax = i;
		}

		System.out.println("Minimum and length");
		System.out.println(strings[indexMin].length() + ": " + strings[indexMin]);
		System.out.println("Maximum and length");
		System.out.println(strings[indexMax].length() + ": " + strings[indexMax]);
	}

//	2. Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) значений их длины.
	public void task2(String[] arr) {
		String temp;
		boolean isOkay = false;
		while (!isOkay) {
			isOkay = true;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i].length() > arr[i + 1].length()) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					isOkay = false;
				}
			}
		}

		print(arr);
	}

//	3. Ввести n строк с консоли. Вывести на консоль те строки, длина кото-рых меньше (больше) средней, а также длину.
	public void task3(String[] arr) {
		int average = 0;

		for (int i = 0; i < arr.length; i++) {
			average += arr[i].length();
		}
		average /= arr.length;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > average)
				System.out.println(arr[i].length() + ": " + arr[i]);
		}
	}

//	4. Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. Если таких слов несколько, найти первое из них.
	public void task4(String[] arr) {
		HashMap<Byte, Integer> map;

		int indexMin = 0, countCharMin;

		map = setByteCountInMap(arr[0]);
		countCharMin = map.size();

		for (int i = 1; i < arr.length; i++) {
			map = setByteCountInMap(arr[i]);
			if (countCharMin > map.size()) {
				countCharMin = map.size();
				indexMin = i;
			}
		}

		System.out.println(countCharMin + ": " + arr[indexMin]);
	}

	private HashMap<Byte, Integer> setByteCountInMap(String str) {
		HashMap<Byte, Integer> map = new HashMap<Byte, Integer>();
		byte[] bytes = str.getBytes();
		for (int j = 0; j < bytes.length; j++) {
			map = addInMap(map, bytes[j]);
		}
		return map;
	}

	private HashMap<Byte, Integer> addInMap(HashMap<Byte, Integer> map, Byte bt) {
		if (!map.containsKey(bt))
			map.put(bt, 1);
		else {
			Integer integer = map.get(bt);
			integer++;
			map.put(bt, integer);
		}
		return map;

	}

//	5. Ввести n слов с консоли. Найти количество слов,  содержащих только символы латинского алфавита, а среди них – количество слов с равным числом гласных и согласных букв.
	public void task5(String[] arr) {
		Pattern pattern = Pattern.compile("[a-zA-Z]*");

		Matcher matcher;
		for (int i = 0; i < arr.length; i++) {
			matcher = pattern.matcher(arr[i]);
			if (matcher.matches()) {
				String temp = arr[i];
				int all = temp.length();
				int gl = temp.replaceAll("[aeiuo]", "").length();
				all -= gl;
				if (all == gl)
					System.out.println(arr[i]);
			}
		}

	}

//	6. Ввести n слов с консоли. Найти слово,  символы в котором идут в стро-гом порядке возрастания их кодов. Если таких слов несколько, найти первое из них.
	public void task6(String[] arr) {
		for (String str : arr) {
			boolean isok = true;
			byte b = str.getBytes()[0];
			byte[] arrB = str.getBytes();
			for (int i = 1; i < arrB.length; i++) {
				byte bt = arrB[i];
				if (b < bt) {
					b = bt;
				} else {
					isok = false;
					break;
				}
			}
			if (isok)
				System.out.println(str);
		}
	}

//	7. Ввести n слов с консоли. Найти слово,  состоящее только из различных символов. Если таких слов несколько, найти первое из них.
	public void task7(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			HashSet<Byte> set = new HashSet<Byte>();
			byte[] bytes = arr[i].getBytes();
			for (int j = 0; j < bytes.length; j++) {
				set.add(bytes[j]);
			}
			if (set.size() == bytes.length) {
				System.out.println(arr[i]);
				break;
			}
		}

	}

//	8. Ввести n слов с консоли. Среди слов, состоящих только из цифр, найти слово-палиндром. Если таких слов больше одного, найти вто-рое из них.
	public void task8(String[] arr) {
		String temp = "";
		boolean isFirst = false;
		for (int j = 0; j < arr.length; j++) {
			temp = checkDigital(arr[j]);
			if (!temp.equals("") & !isFirst)
				isFirst = true;
			else
				break;
		}
		System.out.println(temp);
	}

	private String checkDigital(String s) {
		Pattern p = Pattern.compile("[\\d]*");
		Matcher m = p.matcher(s);

		if (m.matches()) {
			return ifMatches(s);
		}
		return "";
	}

	private String ifMatches(String s) {
		boolean isok = true;

		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				isok = false;
				break;
			}
		}
		if (isok)
			return s;
		return "";
	}

//	9. Написать программы решения задач 1–8, осуществляя ввод строк как аргументов командной строки.
	public void task9(String[] arr) {
		task1(arr);
		task2(arr);
		task3(arr);
		task4(arr);
		task5(arr);
		task6(arr);
		task7(arr);
		task8(arr);
	}

//	10. Используя оператор switch, написать программу, которая выводит на экран сообщения о принадлежности некоторого значения k интерва-лам (-10k, 0], (0, 5], (5, 10], (10, 10k].
	public void task10(int k) {
		switch (k > -k * 10 && k <= 0 ? 1: 
				k > 0 && k <= 5 ? 2 : 
				k > 5 && k <= 10 ? 3 : 
				k > 10 && k <= 10 * k ? 4 : 5) {
		case 1:
			System.out.println("(-10k, 0]");
			break;
		case 2:
			System.out.println("(0, 5]");
			break;
		case 3:
			System.out.println("(5, 10]");
			break;
		case 4:
			System.out.println("(10, 10k]");
			break;
		case 5:
			System.out.println("not in a group");
			break;
		}
	}

//	11. Используя оператор switch, написать программу, которая выводит на экран сообщения о 
//	принадлежности некоторого значения k интервалам (-10k, 5], [0, 10], [5, 15], [10, 10k].
	public void task11(int k) {
		switch (k > -k * 10 && k <= 5 ? 1: 
			k >= 0 && k <= 10 ? 2 : 
			k >= 5 && k <= 15 ? 3 : 
			k >= 10 && k <= 10 * k ? 4 : 5) {
	case 1:
		System.out.println("(-10k, 5]");
		break;
	case 2:
		System.out.println("[0, 10]");
		break;
	case 3:
		System.out.println("[5, 15]");
		break;
	case 4:
		System.out.println("[10, 10k]");
		break;
	case 5:
		System.out.println("not in a group");
		break;
	}
	}

//	12. Написать программу, которая выводит числа от 1 до 25 в виде матрицы 5x5 слева направо и сверху вниз.
	public void task12() {
		int c=1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(c+"\t");
				c++;
			}
			System.out.println();
		}
	}

//	13. Написать программу, позволяющую корректно находить корни квад-ратного уравнения. Параметры уравнения должны задаваться с ко-мандной строки.
	public void task13() {
		float a,b, c,d, sqrt;
		System.out.println("Введите А");
		a=sc.nextFloat();sc.nextLine();
		System.out.println("Введите Б");
		b=sc.nextFloat();sc.nextLine();
		System.out.println("Введите С");
		c=sc.nextFloat();sc.nextLine();
		
		 d=b*b-4*a*c;
		 if(d<0)
			 System.out.println("Дискриминант отрицательный");
		 else {
			 Float x1,x2;
			 sqrt=(float) Math.sqrt(d);
			 x1=(-b + sqrt)/(2*a);
			 x2=(-b - sqrt)/(2*a);
			 System.out.println("X1: "+x1+", X2: "+x2);
		 }
	}

//	14. Ввести число от 1 до 12. Вывести на консоль название месяца, соответ-ствующего данному числу. (Осуществить проверку корректности ввода чисел).
	public void task14(int k) {
		if(k<1||k>12) {
			System.out.println("не диапазона");
			return;
		}
		System.out.println(Month.of(k));
	}

}
