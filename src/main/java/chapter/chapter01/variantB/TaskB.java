package main.java.chapter.chapter01.variantB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*
Ввести с консоли n целых чисел и поместить их в массив. На консоль вывести:
 */
public class TaskB {
	int[] arr;

	public static void main(String[] args) {
		TaskB task = new TaskB();
		task.initArray(args);

		System.out.println("1. Четные и нечетные числа.");
		task._1();

		System.out.println("2. Наибольшее и наименьшее число.");
		task._2();

		System.out.println("3. Числа, которые делятся на 3 или на 9");
		task._3();

		System.out.println("4. Числа, которые делятся на 5 и на 7");
		task._4();

		System.out.println("5. Элементы, расположенные методом пузырька по убыванию модулей.");
		task._5();

		System.out.println("6. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.");
		task._6();

		System.out.println("7. Наибольший общий делитель и наименьшее общее кратное этих чисел.");
		task._7();

		System.out.println("8. Простые числа");
		task._8();

		System.out.println("9. Отсортированные числа в порядке возрастания и убывания.");
		task._9();

		System.out.println("10. Числа в порядке  убывания частоты встречаемости чисел.");
		task._10();

		System.out.println("11. “Счастливые” числа.");
		task._11();

		System.out.println("12. Числа Фибоначчи: f0 = f1 = 1, f (n) = f (n–1) + f (n–2).");
		task._12();

		System.out.println("13. Числа-палиндромы, значения которых в прямом и обратном порядке совпадают.");
		task._13();

		System.out.println("14. Элементы, которые равны полусумме соседних элементов.");
		task._14();

		System.out.println(
				"15. Период десятичной дроби p = m/n для первых двух целых положи-тельных чисел n и m, расположенных подряд.");
		task._15();

		System.out.println("16. Построить треугольник Паскаля для первого положительного числа.");
		task._16();
	}

	private void initArray(String[] args) {
		arr = new int[args.length];
		for (int i = 0; i < args.length; i++)
			arr[i] = Integer.parseInt(args[i]);
	}

	private void print(int[] arrInt) {
		for (int i = 0; i < arrInt.length; i++) {
			System.out.print(arrInt[i] + " ");
		}
		System.out.println();
	}

	private void print(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}

	private void print(HashMap<Integer, Integer> map) {
		Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Integer, Integer> pair = iterator.next();
			Integer key = pair.getKey();
			Integer value = pair.getValue();
			System.out.println(key + ":" + value);
		}
	}

	// 1. Четные и нечетные числа.
	private void _1() {
		ArrayList<Integer> chet = new ArrayList<Integer>();
		ArrayList<Integer> neChet = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				chet.add(arr[i]);
			else
				neChet.add(arr[i]);
		}
		print(chet);
		print(neChet);
	}

//2. Наибольшее и наименьшее число.
	private void _2() {
		int min, max;
		min = max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("min: " + min);
		System.out.println("max: " + max);
	}

//3. Числа, которые делятся на 3 или на 9.
	private void _3() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0)
				list.add(arr[i]);
		}
		print(list);
	}

//4. Числа, которые делятся на 5 и на 7.
	private void _4() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 0 || arr[i] % 7 == 0)
				list.add(arr[i]);
		}
		print(list);
	}

//5. Элементы, расположенные методом пузырька по убыванию модулей.
	private void _5() {
		int[] arr2 = arr.clone();

		for (int i = arr2.length - 1; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				if (arr2[j] > arr2[j + 1]) {
					int temp = arr2[j];
					arr2[j] = arr2[j + 1];
					arr2[j + 1] = temp;
				}
			}
		}
		print(arr2);

	}

//6. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
	private void _6() {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 99 && arr[i] < 1000) {
				int one, two, tree;
				String tmp;
				tmp = arr[i] + "";
				one = Integer.parseInt(tmp.charAt(0) + "");
				two = Integer.parseInt(tmp.charAt(1) + "");
				tree = Integer.parseInt(tmp.charAt(2) + "");
				if (one != two && two != tree && tree != one)
					System.out.print(tmp + " ");
			}
		}
		System.out.println();
	}

//7. Наибольший общий делитель и наименьшее общее кратное этих чисел. 
	private void _7() {
		int min = arr[0], nok = -1, nod = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}

		boolean isOk = true;
		for (int i = 1; i <= min; i++) {

			for (int j = 0; j < arr.length; j++) {
				if (arr[j] % i != 0)
					isOk = false;
			}
			if (isOk) {
				nod = i;
			}
			isOk = true;
		}

		first: for (int i = 1; i <= min; i++) {

			for (int j = 0; j < arr.length; j++) {
				if (arr[j] % i != 0)
					break first;
			}
			nok = i;
		}
		System.out.println("nod: " + nod + ", nok: " + nok);
	}

