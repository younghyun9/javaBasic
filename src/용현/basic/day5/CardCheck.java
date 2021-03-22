package 용현.basic.day5;

import java.util.Scanner;

public class CardCheck {

	public static void main(String[] args) {
		// 신용카드 번호의 첫글자를 보고 어떤 종류와 은행인지 알려주는 프로그램
		// 3: JCB카드
		// 4: Visa카드
		// 5: Master카드 
		
		String cardnum;
		String cardtype = "";
		String cardbank= "";
		String fmt = "카드종류는 %s이고요, %s입니다";
		Scanner sc = new Scanner(System.in);
		String result;
		
		System.out.println("카드번호를 입력하세요 ");
		cardnum = sc.next();
		
		//if (cardnum.charAt(0) == '3')
			//cardtype = "JCB카드";
		//else if (cardnum.charAt(0) == '4')
			//cardtype = "Visa";
		//else if (cardnum.charAt(0) == '5')
		//	cardtype = "Master";                  //if else문 보다 switch문이 더 어울림ㅡ
		
		switch(cardnum.charAt(0)) {
		case '3' : cardtype = "JCB 카드"; break;
		case '4' : cardtype = "Visa 카드"; break;
		case '5' : cardtype = "Master 카드"; break;
		}
		// 스위치문
		//System.out.println(cardtype);
		
		switch(cardnum) {
		case "356317" : cardbank = "NH농협카드"; break;
		case "356901" : cardbank = "신한카드"; break;
		case "356912" : cardbank = "KB국민카드"; break;
		case "404825" : cardbank = "비씨카드"; break;
		case "438676" : cardbank = "신한카드"; break;
		case "457973" : cardbank = "국민카드"; break;
		case "515594" : cardbank = "신한카드"; break;
		case "524353" : cardbank = "외환카드"; break;
		case "540926" : cardbank = "국민카드"; break;
		} //스위치
		
		System.out.printf(fmt, cardtype, cardbank);
	} // 메인

}
