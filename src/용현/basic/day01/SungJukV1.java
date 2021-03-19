package 용현.basic.day01;

/**
 * 
 * @author 용현
 * @category javabasic
 * @version 1.0
 * @자바프로그램 기초 - 성적처리 프로그램
 * 
 * 입력: 이름,국어,영어,수학
 * 처리: 총점,평균,학점
 * 출력: 이름,국어,영어,수학,총점,평균,학점
 * 단, 학점은 : 수우미양가 , ABCDF
 */
public class SungJukV1 {
	public static void main(String [] args) {
		//변수선언
		String name;
		int kor;
		int eng;
		int mat;
		int tot;
		double avg;
		char grd;            //string char 둘다가능 (교육적차원에서 char 써봄)
	    
		// 처리
		name = "홍길동";  // 문자를 정의할때는 큰따옴표
		kor = 95;
		eng = 78;
		mat = 84;
		tot = kor + eng + mat;
		//avg = (kor + eng + mat) / 3 ;
		avg = tot / 3 ;
		
		grd = '가';
		// 결과 출력
		System.out.print("이름 : ");
		System.out.println(name);
		System.out.print("국어 : ");
		System.out.println(kor);
		System.out.print("영어 : ");
		System.out.println(eng);
		System.out.print("수학 : ");
		System.out.println(mat);
		System.out.print("총점 : ");
		System.out.println(tot);
		System.out.print("평균 : ");
		System.out.println(avg);
	}
}
