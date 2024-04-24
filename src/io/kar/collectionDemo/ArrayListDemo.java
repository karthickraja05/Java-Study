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
		

		List<Integer> arrayList1 = new ArrayList<Integer>(5);

		arrayList1.add(5);
		arrayList1.add(1);
		arrayList1.add(2);
		arrayList1.add(3);
		arrayList1.add(4);
		arrayList1.add(14);
		arrayList1.add(5);

		arrayList1.add(0,4);
		arrayList1.set(0,3);
		arrayList1.remove(0);

		System.out.println(arrayList1);
		System.out.println(arrayList1.isEmpty());
		System.out.println(arrayList1.indexOf(5));
		System.out.println(arrayList1.lastIndexOf(5));
		// System.out.println(arrayList1.get(1));


	}

}
