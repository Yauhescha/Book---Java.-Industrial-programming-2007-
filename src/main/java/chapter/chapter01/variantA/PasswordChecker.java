package main.java.chapter.chapter01.variantA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Создать приложение для ввода пароля из командной строки и сравне-
//ния его со строкой-образцом.
public class PasswordChecker {
static String password ="password";
	public static void main(String[] args) throws IOException {
		System.out.println("Write your's password and put <Enter>");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String temp = reader.readLine();
		if(temp.equals(password))
			System.out.println("Password is right");
		else
			System.out.println("Password is wrong");
	}

}
