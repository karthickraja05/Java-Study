package io.kar.loop;

public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 1;
		
		while(count < 10) {
			
			if(count == 3) {
				count++;
				continue;
			}
			
			System.out.println("count:" + count);
			count++;
			
			
			
			
			if(count == 5) {
				break;
			}
		}
		
		
		

	}

}
