package main.java.chapter.chapter03.variantA.n1;

import java.sql.Date;

public class Starter {
	static Student[] arr;

	public static void main(String[] args) {
		initSt();
		getStudentFromFacult(Facultet.FITR);
		getStudentFromFacultAndCourse(Facultet.FITR, Course.FIRST);
		getStudentWithDateBornAfter(new Date(System.currentTimeMillis()));
	}

	private static void getStudentWithDateBornAfter(Date date) {
		System.out.println("Вывод всех, кто младше "+date);
		for(Student st:arr) {
			if(st.getDateBorn().before(date))
				System.out.println(st);
		}
		System.out.println("Конец вывода");
	}

	private static void getStudentFromFacultAndCourse(Facultet facult, Course course) {
		System.out.println("Вывод всех, совпадающих по факультету "+facult.getName()+" и курсу "+course);
		for(Student st:arr) {
			if(st.getFacultet()==facult && st.getCourse()==course)
				System.out.println(st);
		}
		System.out.println("Конец вывода");
	}

	private static void getStudentFromFacult(Facultet faluct) {
		System.out.println("Вывод совпадающий по факультету "+faluct.getName());
		for(Student st:arr) {
			if(st.getFacultet()==faluct)
				System.out.println(st);
		}
		System.out.println("Конец вывода");
	}

	private static void initSt() {
		arr=new Student[]{
			new Student(0, "Firstname1","Surname1","Lastname1", Date.valueOf("2005-05-14"),"Adres1","phone1",Facultet.AI,Course.FIRST, Group.AIM6),
			new Student(1, "Firstname2","Surname2","Lastname2", Date.valueOf("1980-08-08"),"Adres2","phone2",Facultet.DESIGN,Course.SECOND, Group.BT),
			new Student(2, "Firstname3","Surname3","Lastname3", Date.valueOf("2016-08-13"),"Adres3","phone3",Facultet.FITR,Course.THIRD, Group.IT4),
			new Student(3, "Firstname4","Surname4","Lastname4", Date.valueOf("2023-02-10"),"Adres4","phone4",Facultet.AI,Course.FOURTH, Group.ONT),
			new Student(4, "Firstname5","Surname5","Lastname5", Date.valueOf("2021-03-20"),"Adres5","phone5",Facultet.DESIGN,Course.FIRST, Group.AIM6)
			};
	}

}

	