package 용현.basic.day11;

import java.util.Scanner;

public class WraperClass {
    public static void main(String[] args) {
        /// wraper classs
        // 프로그램에 따라 기본자룡형의 데이터를 참조자료형으로 바꿔 취급해야할 때가 있음
        // 메서드의 매개변수가 객체형을 요구하면 그에 따라 객체형을 사용해야함
        // 기본자료형 변수를 참고자료형 변수로 변환하는 클래스를 래퍼클래스라함
        // int > Interger,  double >    Double
        // char > Character, boolean > Boolean

        int a = 123;
        Integer b = new Integer(a); // 박싱 : 기본자료형 변수를 참조자료형 변수로 변환

        System.out.println(a);
        System.out.println(b);
        // 박싱을 통해 클래스의 장점을 활용할 수 있는 변수로 변환함

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 하나 입력하세요");
        int number = Integer.parseInt(sc.next());

        int c = b.intValue();       //언박싱 : 참조 자료형 변수를 기본자료형 변수로 변환

        Integer d = 456;          // new Integer 사용안함
        // 자동 박싱 적용
        int e = d;                // intValue 사용안함
        // 자동 언박싱 적용

        // 10진수를 2진수로 변환하기
        // 4 ->100
        System.out.println(Integer.toBinaryString(4));

        // 두 수를 비교해서 큰지 작은지 같은지를 출력
        // compareTo(수1, 수2)
        // 결과 : 1, 0 , -1 (크다 같다 작다)

        System.out.println( b.compareTo(d) );   // b가 d보다 작다

        System.out.println( Integer.compare(b, d));

    }
}
