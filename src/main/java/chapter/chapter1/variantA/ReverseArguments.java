package main.java.chapter.chapter1.variantA;
//Создать  приложение,  которое  отображает  в  окне  консоли  аргументы 

//командной строки метода main() в обратном порядке. 

public class ReverseArguments {

	public static void main(String[] args) {

		for(int i=args.length-1;i>=0;i--)
			System.out.println("Args->"+args[i]);
	}

}