//8. Простые числа.
	private void _8() {
		first: for (int i = 0; i < arr.length; i++) {
			for (int j = 2; j < arr[i]; j++) {
				if (arr[i] % j == 0)
					continue first;
			}
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

//9. Отсортированные числа в порядке возрастания и убывания.
	private void _9() {

		int[] arr2 = arr.clone();

		for (int i = arr2.length - 1; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				if (arr2[j] > arr2[j + 1]) {
					int temp = arr2[j];
					arr2[j] = arr2[j + 1];
					arr2[j + 1] = temp;
				}
			}
		}
		print(arr2);

		int[] arr3 = arr.clone();

		for (int i = arr3.length - 1; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				if (arr3[j] < arr3[j + 1]) {
					int temp = arr3[j];
					arr3[j] = arr3[j + 1];
					arr3[j + 1] = temp;
				}
			}
		}
		print(arr3);
	}

//10. Числа в порядке  убывания частоты встречаемости чисел.
	private void _10() {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i]))
				map.put(arr[i], arr[i] + 1);
			else
				map.put(arr[i], 1);
		}

		print(map);
	}

//11. “Счастливые” числа.
	private void _11() {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>=100000 && arr[i]<=999999) {
				String temp = arr[i]+"";
				int a=Integer.parseInt(temp.charAt(0)+"");
				int b=Integer.parseInt(temp.charAt(1)+"");
				int c=Integer.parseInt(temp.charAt(2)+"");
				int d=Integer.parseInt(temp.charAt(3)+"");
				int e=Integer.parseInt(temp.charAt(4)+"");
				int f=Integer.parseInt(temp.charAt(5)+"");
				if(a+b+c==d+e+f)
					System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}

//12. Числа Фибоначчи: f0 = f1 = 1, f (n) = f (n–1) + f (n–2).
	private void _12() {
		int max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max)max=arr[i];
		}
		
		ArrayList<Integer> fibon = new ArrayList<Integer>();
		fibon.add(0);
		fibon.add(1);
		fibon.add(3);
		int cur=2;
		int last = 1;
		int temp = 0;
		
		while(cur<=max) {
			temp=cur+last;
			fibon.add(temp);
			last=cur;
			cur=temp;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(fibon.contains(arr[i]))
				System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

//13. Числа-палиндромы, значения которых в прямом и обратном порядке совпадают.
	private void _13() {
		for (int i = 0; i < arr.length; i++) {
			String temp = arr[i]+"";
			
			int length = temp.length()/2;
			boolean trust = true;
			for (int j = 0; j < length; j++) {
				int first = Integer.parseInt(temp.charAt(j)+"");
				int last = Integer.parseInt(temp.charAt(temp.length()-1-j)+"");
				if(first!=last)
					trust=false;
			}
			if(trust)
				System.out.print(arr[i]+" ");
			
		}
		System.out.println();
	}

//14. Элементы, которые равны полусумме соседних элементов.
	private void _14() {
		
		for (int i = 1; i < arr.length-1; i++) {
			int subsum=(arr[i-1]+arr[i+1])/2;
			if(arr[i]==subsum)
				System.out.print(i+":"+arr[i]+" ");				
		}
		System.out.println();
	}

//15. Период десятичной дроби p = m/n для первых двух целых положи-тельных чисел n и m, 
//    расположенных подряд.
	private void _15() {
		int[]numbers=new int[] {10,3};
		long firstNumber, secondNumber, r, l, t, i;
		for (int n = 0; n < numbers.length; n++)
			if (numbers.length < 2)
				break;
			else if (numbers[n] >= 0 && numbers[n + 1] >= 0) {
				firstNumber = numbers[n];
				secondNumber = numbers[n + 1];
				r = firstNumber;
				for (i = 0; i < secondNumber; i++)
					r = (r * 10) % secondNumber;
				t = r;
				l = 0;
				do {
					r = (r * 10) % secondNumber;
					l++;
				} while (r != t);
				t = r = firstNumber;

		System.out.print(numbers[n]/numbers[n+1]+".");
		
				for (i = 0; i < l; i++)
					r = (r * 10) % secondNumber;
				for (i = 0; r != t; i++) {
					System.out.print(t * 10 / secondNumber);
					r = (r * 10) % secondNumber;
					t = (t * 10) % secondNumber;
				}
				System.out.print('(');
				for (i = 0; i < l; i++) {
					System.out.print(t * 10 / secondNumber);
					t = (t * 10) % secondNumber;
				}
				System.out.println(')' + " = " + firstNumber + "/" + secondNumber);
				break;
			}
	}

//16. Построить треугольник Паскаля для первого положительного числа. 
	private void _16() {
		int maxRows = 6;
		int r, num;
		for (int i = 0; i <= maxRows; i++) {
		       num = 1;
		       r = i + 1;

		       for (int j = maxRows - i; j > 0; j--) {
		           System.out.print(" ");
		       }
		       for (int col = 0; col <= i; col++) {
		           if (col > 0) {
		               num = num * (r - col) / col;
		           }
		           System.out.print(num + " ");
		       }
		       System.out.println();
		}
	}

}
