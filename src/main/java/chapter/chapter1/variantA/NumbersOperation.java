package main.java.chapter.chapter1.variantA;

//Создать программу ввода целых чисел как аргументов командной стро-
//ки, подсчета их суммы (произведения) и вывода результата на консоль
public class NumbersOperation {

	public static void main(String[] args) {
		int add = 0;
		int mul = args.length > 0 ? 1 : 0;
		int temp;
		for (String str : args) {
			temp = Integer.parseInt(str);
			add += temp;
			mul *= temp;
		}
		System.out.println("Summ is " + add);
		System.out.println("Multiply is " + mul);
	}
}
