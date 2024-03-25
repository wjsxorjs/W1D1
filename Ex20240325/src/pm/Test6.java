package pm;

public class Test6 {

	public static void main(String[] args) {
		// 비트(bit)연산자
		// & : AND
		// | : OR
		// ~ : NOT
		
		
		
		long a = 0b1010;
		long b = 0b0111;
		System.out.printf("%d & %d = %d\n",a,b,a & b);
		System.out.printf("%d | %d = %d\n",a,b,a | b);
		System.out.printf("~%d = %d\n",a, ~a);
		
		
		
	}

}
