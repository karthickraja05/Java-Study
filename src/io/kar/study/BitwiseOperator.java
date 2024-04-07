package io.kar.study;

public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 7;
		
		// 0101 & 0111 = 0101 = 5
		System.out.println("a & b = " + (a & b));
			
		// 0101 | 0111 = 0101 = 7
		System.out.println("a | b = " + (a | b));
		
			
		int num = 10; // binary: 0000 1010
		
		int leftShift = num << 2; // binary: 0010 1000, decimal: 40
		int rightShift = num >> 2; // binary: 0000 0010, decimal: 2
		
		System.out.println("Left bit shift " + leftShift);
		
		System.out.println("right bit shift " + rightShift);
		
		int num2 = 100;
		rightShift = num2 >>> 2;
		System.out.println("unsigned bit shift " + rightShift);
	}

}
