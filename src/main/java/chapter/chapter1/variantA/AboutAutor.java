package main.java.chapter.chapter1.variantA;

import java.util.Calendar;

//Создать приложение, выводящее фамилию разработчика, дату и время 
//получения задания, а также дату и время сдачи задания. Для получения 
//последней  даты  и  времени  использовать  класс  Calendar  из  пакета 
//java.util. 
public class AboutAutor {

	public static void main(String[] args) {
		Calendar calendar =Calendar.getInstance();
		String autor = "Yauheni";
		String timeStart="03.08.2020";
		
		System.out.println(autor+" got task "+timeStart
				+" and did it "+calendar.getTime());
	}

}
