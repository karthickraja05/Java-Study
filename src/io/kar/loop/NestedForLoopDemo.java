package io.kar.loop;

public class NestedForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,4},{8,2} };
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		int[][] arr2 = {{1,4,5,6},{8,2} };
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length;j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	}

}
