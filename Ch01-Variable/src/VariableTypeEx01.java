
public class VariableTypeEx01 {
	public static void main(String [] args) {
		
		boolean bool;
		bool = true;
		
		System.out.println("bool = " + bool);
		
		bool = false;
		System.out.println("bool = " + bool);
		
//		bool = 20;
		char char_a1 = 'A';
		System.out.println("char_a1 = " + char_a1);
		
		char char_a2 = 65;
		
		System.out.println("char_a2 = " + char_a2);
		
		char char_a3 = '\u0041';
		System.out.println("char_a3 = " + char_a3);
		
		char char_a4 = '��';
		System.out.println("char_a4 = " + char_a4);

		char char_a5 = '\uc790';
		System.out.println("char_a5 = " + char_a5);
	} //main()

} // VariableTypeEx01
