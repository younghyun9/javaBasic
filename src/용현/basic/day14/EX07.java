package 용현.basic.day14;

import java.util.Scanner;

public class EX07 {
    public static void main(String[] args) {
        // 두수를 입력받아 두사이의 모든값의 총합을 구하는 코드 작성
        // 가볍게 시작해서 살을 붙히는 식으로 코드 작성!

        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자는? ");
        int num1 = sc.nextInt();
        System.out.print("두번째 숫자는? ");
        int num2 = sc.nextInt();

        // num1 < num2 의 경우
        //        int sum = 0 ;          // sum 변수 선언
//        for(int i = num1; i <= num2; ++i)  // num1 < num2 의 경우
//            sum += i;
//
//        String fmt = "%d와 %d 사이의 합은 %d";
//        System.out.printf(fmt, num1, num2, sum);

        // num1 > num2  의 경우
//        int sum = 0 ;
//        for(int i = num2; i <= num2; ++i)
//            sum += i;
//        String fmt = "%d와 %d 사이의 합은 %d";
//        System.out.printf(fmt, num1, num2, sum);

        int begin = num1;
        int end = num2;
        if (num1 > num2){
            begin = num2; end = num1;
        }

        int sum = 0;
        for(int i = begin; i <= end; ++i)
            sum += i;
        String fmt = "%d와 %d 사이의 합은 %d";
        System.out.printf(fmt, num1, num2, sum);
        System.out.println("");

        // 가우스 덧셈을 이용하면 간단히 계산가능 (상위 코딩)
        // ( i + j ) * *(j - i + 1 ) / 2 // i < j
        sum = (num1 + num2) * (Math.abs(num2 - num1) + 1) / 2; // Math.abs () 절대값선언
        System.out.println(sum);

    }
}
