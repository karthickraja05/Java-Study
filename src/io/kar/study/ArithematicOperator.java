package io.kar.study;

public class ArithematicOperator {

	public static void main(String[] args) {
		int result = 1  + 2;
		System.out.println("Value of Result: " + result);
		
		int org_result = result;
		
		result = result + 1;
		System.out.println(org_result + " + 1 = " + result);
		
		org_result = result;
		result = result - 1;
		System.out.println(org_result + " - 1 = " + result);
		
		org_result = result;
		result = result * 2;
		System.out.println(org_result + " * 2 = " + result);
		
		org_result = result;
		result = result / 2;
		System.out.println(org_result + " / 2 = " + result);
		
		org_result = result;
		result = result % 2;
		System.out.println(org_result + " % 2 = " + result);
		

	}

}
