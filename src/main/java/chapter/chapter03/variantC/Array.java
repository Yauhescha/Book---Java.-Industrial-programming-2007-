package main.java.chapter.chapter03.variantC;

public class Array {
	
	public static int[] sortBubble(int[] arr) {
		System.out.println("Array before");
		printArray(arr);
		int temp;
		int readyItem=0;
		boolean isEnd=true;
		while(isEnd) {
			isEnd=false;
			for(int i=0; i<arr.length-1-readyItem;i++) {
				if(arr[i]>arr[i+1]) {
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;	
					isEnd=true;
				}
			}
			readyItem++;
		}
		
		System.out.println("Array after");
		printArray(arr);
		return arr;
	}
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		System.out.println();
	}
}
