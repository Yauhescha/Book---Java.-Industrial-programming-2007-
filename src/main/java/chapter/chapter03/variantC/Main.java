package main.java.chapter.chapter03.variantC;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		System.out.println("19. Определить класс Массив. Создать методы сортировки: "
				+ "обменная сортировка (метод пузырька); "
				+ "обменная сортировка «Шейкер-сортировка», "
				+ "сортировка посредством выбора (метод простого выбора), "
				+ "сортировка вставками: метод хеширования (сортировка с вычислением адреса), "
				+ "сортировка  вставками (метод простых вставок), "
				+ "сортировка бинарного слияния, "
				+ "сортировка Шелла (сортировка с убывающим шагом).");
		Array a = new Array();
		a.sortBubble(getRandomArray(10));
		
		}
	public static int[] getRandomArray(int size) {
		int[] arr = new int[size];
		Random random =new Random();
		for(int i=0; i<arr.length;i++) {
				arr[i]=random.nextInt(100);
		}
		return arr;
	}
}
