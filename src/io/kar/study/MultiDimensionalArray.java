package io.kar.study;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] arr = { {{1,2,3},{4,5,6}},{{11,12,13},{14,15,16} } };
		
		
		System.out.println(arr[0][0][1]);
		
		for(int i = 0; i < 2;i++) {
			for(int j = 0; j < 2; j++) {
				for(int k = 0; k < 3;k++) {
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		
	}

}
