package 용현.basic.day05;

import java.util.Scanner;

public class Switches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// switch
		// 둘이상의 조건의 결과값에 따라 명령문을 선택적으로 실행하도록 작성하는 제어문
		// switch(상수) {
		//    case 상수 1: 실행문1; break;
		//    case 상수 2: 실행문2; break;
		//    case 상수 3: 실행문3; break;
		//    default: 실행문4;
		// }
		
		// 시간을 입력하면 시간을 의미하는 단어를 출력하는 프로그램
		// moring hours 아침시간 (7-12)
		// 등등등
		
		//변수선언
		int daytime;
		String result = "";                       // result 초기화하는방법  = ""12 을 추가한다
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시간을 입력하세요 ");
		daytime = sc.nextInt();
		
		//if (daytime >= 7 && daytime < 12)
		//	result = "morning hours";
		//else if (daytime >=12 && daytime < 1)
		//	result = "noon";
		// 등등등  ( 조건이 많은 경우 if else if는 다소 복잡해짐)
		
		switch(daytime) {                           // daytime 자리에 "x" 문자열은 옛날버전이나 c언어는 못쓴다
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
			result = "morning hours"; break;   //breakf를 쓰지않으면 코드가 밑으로 낙하할수있음  // 조건이 맞으면 break로 그코드를 끝낸다
		case 12:                               //조건이 여러개일 경우 case 를여러개를 쓴다
			result = "noon"; break;
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
			result = "afternnon hours"; break;
		case 18:
		case 19:
		case 20:
			result = "evening hours"; break;
		case 21:
		case 22:
		case 23:
			result = "night hours"; break;
		case 24:
			result = "midnight"; break;
		case 1:
		case 2:
		case 3:
		case 4:
			result = "early morning hours"; break;
		case 5:
		case 6 :
			result = "dawn"; break;
		
		}
		
		System.out.println(result);
		
		
		}

	}

