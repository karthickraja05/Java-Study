package io.kar.loop;

public class EnhancedForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {11,3,6,23};
		
		for(int item : numbers) {
			System.out.println("Element: " + item);
		}
		
		String[] names = {"Karthick","Sam","Gokul"};
		
		for(String item : names) {
			System.out.println("Name: " + item);
		}
		
		System.out.println("Numbers array length: " + numbers.length);
		System.out.println("Names array length: " + names.length);
		
	}

}
