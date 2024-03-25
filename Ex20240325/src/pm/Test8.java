package pm;

public class Test8 {

	public static void main(String[] args) {
		// 논리연산자
		// && : AND :: 첫번째 조건이 false라면 두번째 조건은 수행하지않음
		// || : OR :: 첫번째 조건이 false라면 두번째 조건은 수행하지않음
		// ^ : XOR
		// ! : NOT

		boolean _true = true;
		boolean _false = false;
		
		int a = 10;
		int b = 10;
		
		System.out.println(++a > b++ && ++a == ++b);
		System.out.println(a);
		System.out.println(b+"\n\n");
		
		System.out.println(++a < b++ && ++a == ++b);
		System.out.println(a);
		System.out.println(b+"\n\n");
				
		
		System.out.println(++a > b++ || ++a == ++b);
		System.out.println(a);
		System.out.println(b+"\n\n");
		
		System.out.println(++a < b++ || ++a != ++b);
		System.out.println(a);
		System.out.println(b+"\n\n");
		
		
		
		
		
		
		System.out.printf(
				  "true && true : %b\n"
				+ "true && false : %b\n"
				+ "false && true : %b\n"
				+ "false && false : %b\n\n"
				+ "true || true : %b\n"
				+ "true || false : %b\n"
				+ "false || true : %b\n"
				+ "false || false : %b\n\n"
				+ "true ^ true : %b\n"
				+ "true ^ false : %b\n"
				+ "false ^ true : %b\n"
				+ "false ^ false : %b\n\n"
				+ "!true : %b\n"
				+ "!false : %b\n"
				,_true&&_true
				,_true&&_false
				,_false&&_true
				,_false&&_false
				,_true||_true
				,_true||_false
				,_false||_true
				,_false||_false
				,_true^_true
				,_true^_false
				,_false^_true
				,_false^_false
				,!_true
				,!_false
				);
		
	}

}
