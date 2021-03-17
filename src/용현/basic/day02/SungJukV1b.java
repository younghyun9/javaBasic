package 용현.basic.day02;

import java.util.Scanner;

/**
 * 
 * @author 용현
 * @category javabasic
 * @version 1.1
 * @자바프로그램 기초 - 성적처리 프로그램
 * 
 * 입력: 이름,국어,영어,수학
 * 처리: 총점,평균,학점
 * 출력: 이름,국어,영어,수학,총점,평균,학점
 * 단, 학점은 : 수우미양가 , ABCDF
 * 이름과 성적데이터를 키보드로 직접입력받아 처리
 * 처리결과 출력시 printf 메서드 사용
 */
public class SungJukV1b {
	public static void main(String [] args) {
		//변수 선언
		String name;           // 이름
		int kor;             // 국어점수
		int eng;             // 영어점수
		int mat;            //수학점수
		int tot;            // 총점
		double avg;         // 평균은 더블
		String grd;         // 학점은 문자
		
		
	
		// 처리
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		//키보드를 이용해서 성적데이터를 입력받기 위해 
		// Scanner 클래스를 초기화함
		
		System.out.print("이름은? ");
		name = sc.next();
		// 키보드로 문자데이터를 입력받아 name 변수에 대입
		
		System.out.print("국어는? ");
		kor = sc.nextInt();
		//키보드로 문자데이터를 입력받아 kor 변수에 대입
		
		System.out.print("영어는? ");
		eng = sc.nextInt();
		//키보드로 문자데이터를 입력받아 eng 변수에 대입
		
		System.out.print("수학은? ");
		mat = sc.nextInt();
		//키보드로 문자데이터를 입력받아 mat 변수에 대입
		
		
	    tot = kor + eng + mat;
		avg = tot / 3 ;
		
		
		//총점 평균 학점 처리
		
		System.out.print("총점은 ");
		System.out.println(tot);
		System.out.print("평균은 ");
		System.out.println(avg);
		
		// 출력
		// 이름: ??, 국어: ??, 영어: ??, 수학: ??
		// 총점: ??. 평균: ??, 학점: ??
		
		System.out.printf("이름 : %s , 국어 : %d , 영어 : %d , 수학 : %d  \n", name, kor, eng, mat );
		System.out.printf("총점 : %d 평균 : %f \n",tot,avg);
		
		String fmt = "이름: %s, 국어: %d, 영어:%d, 수학:%d\n";
		System.out.printf(fmt, name,kor,eng,mat);
		fmt = "총점: %d, 평균: %.1f \n";     // .1을 중간에 넣음으로써 소수점 첫번째자리까지만 구한다
		System.out.printf(fmt,tot,avg);
		
		}
}


