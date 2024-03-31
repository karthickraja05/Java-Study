
public class ExplicitDataConversion {
	public static void main(String args[]) {
		double a = 128.34324832432932d;
		System.out.println("double :" + a);
		
		float d = (float) a;
		System.out.println("float :" + d);
		
		int b = (int) a;
		System.out.println("int :" + b);
		
		byte c = (byte) a;
		System.out.println("byte :" + c);
		
		
	}
}
