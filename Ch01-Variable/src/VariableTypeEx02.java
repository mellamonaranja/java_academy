
public class VariableTypeEx02 {
	public static void main(String [] args) {
		
//		1byte : -128~127
		byte b1=127;
	
		System.out.println("bi = " + b1);
		
// 	byte b2=128;
		// short=2byte : -32,768 ~ 32,767
		short s1 = 32767;
		System.out.println("si = " + s1);
		
		short s2 = 3278;
//		over number error
		
		int i1 = 123456789;
//		int i2 = 3213547825; over number error
		System.out.println("i1 = " + i1);
		
		long lg1 = 123456;
		long lg2 = 123456L;
		long lg3 = 1234567L;
		
		System.out.println("lg1 = " + lg1);
		System.out.println("lg2 = " + lg2);
		System.out.println("lg3 = " + lg3);
		
		
		int num1 = 10;
		int num2 = -10;
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		
	}

}
