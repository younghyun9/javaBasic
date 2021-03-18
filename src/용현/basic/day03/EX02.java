package 용현.basic.day03;
// 연습문제 7번 8번
public class EX02 {
	public static void main(String [] args) {
		double result;
		//가
		result = ( 3 + ((4.5 * 2) + (27 / 8)) );
		System.out.println(" 3 + 4.5 * 2 + 27 ÷ 8 = " + result);  // 결과는 15.375인데 왜 15로 표시되는지
	    
		//나
		String result2 = ( 3 < 4 ) ? "참입니다" : "거짓입니다" ;
		System.out.println(result2);
		String result3 = ( 5 == 7 ) ? "참입니다" : "거짓입니다";
		System.out.println(result3);
		
		//나 (선생님용)
		//System.out.println(true \\ false && 3 < 4 \\ ! (5 == 7));
		
		//다
		String result4 = ( 3 < 5 & 6 >= 2 ) ? "참입니다" : "거짓입니다";
		System.out.println(result4);
		
		//라
		// String result5 =
		// 잘못된 비교대상으로 오류
		
		
		//마
		System.out.println(7 % 4 + 3 - 2 / 6 * 'Z');
		// 단일 문자를 수식에 사용하면 자동으로 숫자형으로 바뀜 
		// 숫자형으로 변환되는 기준은 ASCII 코드값을 참조함 숫자0 = 48 소문자a = 97 대문자A = 65
		
		//바
		System.out.println('D' + 1 + 'M' % 2 / 3);
		
		//사
		System.out.println(5.0 / 3 + 3 / 3);
		
		//아
		System.out.println(53 % 21 < 45 / 18);
		
		//자,차 코드 추가해서 넣으면 실행됨

		
		
		//8번
		
		//가
		System.out.println("May 13, 1988 fell on day number");
		
		//나
		double result8 = (((13 + (13 * 3 - 1) / 5 + 2021 % 100 + 2021 % 100 / 4 + 2021 / 400 - 2 *(2021 / 100)) % 7 + 7) % 7 );
		System.out.println("((13 + (13 * 3 - 1) / 5 + 2021 % 100 + 2021 % 100 / 4 + 2021 / 400 - 2 *(2021 / 100)) % 7 + 7) % 7 = " + result8);
		
		
		// 특정연도 -1의 12월31일의 요일 출력
		// 0: 일 1: 월 ..., 6:토
		//따라서, 특정연도의 1월 1일의 요일 출력하려면 계사신 결과에 +1을 해주면 됨
		
		//다
		System.out.println("Check out this line ");
		
		//라 
		int result9 = (9+7);
		System.out.println(" // hello there " + result9 );
		
		//마
		//String result10 = ();
		System.out.println('H'+'I'+ "is" + 1 + "more example");
		
		//H랑 I 사이 산술연산자로 인해 H와 I가 숫자형으로 변환되어 + 연산이 수행됨
		// 바도 마랑 똑같다
		
		// System.out.println(" Print both of us", "Me too");
		// 2개의 출력문을 사용해라! 콤마로는 안됀다
		
		System.out.println( "Reverse" +'I' + 'T');
		System.out.println( "Here is " + 10 * 10); // that's 100;  
		System.out.println( "Not x is" + true );
		//System.out.print();  //() 안에 전달값이 있어야함 ! 출력할대상이 지정되지않았으므로 오류발생 
		//System.out.println;   // 괄호가 필요
		//System.out.println("How about this one" ++ '?' + 'Huh?'); // 문자열에 사용할 수 없는 증감 연산자를 사용했음! 
	
	}

}
