package main.java.chapter.chapter03.variantA.n01;

import java.sql.Date;

public class Starter {
	static Student[] arr;

	public static void main(String[] args) {
		System.out.println("Начало выполнения задания");
		initArrayOfStudents();
		printStudentFromFacult(Facultet.FITR);
		printStudentFromFacultAndCourse(Facultet.FITR, Course.FIRST);
		printStudentWithDateBornAfter(new Date(System.currentTimeMillis()));
		System.out.println("Конец выполнения задания");
		System.out.println();
	}
	private static void initArrayOfStudents() {
		arr=new Student[]{
			new Student(0, "Firstname1","Surname1","Lastname1", Date.valueOf("2005-05-14"),"Adres1","phone1",Facultet.AI,Course.FIRST, Group.AIM6),
			new Student(1, "Firstname2","Surname2","Lastname2", Date.valueOf("1980-08-08"),"Adres2","phone2",Facultet.DESIGN,Course.SECOND, Group.BT),
			new Student(2, "Firstname3","Surname3","Lastname3", Date.valueOf("2016-08-13"),"Adres3","phone3",Facultet.FITR,Course.THIRD, Group.IT4),
			new Student(3, "Firstname4","Surname4","Lastname4", Date.valueOf("2023-02-10"),"Adres4","phone4",Facultet.AI,Course.FOURTH, Group.ONT),
			new Student(4, "Firstname5","Surname5","Lastname5", Date.valueOf("2021-03-20"),"Adres5","phone5",Facultet.DESIGN,Course.FIRST, Group.AIM6)
			};
	}
		private static void printStudentFromFacult(Facultet faluct) {
		System.out.println("Вывод совпадающий по факультету "+faluct.getName());
		for(Student st:arr) {
			if(st.getFacultet()==faluct)
				System.out.println(st);
		}
		System.out.println("Конец вывода");
	}

		private static void printStudentWithDateBornAfter(Date date) {
			System.out.println("Вывод всех, кто младше "+date);
			for(Student st:arr) {
				if(st.getDateBorn().before(date))
					System.out.println(st);
			}
			System.out.println("Конец вывода");
		}

		private static void printStudentFromFacultAndCourse(Facultet facult, Course course) {
			System.out.println("Вывод всех, совпадающих по факультету "+facult.getName()+" и курсу "+course);
			for(Student st:arr) {
				if(st.getFacultet()==facult && st.getCourse()==course)
					System.out.println(st);
			}
			System.out.println("Конец вывода");
		}



	public static void printTaskInfo() {
		System.out.println("1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.");
		System.out.println(" Создать массив объектов. Вывести:");
		System.out.println("a) список студентов заданного факультета;");
		System.out.println("b) списки студентов для каждого факультета и курса;");
		System.out.println("c) список студентов, родившихся после заданного года; ");
		System.out.println("d) список учебной группы.");
		System.out.println();
	}
}

	