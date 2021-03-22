package 용현.basic.day5;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 아이디, 비밀번호 입력해서 로그인 성공여부를 출력하는 프로그램
		// 아이디 : abc123 , 비밀번호 : 987xyz
		// 1. 아이디 x , 비밀번호x - 로그인 실패!
		// 2. 아이디o , 비밀번호x - 비밀번호가 틀려요!
		// 3. 아이디x , 비밀번호o - 아이디가 틀려요!
		// 4. 아이디o , 비밀번호o - 로그인 성공!
		// => 입력값에 따른 결과처리가 복잡하므로 단순화시킴
		// 입력처리가 복잡해지면 코드도 복잡하게 짤수밖에 없음 
		// 즉, 1,2,3 => 로그인실패, 4 => 로그인성공
		
		// 변수선언
		String userid;
		String passwd;
		Scanner sc = new Scanner(System.in);
		String result;
	    // 처리 (아이디/비번 입력받아 비교
		System.out.print("아이디는?");
		userid = sc.next();
		
		System.out.print("비밀번호는?");
		passwd = sc.next();
		
		
		// 결과출력
		
		// 문자열 비교시 == 이 아님 equals 메서드를 사용할것 equals() <<
		
		//  if (userid .equals ("abc123") ) {                  //id를 올바르게 입력한 경우
		//	if (passwd .equals("987xyz"))
		//		result = "로그인성공!!";
		//   else 
		//	    result = "비밀번호가 틀려요!";
			
		// } else {                                  //id 를 올바르기 입력하지않은경우
		//	if (passwd .equals ("987xyz"))
		//		result = "아이디는 틀리고, 비밀번호는 맞아요!!";
	    //		else
		//		result = "아이디도 틀리고 비밀번호도 틀려요";
		// }
		
// 로그인성공여부를 4가지 경우에 따라작성 - 코드복잡
		
		//if (userid.equals("abc123")) {
		//	if (passwd.equals("987xyz"))
		//		result = "로그인성공!";
		//	else
		//		result = "로그인실패!";
		//}
			
		if (userid.equals("abc123") && passwd.equals("987xyz"))
				result = "로그인성공";
		else 
			result = "로그인 실패";
		
		//조건식들을 논시식으로 재작성 - 코드가 단순해짐 (현재버전이 3번쨰 버전) 최대한 코드를 간단하게 짜라
		
		// 결과 출력
		System.out.println(result);
	}
}

	
