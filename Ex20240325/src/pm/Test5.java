package pm;

public class Test5 {

	public static void main(String[] args) {
		// 비교연산자 (관계연산자)
		// 프로그래밍에서는 연산자를 중심으로 좌측이 기준이 된다.
		// > : 크다.
		// < : 작다.
		// >= : 크거나 같다.
		// <= : 작거나 같다.
		// == : 같다.
		// != : 같지 않다.
		// 비교연산자의 결과는 무조건 true 아니면 false이다. 즉, 결과값의 자료형은 boolean이다.
		
		long a = 10;
		long b = 7;
		
		boolean res = a>b;
		
		System.out.printf("res: %b\n", res);
		
		System.out.printf("a: %d, b: %d\n", a, b);
		System.out.println("a > b: " + (a>b));
		System.out.println("a < b: " + (a<b));
		System.out.println("a >= b: " + (a>=b));
		System.out.println("a <= b: " + (a<=b));
		System.out.println("a == b: " + (a==b));
		System.out.println("a != b: " + (a!=b));
		
		
		//res는 이미 선언한 변수이다. 이를 다시 활용하여 다른 연산의 결과를 저장하여라.
		
		res = (a==b);
		System.out.printf("res: %b\n", res);

		

	}

}
