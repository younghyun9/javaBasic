package 용현.basic.day05;

import java.util.Scanner;    // 스캐너 쓰기위해 필요

/**
 * 
 * @author 용현
 * @category javabasic
 * @version 1.2
 * @자바프로그램 기초 - 성적프로그램v2b
 * 성적처리시 학점계산을 switch문으로 작성
 */ 

// 반복문을 이용해서 성적데이터 입력을 계속 수행함

public class SungJukV2b {
	public static void main(String [] args) {
		// 변수선언
		String name;
		int kor, eng, mat;
		int tot;
		double avg;
		char grd;
		String fmt = "%s, %d, %d, %d\n"+          // 출력형식 + 줄바꿈  
		             "%d, %.1f, %c\n";             // 출력형식 +줄바꿈           //%.1f 를 사용해서 소수점 첫번쨰까지만 나오도록 .1을 사용
		Scanner sc = new Scanner(System.in);  // 위에다가 적어야되는거
		
		
		
		
		
		
		// 성적처리
		int i = 1;                                    // while 문의 조선식을 true로 설정하면 횟수 지정없이 계속 코드를 실행함
		while(i <= 3) {                               // while 문을통해 3번반복하도록 설정  
		
			System.out.print("이름은? ");
			name = sc.next();                 //선언해야될게 있겠지? 위에다가 적자
			System.out.print("국어는? ");
			kor = sc.nextInt();         
			System.out.print("영어는? ");
			eng = sc.nextInt();         
			System.out.print("수학은? ");
			mat = sc.nextInt();         
			
			tot = kor + eng + mat;
			avg = (double)tot / 3 ;
			// 학점 계산을  if 문으로 작성한다면?
			//if (avg>= 90) grd = '수';
			//else if (avg >= 80) grd = '우';
			//else if (avg >= 70) grd = '미';
			//else if (avg >= 60) grd = '양';
			//else  grd = '가';
			
			// 학점계산을 switch문으로 작성한다면?
			// avg : 99.9 => (int)avg : 99
			switch((int)avg/ 10) {                   //avg 를 (int)를 사용해서 정수화   // case99~90을 간소화하기위해 조건에 /10을하여 case 99~90을 case 9로 간편화
			case 100 :
			case 9 : grd = '수'; break;
			case 8 : grd = '우'; break;
			case 7 : grd = '미'; break;
			case 6 : grd = '양'; break;
			default: grd = '가'; 
		
			}
				  
			
			// 결과 출력
			System.out.printf(fmt, name, kor, eng, mat, tot, avg, grd);
			++i;            //반복증감식
		}	  // while 문의 괄호
	}         // main문의 괄호
}  // class의 괄호
