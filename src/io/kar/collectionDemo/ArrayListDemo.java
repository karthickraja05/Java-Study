package io.kar.collectionDemo;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> arrayList = new ArrayList<Integer>(5);

		for(int i = 1 ; i <= 5; i++){
			arrayList.add(i);
		}

		System.out.println(arrayList);

		arrayList.remove(3);

		System.out.println(arrayList);

		System.out.println("Array List Size : " + arrayList.size());

		for(int i = 0 ; i < arrayList.size(); i++){
			int temp = arrayList.get(i);
			System.out.print(temp + " ");
		}
		System.out.println();

		for (Integer item : arrayList) {
			System.out.print(item + " ");
		}
		System.out.println();
		
	}

}
