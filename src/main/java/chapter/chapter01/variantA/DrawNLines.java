package main.java.chapter.chapter01.variantA;

//Создать приложение, выводящее n строк с переходом и без перехода на 
//новую строку. 
public class DrawNLines {

	public static void main(String[] args) {

		int n =15;
		String str="It's line";
		for(int i=0; i<n;i++)
			System.out.println(str);
		for(int i=0; i<n;i++)
			System.out.print(str);
	}

}
