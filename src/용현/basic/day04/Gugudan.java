package 용현.basic.day04;

import java.util.Scanner;                //스캐너를 쓰기위해 기본적으로 필요한 코드

public class Gugudan {
	public static void main(String[] args) {
		// 구구단 출력하기 
		// ex) 7단을 출력하세여 v1
		System.out.println("7 * 1 = 7 ");
		System.out.println("7 * 2 = 14 ");
		System.out.println("7 * 3 = 21 ");
		System.out.println("7 * 4 = 28 ");
		System.out.println("7 * 5 = 35 ");
		System.out.println("7 * 6 = 42 ");
		System.out.println("7 * 7 = 49 ");
		System.out.println("7 * 8 = 56 ");
		System.out.println("7 * 9 = 63 ");
		System.out.println("----- -----");
		
		// ex) 7단을 출력하세여 v2 - for
		int i;
		for(i = 1; i <= 9; ++i ) {
			System.out.println("7 * " + i + " = " + (7*i));
		}
			System.out.println("----- -----");
		
	   
			
			// ex) 7단을 출력하세요 v3 -while, printf 를 사용해서
			String fmt = "7 * %d = %2d\n";         //무슨 뜻인지
			i = 1;
			while(i<=9) {
				System.out.printf(fmt, i, 7*i);
			++i;
			}
			
			// ex) 3단을 출력하세요 = while, printf
			System.out.println("----- -----");
			
			// String fmt2 = "3 * %d = %2d\n";         // %d 사이에 2를 적으면 2자리수로 정렬 3적으면 3자리수
			i = 1;
			while(i<=9) {
				System.out.printf(fmt, i, 3 *i);
			i++;
			}                            // 수식 적을때 괄호 잘닫기 
			
			System.out.println("----- -----");
			
			// 구구단 프로그램 v1
			// 사용자로부터 숫자(1 ~ 9)를 하나 입력받아 구구단을 출력하는 프로그램 작성
			// Scanner, while, printf
			
			int number;
			Scanner sc = new Scanner(System.in);           //  import java.util.Scanner;  스캐너 코드를 쓰기위해 맨위에 설정해야함
			System.out.print("출력할 구구단의 단을 입력하세요 : ");
			number = sc.nextInt();
			
			// String fmt3 = number + " * %d = %2d\n"; 
			i= 1; 
			while(i<=9) {
				System.out.printf(fmt, i, (number * i));
			++i;
			}           
			
			
			// 구구단  프로그램 v2
			// 단, 1 ~ 9이외의 숫자나 문자를입력받으면 " 잘못 입력하셨습니다!!" 라는 메시지를 출력하도록합니다.
			
			System.out.print("출력할 구구단의 단을 입력하세요 : ");
			char number2 = sc.next().charAt(0);
			// 입력받은 문자열 중 첫번째 글자만 뽑아서 char형 변수에 대입   
			
			// 입력받은 문자의 ASCII 코드값이 49~ 57 인지 검사 
			
			String result = (number2 >= 49 && number2 <= 57) ?  " 구구단 출력" : "잘못입력하셨습니다";  //49에서 57인이유 숫자의 아스키 코드 범위! 
			
			// System.out.println(number2+ "" + (int)number2);   // 아스키코드 몇인지 알려주는 코드
			System.out.println(result);
			
			// 구구단  프로그램 v3
		    // 단, 1 ~ 9이외의 숫자나 문자를입력받으면 " 잘못 입력하셨습니다!!" 라는 메시지를 출력하도록합니다.
			System.out.print("출력할 구구단의 단을 입력하세요 : ");
			String number3 = sc.next();
			
			i = 1;
			
			try {
			  while(i <= 9) {
				System.out.printf(fmt, number3, i, (Integer.parseInt(number3) *i));
				++i;
			}
			} catch(Exception ex) {
				System.out.println("잘못입력하셨습니다!");
			}
			
			// 예외 처리코드(try - catch) 를 이용해서 프로그램 실행중 오류발생시 제어를 catch 코드쪽으로 넘김
			
			// ex) 주민 번호를 이용해서 성별을 출력하는 코드를 작성하세요
			// 주민번호 중 123456 -7654321 에서 7이 성별을 나타내는 코드 
			// 1: 1999년 이전에 출생한 남자
			// 2: 1999년 이전에 출생한 여자
			// 3: 2000년 이후에 출생한 남자
			// 4: 2000년 이후에 출생한 여자
			
			// charAt 를 이용해서 풀이
			String jumin = "123456-1234657";
			System.out.print("주민번호:");
			String zm = sc.next();
			
			char gender = jumin.charAt(7);
			result = (gender =='1') ? "1999남자" : 
			         (gender =='2') ? "1999여자" : 
			         (gender =='3') ? "2000남자" : "2000여자";    // '숫자' 를해야 제대로 된 비교가가능! 안그러면 아스키코드값 사용
			
			System.out.println(result);
			
		   
		       
			
				
				
			
				
			//	char zm = sc.next().charAt(9);
			//String result = (zm == 1 && zm == 3) ?  " 남자 " : " 여자 "
			// System.out.println(result);    //내가 주민번호 알아맞추기위해 복붙하면서 시도해봤던것
			
			
						
	
	
	
	
	
	
	
	
	
	
	
	}
}
