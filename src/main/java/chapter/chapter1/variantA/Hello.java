package main.java.chapter.chapter1.variantA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
  Создать класс Hello, который будет приветствовать любого пользователя, используя командную  строку. 

 */
public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello. Write your's name and put down <Enter>");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Hello, "+reader.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
