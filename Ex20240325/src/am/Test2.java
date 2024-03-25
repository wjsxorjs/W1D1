package am;

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
		
		char _char = '2';
		
		byte _byte = 1;
		short _short = 2;
		int _int = 2;
		long _long = 2;
		
		float _float = 4;
		double _double = 8;
		
		
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
		
		char ch1 = 'A';
		System.out.println("\nch1's value : " + ch1);
		
		
		

	}

}
