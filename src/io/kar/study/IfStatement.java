package io.kar.study;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 98;
		char grade = 'F';
		
		if(score >= 90) {
			grade = 'A';
		}else if(score >= 80) {
			grade = 'B';
		}else if(score >= 70) {
			grade = 'C';
		}else if(score >= 60) {
			grade = 'D';
		}
			
		
		System.out.println(grade);
		
		
		int speed = 89;
		
		if(speed >= 100) {
			System.out.println("Speed more than 100");
		}else {
			if(speed >= 50) {
				
				if(speed >= 70) {
					System.out.println("Speed more than 70");
				}else {
					System.out.println("Speed more than 50");
				}
			}else {
				System.out.println("Speed below 50");
			}
		}
		
		
		
	}

}
