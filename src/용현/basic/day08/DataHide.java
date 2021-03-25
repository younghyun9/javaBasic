package 용현.basic.day08;

import 용현.basic.day07.B;              // day7 패키지에서 b클래스를 가져와

public class DataHide {
    public static void main(String[] args) {
        // 캡슐화 capsulation
        // 사용자가 굳이 알필요가 없는 정보는 사용자로부터 숨겨야 한다는 개념
        // 최소한의 정보만으로 프로그램을 쉽게 이해하고 사용할 수 있음

        // 접근 지정자
        // 클래스와 멤버변수, 메서드 선언시 정보은닉 정도를 부여할 수 있음

        // 자바의 4가지 접근 지정자
        // private > default > protected > public

        A one = new A();               // 동일 패키지내 클래스
        System.out.println(one.c);   //public 변수는 잘나옴
        System.out.println(one.a);   //default 변수도 잘나옴
        // System.out.println(one.b);   // private 변수는 안나옴 밑에 선언한 class함수에서만 사용할수 있음!

        B two = new B();             //B가 다른 패키지에 있기떄문에 위에 import 문을 추가해야함
        //System.out.println(two.d);   // default는 다른패키지에 있는것은 가져올수없음!
        //System.out.println(two.e);   // private
        System.out.println(two.f);   // public은 어디서나 가져올수있음음
    } // main
} // class

class A{
    int a;                 // default 접근지정  // 앞에아무것도 안쓰면 default 접근지정임!
    private int b;         // private 접근지정    // 동일클래스내에서만 사용가능!
    public int c;          // public 접근지정
}
