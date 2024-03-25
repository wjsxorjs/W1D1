package pm;

import am.Test1;

public class Test2 {
	
	
	public static void main(String[] args) {
		Test1 test = new Test1();
		test.Ex4();
		
		
		/*
		 기본자료형
		  - 논리형 : boolean
		  - 문자형 : char
		  - 정수형 : byte, short, int, long
		  - 실수형 : float, double
		 */
		
		
		boolean _boolean = true;
		
		char _char = '2'; // 0 ~ 65535 (UNICODE)
		
		byte _byte = 1; // -128 ~ 127
		short _short = 2; // -32,768 ~ 32,767
		int _int = 4; // -2,147,483,648 ~ 2,147,483,647
		long _long = 8; // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		
		float _float = 4; // 1.4 x 10^-45 ~ 3.4 x 10^38
		double _double = 8; // 4.9 x 10^-324 ~ 1.8 x 10^308
		
		
		System.out.println("boolean : " + _boolean);
		System.out.println("char : " + _char);
		System.out.println("byte : " + _byte);
		System.out.println("short : " + _short);
		System.out.println("int : " + _int);
		System.out.println("long : " + _long);
		System.out.println("float : " + _float);
		System.out.println("double : " + _double);
		
		//문자 1 개를 저장할 수 있는 공간을 만들려고 한다.
		// 공간의 이름은 ch1이며 저장하고자 하는 문자느 대문자 A이다.
		char A = 'A';
		System.out.println("\nA's value : " + A);
		char ch1 = A;
		A = 'B';
		System.out.println("One Mixer Upping After...\n{\n\tchar ch1 = A;\n\tA = 'B';\n}");
		System.out.println("ch1's value : " + ch1); //변수 ch1의 값을 출력한다.
		System.out.printf("ch1's value : %c\n", ch1); //변수 ch1의 값을 출력한다.
		System.out.println("A's value : " + A);
		// + 연산자는 피 연산자들이 정수이거나 실수일 때는 더하는 연산을 수행한다.
		// 허나, 피 연산자 중 하나라도 문자열이면 다른 쪽의 값을 문자열(String)으로 변환하여 문자열 연결연산자의 역할을 수행한다.
		
		
		//정수형 변수 a를 선언하면서 100을 저장하자!
		byte a = 127;
		short b = 32767;
		int c = 2147483647; //정수형 기본
		long d = 9223372036854775807L;
		System.out.printf("byte max value : %d\n"
						+ "short max value : %d\n"
						+ "int max value : %d\n"
						+ "long max value : %d\n",a,b,c,d);
		
		
		float f = 3.14f;
		double dd = 3.14; // 실수형 기본
		System.out.printf("float f's value : %.3f\n"
						+ "double dd's value : %.3f\n",f,dd);
		
		

	}

}
