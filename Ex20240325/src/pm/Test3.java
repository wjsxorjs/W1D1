package pm;

public class Test3 {

	public static void main(String[] args) {
		// 대문자 A를저장하는 문자형 변수 a를 정의하자.
		char a = 'A'; //a에는 'A'의 UNICODE값이 저장되어있다.
		// 문자형 변수 b
		char b = a; // a의 값을 b에 저장하고싶다?
//		b = 65;
		int c = (int)a+2;
		char d = (char) c;
		
		System.out.println("a : " + a); // A
		System.out.println("b : " + b); // A
		System.out.println("c : " + c); // 67
		System.out.println("d : " + d); // C
		System.out.printf("[A]'s Unicode : %d", 1*a);

	}

}
