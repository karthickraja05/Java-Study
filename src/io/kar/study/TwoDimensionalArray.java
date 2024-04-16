package io.kar.study;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = { {1,2,3},{3,4,3} };
		
		System.out.println(arr[1][2]);
		
		
		for(int i = 0; i < 2 ; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
