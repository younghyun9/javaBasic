package 용현.basic.day5;

import java.util.Random;

public class Arrays {

	public static void main(String[] args) {
		// 배열
		// 같은 종류의 여러개의 데이터를 저장하는 자료형
		// 배열 생성시몇개의 요소를 저장할 것인지를지정해야함
		// 배열을 구성하는 각 요소라 하고 해당 요소의 위치는 index라는  숫자값으로 지정
		// 배열의 index는 0부터 시작함
        // 1차원, 2차원, 3차원 배열까지 생성 가능
		// 자료형[] 배열변수명; or 자료형 배열변수명[];              << 선언방법 //2개중 첫번째 방법을 추천
		
		// 초기화
		// 배열변수 = new 자료형[갯수];
		
		// 회원 정보(uid,pwd,age)를 지정하는 배열 생성
		String[] uid;
		String[] pwd;
		int[] age;
		
		uid = new String[3];     // 3명분의 아이디를 저장할수 있는는 배열변수 생성
		pwd = new String[3];     // new : 참조형 객체를 생성하라는 의미의 연산자
		age = new int[3];        // 기본 자료형 객체는 변수에 실제 값을
		                         // 참조자료형 객체는 변수에 그값에서 대한 위치값이 저장딤
		                         // 따라서, 실제값을 알아내려면 위치값 + 변위를적용해야함
		
		//System.out.println(uid);            // 이 3개를 코딩하면 이상한 주소가뜸
		//System.out.println(pwd); 
		//System.out.println(age);
		// 참조형 변수를 출력하면 그 변수값이 저장된 곳의 시작번지가 출력됨
		
		// JVM의 메모리구조
		// 스택 : 일반적인 변수가 선언될때 사용하는 공간 // 기본자료형/ 참조자료형 변수들이 주로사용
		// 힙: 객체형 자료(인스턴스)가 저장되는 공간
		//     즉, 프로그램에서 new 연산자를 사용하여 객체가 만들어지면 해당 객체의 정보를 여기에 저장
		//     저장된 객체의 위치값은 스택의 생성된 변수에 저장
		
		// 배열의 요소 다루기
		// 배열명[인덱스] = 값;        // 배열의 특정요소에  값 저장
		uid[0] = "abc123";
		uid[1] = "abc987";
		uid[2] = "abc456";
		
		
		// 배열의 요소를 출력하려면 배열명[인덱스] 형태로 사용
		// 배열의 요소를 다룰때는 반복문을 사용할 것!
		//System.out.println(uid[0]);
		//System.out.println(uid[1]);
		//System.out.println(uid[2]);
		for(int i = 0; i < 3; ++i) {
			System.out.println(uid[i]);                   // 반복문을 사용한 최종본
			
		}
		// 1~45 사이 임의읭 숫자 6개를 출력하는 프로그램 작성
		// 임의의 숫자를 생성 : 난수random
		// Random 클래스를 이용하면 원하는 형태의 난수 생성 가능
		int[] lotto = new int[6];
		Random rnd = new Random();         //난수표를 이용해서 난수 생성
		
		lotto[0] = rnd.nextInt(45) + 1;                              //nextInt(경계) : 0 ~ 경계 -1 범위의 난수생성
		lotto[1] = rnd.nextInt(45) + 1;                              //nextInt(45) => 0 ~ 44
		lotto[2] = rnd.nextInt(45) + 1;
		lotto[3] = rnd.nextInt(45) + 1;
		lotto[4] = rnd.nextInt(45) + 1;
		lotto[5] = rnd.nextInt(45) + 1;
		
		for(int i = 0; i < 6; ++i ) {
		System.out.println(lotto[i]);
	
	
	}

 }
}