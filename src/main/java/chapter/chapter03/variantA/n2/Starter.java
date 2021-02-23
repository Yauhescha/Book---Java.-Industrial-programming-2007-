package main.java.chapter.chapter03.variantA.n2;

import java.util.Arrays;

public class Starter {
	static Customer[] arr;

	public static void main(String[] args) {
		System.out.println("Начало выполнения задания");
		initArrayOfCustomer();
		printCustomersOrderByFirstname();
		printCustomersWithCreditCardNumberBetween(222222,888888);
		System.out.println("Конец выполнения задания");
		System.out.println();
	}
	private static void initArrayOfCustomer() {
		arr=new Customer[]{
				new Customer(1, "Matrix 1","Surname1","Lastname1", "adres1", 666666,5777777),
				new Customer(2, "Alan 2","Surname2","Lastname2", "adres2", 111111,4777777),
				new Customer(3, "Petr 3","Surname3","Lastname3", "adres3", 999999,3777777),
				new Customer(4, "Croule4","Surname4","Lastname4", "adres4", 123456,2777777),
				new Customer(5, "Jam 5","Surname5","Lastname5", "adres5", 654321,1777777),
			};
	}

	private static void printCustomersOrderByFirstname() {
		System.out.println("Список покупателей в алфавитном порядке");
		Arrays.sort(arr);
		for(Customer cstm:arr) {
			System.out.println(cstm);
		}
		System.out.println("Конец вывода");
	}

	private static void printCustomersWithCreditCardNumberBetween(long startCreditCardNumber, long endCreditCardNumber) {
		System.out.println("Cписок покупателей, у которых номер кредитной карточки находится в заданном интервале.");
		System.out.println("ОТ: "+startCreditCardNumber+" и ДО: "+endCreditCardNumber);
		for(Customer cstm:arr) {
			if(cstm.getCreditCardNumber()>=startCreditCardNumber && cstm.getCreditCardNumber()<=endCreditCardNumber)
				System.out.println(cstm);
		}
		System.out.println("Конец вывода");
	}
	
	public static void printTaskInfo() {
		System.out.println("2. Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета.");
		System.out.println(" Создать массив объектов. Вывести:");
		System.out.println("a) список покупателей в алфавитном порядке;");
		System.out.println("b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.");
		System.out.println();
	}
}

	