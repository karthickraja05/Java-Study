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

		for (Integer item : arrayList) {
			System.out.print(item + " ");
		}
		System.out.println();
		
	}

}
