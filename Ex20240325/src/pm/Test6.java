package pm;

public class Test6 {

	public static void main(String[] args) {
		// 비트(bit)연산자
		// & : AND
		// | : OR
		// ~ : NOT
		
		long a = 0b1010;
		long b = 0b0111;
		System.out.printf("%d(1010) & %d(0111) = %d(0010)\n",a,b,a & b);
		System.out.printf("%d(1010) | %d(0111) = %d(1111)\n",a,b,a | b);
		System.out.printf("~%d = %d\n",a, ~a);
		
		
		
	}

}
