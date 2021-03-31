package 용현.basic.day11;

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

    }
}
