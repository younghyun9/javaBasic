
public class Operators {
	public static void main(String [] args) {
		// 개발자용 폰트
		// 개발자의 취향에 따라 합자(laightaure)를 지원하는 폰트 사용여부 결정
		// 이것을 사용함에 따라 수학기호를 따로 표시하든지 붙여서 표현하든지 결정할 수 있음
		// 합자기능이 있는 폰트 : d2coding, cascadia
		
		
		// 연산자 operator
		// 여러종류의 연산을 수행하기 위해 제공되는 기호
		// 산술연산, 비교연산, 논리연산, 조건연산  4가지만 알아둘것! 
		
		
		
		// 산술연산 : 사칙연산을 다루는 연산 (+, -, *, /, % )
		int x = 30, y = 15;   //같은 종류의 변수일때 한줄에서 콤마를이용해서 코딩 , 그리고 변수선언동시에 초기화도 가능
		System.out.println("30+15 연산 " + (x + y));  
		System.out.println("30*15 연산 " + (x * y));  
		System.out.println("30÷15 연산 " + (x / y));  
		System.out.println("30 mod 15 연산 " + (x % y));   // 모드란 나머지 단축키는 %   
		
		// 비교연산 : 값들의 상대적인 크기를 판단
		// 왼쪽 피연산자를 기준으로  오른쪽 피연산자와 비교
		// 비교연산의 결과는 논리값( 참, 거짓) 으로 반환
	
		System.out.println("30 > 15 " + (x > y));
		System.out.println("30 < 15 " + (x < y));
		System.out.println("30 ≠ 15 " + (x != y));     // != 은 같지않다의 의미
		System.out.println("30 = 15 " + (x == y));
		
		// 논리연산 : 주어진 논리식을 판단   (and or not) 
		// 논리연산의 결과는 논리값(참,거짓) 으로 반환
		// 보통 2개 이상의 비교연산식으로 구성됨
		// 논리곱연산 : &, &&  (short-circuit 지원)
		// 논리합연산 : │, ││ 
		// 논리부정연산 : !
		
		// 단축식 평가 short-circuit
		// 여러개의 논리식중에 어떤 식에 의해 참거짓이 확정되면 나머지 논리식을 평가하지않음
		boolean result =( x > y) & (x != y);
		System.out.println("( x > y) and (x ≠ y) " + result);
		
		// 조건연산자 (삼항연산자)
		// 3개의 피연산자를 이용해서 조건에 따라 특정 피연산자를 취하도록 사용하는 특수한 연산자
		// 형식 : 조건식 ? 참일때값 : 거짓일때 값
		
		String result2 = ( x > y ) ?  "x가 큽니다 " : " y가 큽니다 " ;  // 조건식에 괄호를 사용해서 가독성을 높힘
		System.out.println(result2);
		
		// 증감 연산자
		// 피연산자의 값을 하나 증가시키거나 감소시킴 
		// 피연산자의 어느쪽에 위치하는가에 따라 연산의 순서가 달라짐 
		// i = 1 => i = i + 1 => i += 1 => ++i 
		int a = 7, b = 7; 
		int result3 = ++a + 10;  // a값을 증가시킨후 연산참여 (전치)
		int result4 = b++ + 10;  // b값을 연산에참여한 후 값 증가 (후치)
	    System.out.println(result3);
	    System.out.println(result4);    // 전치 연산자 쓰는것이 기본 
		
		
		
	}
}
