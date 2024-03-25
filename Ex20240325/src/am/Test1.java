package am;

import java.util.Scanner;

/**
 * 
 * @author Jack Esther
 *
 */

public class Test1 {
	
	public static int Ex1(int a, int b){
		return a+b;
	}

	public static void Ex2() {
		Ex3();
		System.out.println("World!!");
	}
	

	public static void Ex3() {
		System.out.print("Hello, ");
	}
	
	
	public void Ex4() {
		System.out.println("Hello, Ex4! I mean, World!!");
	}

	
	
	/*
	 JAVA에서 main함수가 시작하는 부분이다.
	 (main함수는 JVM에 의해 가장 처음에 자동 호출되는 곳이다.)
	 main함수의 경우 변수명을 제외한 public static void main(String[]은 절대 수정이 불가하다.  
	*/
	public static void main(String[] args) { //영역 시작
		System.out.println("Hello, World!");
		System.out.println("Hello, JAVA!");
		System.out.println("World, JAVA!");
		System.out.println("JAVA, World!");
		

		int c1, c2, cRes;
		try (Scanner num1 = new Scanner(System.in)) {
			try (Scanner num2 = new Scanner(System.in)) {
				System.out.println("Input Number 1 : ");
				c1 = num1.nextInt();
				System.out.println("Input Number 2 : ");
				c2 = num2.nextInt();
			}
		}
		cRes = Ex1(c1,c2);
		System.out.println(c1 + "+" + c2 + "=" + cRes);
		System.out.println(); //'sysout' [ctrl] + [space]
		
		
		Ex2();
		
		Test1 test = new Test1();
		
		test.Ex4();
		
		
		System.out.println("End of the Program");
		
	} // 영역 끝 | main 함수의 끝은 프로그램의 끝이다.
	
}
