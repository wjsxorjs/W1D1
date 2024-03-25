package pm;

public class Test4 {

	public static void main(String[] args) {
		// 산술연산자 : 사칙연산 + 나머지 값(modulo)
		// + : 덧셈
		// - : 뺄셈
		// / : 나눗셈
		// * : 곱셈
		// % : 나머지(modulo)
		
		long a = 10;
		long b = 7;
		long c = a+b; // 덧셈
		long d = a-b; // 뺄셈
		long e = a*b; // 곱셈
		long f = a/b; // 나눗셈(몫)
		long g = a%b; // 나눗셈(나머지)
		
		
		System.out.println(c);
		
		System.out.println(
				  "c: " + a + " + " + b + " = " + (c) + "\n"
				+ "d: " + a + " - " + b + " = " + (d) + "\n"
				+ "e: " + a + " * " + b + " = " + (e) + "\n"
				+ "f: " + a + " / " + b + " = " + (f) + "\n"
				+ "g: " + a + " % " + b + " = " + (g) + "\n"
				);

	}

}
