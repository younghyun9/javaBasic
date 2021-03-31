package 용현.basic.day11;

import java.util.Scanner;

public class q14_q25 {
    public static void main(String[] args) {
        //  Q14번 문제 (학생버전)
        //하루는 86400초이다. 입력값이 1234567890일 경우 며칠인지 계산하여라
        //한 시간은 3600초이다. 입력값이 98765일 경우 몇 시간인지 계산하여라
        //일 분은 60초이다. 입력값이 12345일 경우 몇 분인지 계산하여라.

        int d = 1234567890;
        System.out.println( Math.ceil((double) d / 86400 )+ "일입니다");
        int h = 98765;
        System.out.println( Math.floor((double) h / 3600 ) + "시간입니다");
        int m = 12345;
        System.out.println( Math.floor((double) m / 60) + "분입니다");

        // 선생님 추가문제
        //Q- 두수를 입력받아 두 수 사이의 모든 값의 총합을 구하는 코드를 작성하세요 (3.31)
        //ex) 10 3     => 3,4,5,6,7,8,9,10 의  총합
        //ex) 3,10     => 3,4,5,6,7,8,9,10 의  총합

        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        int sum =0 ;
        System.out.println("첫번쨰 숫자는? ");
        x = sc.nextInt();

        System.out.println("두번째 숫자는?");
        y = sc.nextInt();
        if(x>y)
        {
            int sub = x;
            x=y;
            y=sub;
        }

        for(int i = x; i<=y ; i=i+1)
        {
            sum=sum+i;
        }
        System.out.println();
        System.out.println("두 수"+x+"~"+y+" 사이의 합은");
        System.out.println(sum+"입니다");
    }
}

