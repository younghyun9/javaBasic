package 용현.basic.day02;

public class TestPrintf {
	public static void main(String[]args) {
		int x = 5;
		double pi = 3.14;
		
		System.out.print("x = ");
		System.out.print(x);		
		
		System.out.print(" and pi = ");		
		System.out.println(pi);		      // 프린트문을 4개나 씀 
		
		System.out.print("x = " + x);        // 연산자를 이용해서 2개의 출력문을 사용 
		System.out.println(" and pi = " + pi);
		
		System.out.printf("x = %d and pi = %f \n", x, pi);         //printf  메서드를 이용해서 1개의 출력문을 사용
		                   // (" 수식 x= 머다 pi= 머다 \n은 줄바꿈 " 하고 , 변수1, 변수2) ;
                           // 실수는 &d  실수는 %f 문자는 %s
		
		
		String fmt = "x = %d and pi = %f \n";
		System.out.printf(fmt, x, pi);
		
		// printf 매서드를 사용하는 또다른방법
		// 형식 지정자 : 특정 문자열 내에 출력할 대상과 모양을 지정하는데 사용되는 특수한 문자 
		// %d : decimal ,정수를 표기할때 사용
		// %f : float , 실수를 표기할때 사용
		// %c : character, 문자 하나를 표기할때 사용
		// %s : string, 문자열을 표기할때 사용
		
		
	
	
	}               
}
