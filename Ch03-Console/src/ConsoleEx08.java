import java.util.Scanner;

public class ConsoleEx08 {

	public static void main(String[] args) {
//		산술연산계산기 만들기
//		피연산자 두 개 입력 시 산술연산(= - * / %)의 결과를 모두 출력해주는 프로그램 만들기
		
//		1)2개 변수 선언, 결과 저장 변수 선언
		int num1;
		int num2;
		float result;
		
//		2)입력장치 생성
		java.util.Scanner scanner = new java.util.Scanner(System.in);
//		입력장치를 scanner라는 이름으로
		
//		3)입력장치로 숫자를 입력받아 변수에 저장
		System.out.print("첫번째 피연산자의 수를 입력하세요> ");
		num1= scanner.nextInt();
//		int로 입력받아
		

		System.out.print("두번째 피연산자의 수를 입력하세요> ");
		num2= scanner.nextInt();
		
//		4) 산술연산한 결과 출력
		result = num1 + num2;
		System.out.printf("%d + %d = %5.2f\n", num1, num2, result);
//		%5.2f : 전체 5자리에 소수점 이하는 두 자리로 표현
		
		result = num1 - num2;
		System.out.printf("%d - %d = %5.2f\n", num1, num2, result);
		
		result = num1 * num2;
		System.out.printf("%d * %d = %5.2f\n", num1, num2, result);
		
		result = num1 + num2;
		System.out.printf("%d / %d = %5.2f\n", num1, num2, result);
		
		result = num1 % num2;
		System.out.printf("%d %% %d = %d\n", num1, num2, (int)result);
				
		
		
		

	}

}
