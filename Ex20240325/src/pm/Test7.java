package pm;

public class Test7 {

	public static void main(String[] args) {
		// 증감연산자
		// ++ : 1씩 증가
		// -- : 1씩 감소
		int a = 10;
		int b = a++; // 대입 후 증가
		int c = ++a; // 증가 후 대입
		int d = --a; // 감소 후 대입
		int e = a--; // 대입 후 감소
		//증감연산자가 변수 뒤에 존재할 시 연산 우선순위가 최하위로 변경됨
		//제어가 다음 행으로 이동할 때 수행됨
		System.out.printf(
				  "a: %d\n"
				+ "b(a++): %d\n"
				+ "c(++a): %d\n"
				+ "d(--c): %d\n"
				+ "e(c--): %d\n"
				+ "a: %d\n",a,b,c,d,e,a);
		
		int num1 = 10;
		int num2 = 9;
		System.out.println(num1-- < ++num2); // 10 < 10
		System.out.println(num1 < num2); // 9 < 10
		
		
	}

}
