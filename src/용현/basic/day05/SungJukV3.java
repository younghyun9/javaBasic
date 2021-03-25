package 용현.basic.day05;

import java.util.Scanner;
public class SungJukV3 {

	public static void main(String[] args) {
		
		// 성적처리 프로그램을 체계적으로 만들려고함
		// 객체지향 기법을 토대로 CRUD기능을 제공하도록 작성
		// 즉, 성적데이터를 입력/조회/수정/삭제 메뉴를 제공해서 프로그램의 사용성을 높임
		
		
		Scanner sc = new Scanner(System.in);
		String menu = "";
		// System.out.print("작업을 선택하세요 : " );                      // 뭘입력해야 할지 기능안내가없음
		// System.out.print("작업을 선택하세요: (1,2,3,4,5) ");            //뭘 입력해야될지알지만 여전히 입력시 어떤기능이 실행되는지 알수없음
		while(true) {
		String displaymenu = 
				"----------------------  \n" +
				"   성적 프로그램 v3     \n" +
				"----------------------  \n" +
				"  1. 성적 데이터 입력    \n" +
			    "  2. 성적 데이터 조회    \n " +
				" 3. 성적 데이터 상세조회\n " +
				" 4. 성적 데이터 수정    \n " +
				" 5. 성적 데이터 삭제    \n " +
				" 0. 프로그램 종료       \n " +
				"----------------------  \n" +
				" 작업을 선택하세요 :" ;
		
		System.out.println(displaymenu);
		menu = sc.next();
		switch(menu) {              // JDK 7부터는 switch문에 문자형 사용가능
		case "1" : System.out.println("성적데이터 입력"); break;
		case "2" : System.out.println("성적데이터 조회"); break;
		case "3" : System.out.println("성적데이터 상세조회"); break;
		case "4" : System.out.println("성적데이터 수정"); break;
		case "5" : System.out.println("성적데이터 삭제"); break;
		case "0" : System.exit(0); break;           // 프로그램 종료 명령어: System.exit(0);
		default: System.out.println("잘못입력!!");
		
		} //switch문
	} // while문
 } // 메인

}


