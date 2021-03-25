package 용현.basic.day07;

import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
//        // 생년월일을 입력받아 나이 계산
//        // 현재연도 - 생년연도
//        // 생일이 지났을경우 -> 그대로 사용
//        // 생일이 지나지 않았을경우 -> (-1)
//        int byear, bmonth, bday;   // 생년월일
//        int cyear, cmonth, cday;   // 현재년월일
//        Scanner sc = new Scanner(System.in);
//        String fmt = "현재 : %d년 %d월 %d일 \n" +
//                     "생일 : %d년 %d월 %d일 \n" +
//                     "나이 : %d세 ";
//
//        // 현재년월일 설정 (수동)
//        cyear = 2021;
//        cmonth = 3;
//        cday = 24;
//
//        //생년월일 입력받음
//        System.out.print("생일의 년도는?");
//        byear = sc.nextInt();
//        System.out.print("생일의 월은?");
//        bmonth = sc.nextInt();
//        System.out.print("생일의 일은?");
//        bday = sc.nextInt();
//
//        // 나이 계산
//        int age = cyear - byear;  // 현재년도 - 생일년도
//        if(cmonth >= bmonth && cday >= bday)       // 생일 지남 여부 확인
//            age = age  ;
//        else
//            age = age - 1 ;
//
//        System.out.printf(fmt, cyear, cmonth, cday, byear, bmonth, bday, age);

        computeAge();

        // 잔돈 계산하는 프로그램
        // 지불 요구금액 : 54320원
        // 지불액 : 100000원
        // 잔돈 : 45680원

        System.out.println("");

//        int price, pay, change;
//        int w50000, w10000, w5000, w1000, w500, w100, w50, w10;   // 각각의 변수 선언
//        String fmt = "사용요금은 %d, 지불액은 %d 일때, 잔돈은 %d 입니다 \n" +
//                     "50000원권은 %d 장, 10000원권은 %d 장, \n" +
//                     "5000원권은 %d 장, 1000원권은 %d 장, \n" +
//                     "500원은 %d 개, 100원은 %d 개, \n" +
//                     "50원은 %d 개, 10원은 %d 개입니다";
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("사용요금은? ");
//        price =sc.nextInt();
//        System.out.print("지불액은? ");
//        pay = sc.nextInt();
//
//        // 잔돈 계산
//        change = pay - price;
//
//        w50000 = change / 50000;
//        //change = change - (50000 * w50000);
//        change = change % 50000;               //위의 식을 간편하게 만든것
//
//        w10000 = change / 10000;
//        //change = change - (10000 * w10000);
//        change = change % 10000;               // 위의 주석을 간편하게 만든것 (곱하기해서 빼는것보다 나머지 연산자를 사용! )
//
//        w5000 = change / 5000;
//        //change = change - (5000 * w5000);
//        change = change % 5000;
//
//        w1000 = change / 1000;
//        //change = change - (1000 * w1000);
//        change = change % 1000;
//
//        w500 = change / 500;
//        //change = change - (500 * w500);
//        change = change % 500;
//
//        w100 = change / 100;
//        //change = change - (100 * w100);
//        change = change % 100;
//
//        w50 = change / 50;
//        //change = change - (50 * w50);
//        change = change % 50;
//
//        w10 = change / 10;
//
//        System.out.printf(fmt, price, pay, (pay-price), w50000, w10000, w5000, w1000, w500, w100, w50, w10);
//
//
//
        computeChange();
    }

        public static void computeAge () {
            int byear, bmonth, bday;   // 생년월일
            int cyear, cmonth, cday;   // 현재년월일
            Scanner sc = new Scanner(System.in);
            String fmt = "현재 : %d년 %d월 %d일 \n" +
                    "생일 : %d년 %d월 %d일 \n" +
                    "나이 : %d세 ";


            cyear = 2021;
            cmonth = 3;
            cday = 24;

            //생년월일 입력받음
            System.out.print("생일의 년도는?");
            byear = sc.nextInt();
            System.out.print("생일의 월은?");
            bmonth = sc.nextInt();
            System.out.print("생일의 일은?");
            bday = sc.nextInt();

            // 나이 계산
            int age = cyear - byear;  // 현재년도 - 생일년도
            if (cmonth >= bmonth && cday >= bday)       // 생일 지남 여부 확인
                age = age;
            else
                age = age - 1;

            System.out.printf(fmt, cyear, cmonth, cday, byear, bmonth, bday, age);


        }             // 위에 내용을 주석처리하고 보기 좋게 바꿈

        public static void computeChange () {
            int price, pay, change;
            int[] wons = new int[8];
            int[] notes = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
            String fmt = "사용요금은 %d, 지불액은 %d 일때, 잔돈은 %d 입니다 \n" +
                    "50000원권은 %d 장, 10000원권은 %d 장, \n" +
                    "5000원권은 %d 장, 1000원권은 %d 장, \n" +
                    "500원은 %d 개, 100원은 %d 개, \n" +
                    "50원은 %d 개, 10원은 %d 개입니다";

            Scanner sc = new Scanner(System.in);

            System.out.print("사용요금은? ");
            price = sc.nextInt();
            System.out.print("지불액은? ");
            pay = sc.nextInt();

            change = pay - price;

            for (int i = 0; i < wons.length; i++) {
                wons[i] = change / notes[i];
                change = change % notes[i];
            }


            System.out.printf(fmt, price, pay, (pay - price),
                    wons[0], wons[1], wons[2], wons[3], wons[4], wons[5], wons[6], wons[7]);

        }
}