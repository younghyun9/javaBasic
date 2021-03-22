package 용현.basic.day5;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// 윤년 계산기 내가 끄적여본거
		while(true) {
		System.out.println("연도를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		switch(year%4) {
		case 0 : System.out.println("윤년입니다"); break;
		case 1 : System.out.println("평년입니다"); break;
		case 2 : System.out.println("평년입니다"); break;
		case 3 : System.out.println("평년입니다"); break;
		case 4 : System.out.println("윤년입니다"); break;
		case 'x' : System.exit(0); break;  
		default: System.out.println("잘못입력!!"); 
		}
	  }
	}

}
