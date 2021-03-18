package 용현.basic.day03;

import java.util.Scanner;

/**
 * 
 * @author 용현
 * @category javabasic
 * @version 1.1
 * @자바프로그램 기초 - 성적처리 프로그램
 * 
 * 이름과 성적데이터를 키보드로 직접 입력받아 
 * 총점, 평균, 학점 처리하고 결과출력
 * 
 * 
 */
public class SungJukV1c {
	public static void main(String [] args) {
		//변수 선언
		String name;           // 이름
		int kor;             // 국어점수
		int eng;             // 영어점수
		int mat;            //수학점수
		int tot;            // 총점
		double avg;         // 평균은 더블
		char grd;         // 학점은 문자
		
		
	
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
		avg = (double) tot / 3 ;
		grd = '가';
		//grd = (avg <=100 & avg >= 90)
	    grd = (avg >= 90) ? '수' : 
	    	  (avg >= 80) ? '우' :
	          (avg >= 70) ? '미' :
	          (avg >= 60) ? '양' : '가';
		
		
		//총점 평균 학점 처리
		
		System.out.print("총점은 ");
		System.out.println(tot);
		System.out.print("평균은 ");
		System.out.println(avg);
		System.out.print("학점은 ");
		System.out.println(grd);
		
		// 출력
		// 이름: ??, 국어: ??, 영어: ??, 수학: ??
		// 총점: ??. 평균: ??, 학점: ??
		
		System.out.printf("이름 : %s , 국어 : %d , 영어 : %d , 수학 : %d  \n", name, kor, eng, mat );
		System.out.printf("총점 : %d 평균 : %.1f  학점 : %c \n",tot,avg,grd);
		
		String fmt = "이름: %s, 국어: %d, 영어:%d, 수학:%d\n";
		System.out.printf(fmt, name,kor,eng,mat);
		fmt = "총점: %d, 평균: %.1f  학점: %c \n";     // .1을 중간에 넣음으로써 소수점 첫번째자리까지만 구한다
		System.out.printf(fmt,tot,avg,grd);
		
		
		
		
		
		
		}
}


