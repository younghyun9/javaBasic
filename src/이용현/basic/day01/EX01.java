package 이용현.basic.day01;
// 연습문제 실습

public class EX01 {
	public static void main (String [] args) {
	
  // 1번
		System.out.println("☆    ☆    ☆☆    ☆☆☆☆   ☆☆☆☆   ☆    ☆       / / / / /  ");
	    System.out.println("☆    ☆   ☆  ☆   ☆     ☆  ☆     ☆  ☆    ☆    │   O   O   │");
	    System.out.println("☆☆☆☆  ☆    ☆  ☆☆☆☆   ☆☆☆☆    ☆  ☆    (│     ^     │)");
	    System.out.println("☆    ☆ ☆☆☆☆☆ ☆     ☆  ☆     ☆     ☆       │   [ _ ]   │  ");
	    System.out.println("☆    ☆ ☆       ☆☆      ☆ ☆      ☆    ☆           _ _ _ _     ");
	    System.out.println("");
	    System.out.println("              +---+");
	    System.out.println("             │   │");
	    System.out.println("          +---+---+");
	    System.out.println("         │   │  │");
	    System.out.println("      +---+---+---+          /\\ /\\     -----                  ");
	    System.out.println("     │  │   │  │        (  '   ' )  /  Hello ＼                      ");
	    System.out.println("  +---+---+---+---+          (   -  )  <   Junior │     ");
	    System.out.println(" │  │  │  │  │          │ │ │   ＼ Coder! /              ");
	    System.out.println("  +---+---+---+---+          ( _│ _)      ------                   ");
	 
	    
	    //3
	    int rate1 ;
	    // int 1stPlayer;     // 숫자로 시작하면 안됌
	    //int myprogram.java;   // 사용가능 기호는 _ $  밖에없음
	    // int long;      //  자바 예약어를 변수로 선언
	    int TimeLimit;            // 가능,변수명은 소문자로 시작할것! 
	    int numberOfwindows;  // 가능
	
	    //4 
	    // 표현식 : expression
	    // 계산이나 처리를 위해 작성하는 식을 의미
	    // 수학에서 수식과 유사
	    // 표현식의 중요한 특징은 평가evaluate임
	    // 코드의 결과를 알아내는 과정을 의미  
	    
	    int x, y, z, s, s0, v, t, g; // 공백을 써서 코드의 가독성을 높여주길 바람
	    int result;
	    x = 10;                                            //위에서 변수값들을 설정한다
	    y = 20;
	    z = 30;
	    s0 = 5;
	    v = 10;
	    t = 15;
	    g = 20;
	    
	    result = (3 * x);    // 3x 를 주식으로 표현         //result= 이거다 수식을 쓰고
	    System.out.print("3x = ");                         // 똑같은 수식을쓰고
	    System.out.println(result);                        //다음 결과를 알려주고 ln으로 다음줄
	    
	    result = (3 * x) +y ;
	    System.out.print("3x + y = ");
	    System.out.println(result);                  // 배우는 입장
	    
	    
	    System.out.print("(x + y) / 7 = ");
	    System.out.println( (x + y) / 7 );           // 실무입장 
	    
	    result = (3 * x + y) / (z + 2);
	    System.out.print("(3 * x + y) / (z + 2) = ");
	    System.out.println(result);
	    
	    result = s0 + v * t + (1/2) * g * t * t;
	    System.out.print("s0 + v * t + (1/2) * g * t * t = ");
	    System.out.println(result);
	    
	    
	    // 5.
	    
	    double number = (1/3) * 3;
	    System.out.println("(1/3) * 3 = " + number);    //위에 내용을 reslut값을 포함한 한줄
	                                                     // +연산자는 합쳐서 출력  
	                                                     // 서로 다른종류의 변수형을 더할때 형변환이 일어남
	                                                     //  (자동형변환) 정수+ 문자 >> 문자가 되어버림
	                                                     // 0.3333333....이지만 정수화 되서 0이 되어버림 즉 0곱하기3 은 0 
	                                                     // 예상값 : 1 실제값: 0
	                                                     // 정수 나누기 정수의 결과값은 정수이기 때문!
	    int quotient = 7 / 3 ;
	    System.out.println("7 / 3 = " + quotient);
	    
	    //2.33333 이여야하는데 정수 2로 나옴 (정수 나누기 정수의 결과는 정수)
	    
	    int remainder = 7 % 3 ;
	    System.out.println("7 % 3 = " + remainder);
	    
	    result = 11;
	    result /= 2;
	    System.out.println("result /= 2 = " + result);
	    
	    // 복합대입연산자 
	    // 산술연산자와 대입연산자를 합쳐놓은 연산자 
	    // ex) a = a + 1  => a += 1    
	    
	    
	    // 6. 
	    
	    double xx = 2.5;
	    double yy = 1.5;
	    int m = 18;
	    int n = 4;
	    
	    double result2 = xx + n * yy - (xx + n) * yy; 
	    System.out.println("x + n * y - (x + n) * y = "+ result2);
	    
	    result2 = m / n + m % n;
	    System.out.println("m / n + m % n = "+ result2);
	    
	    result2 = 5 * xx - n / 5;
	    System.out.println("5 * x - n / 5 = "+ result2);
	    
	    result2 = 1 - (1 - (1 - (1 - (1 - n))));
	    System.out.println("1 - (1 - (1 - (1 - (1 - n)))) = "+ result2);
	    
	    
	    
	}
}
