
public class CastEx03 {

	public static void main(String [] args) {
		
		System.out.println("======프로모션======");
		
		byte b1 = 127;
		byte b2 = 127;
		
//		byte b3 = b1 + b2;
		int i1 = b1 + b2;
		System.out.println("i1: " + i1);
		System.out.println("(b1 + b2): " + (b1 + b2));
		
		short s1 = 12345;
		short s2 = 12345;
		int i2 = s1 + s2;
		
		System.out.println("i2: " + i2);
		System.out.println("(s1 + s2): " + (s1 + s2));
		
		
		int int1 = 12345;
		long lg1 = 1234567L;
		
		long result1 = int1 + lg1;
		System.out.println("result1: " + result1);
		
		int in2 = 12345;
		double d1 = 100.3d;
		
		double result2 = in2 + d1;
		System.out.println("result2: " + result2);
		
		System.out.println("======디모션======");
		
		byte b4 = 125;
		byte b5 = 125;
		byte result_byte = (byte)(b4+b5);
		System.out.println("result_byte: " + result_byte);
		
		short s4 = 1234;
		short s5 = 1234;
		short result_short =(short)(s4 + s5);
		System.out.println("result_short: " + result_short);
		System.out.println("s4 + s5: " + s4 + s5);
		
		int int3 = 1234;
		float f1 = 100.5f;
		
//		int result_int1 = int3 + f1;
		int result_int2 = (int)(int3 + f1);
		int result_int3 = int3 + (int)f1;
		
		System.out.println("result_int2: " + result_int2);
		System.out.println("result_int3: " + result_int3);
		System.out.println("int3 + f1: " + int3 + f1);
		
		int int4 = 1234;
		long lg4 = 1234L;
		int result_int4 = (int)(int4 + lg4);
		int result_int5 = int4 + (int)lg4;
		
		System.out.println("int4 + lg4: " + int4 + lg4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
