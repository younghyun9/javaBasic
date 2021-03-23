package 용현.basic.day06;

public class Breaks {
    public static void main(String[] args) {
        // 반복문 제어하기 break, continue
        // break : 반복문 실행을 중단하는 명령

        // ex) 1 ~ 100까지의 총합을 구하는 프로그램 작성 (단, 총합이 500을 넘는경우, 실행을 중단함)

        int sum = 0;
        int i;

        for (i = 0; i <= 100; ++i) {
            sum +=i;
            if(sum>=500) break;        // 부분합이 500이상인 경우 반복실행을 중지함
        }                               // 여기서 변수선언한 i는 특정구역에서만 선언한 지역변수 i 이다.
                                         // for문에서밖에 못쓴다   따라서 for문 밖에서 i를 선언하는게 좋다

        System.out.println("총합 : " + sum);
        System.out.println("중지지점 : " + i);

        // ex) 주사위의 눈이 6이 나올때까지 굴려보는 프로그램을 작성하세요.
        // 또한, 6이 나올때까지의 횟수도 같이 출력하세요
        // Math.random() 과 break문을사용 while문으로 반복

//        내가 끄적여본거
//        int[] dice = {1,2,3,4,5,6};
//
//        int idx = (int)(Math.random() * 6);
//        System.out.println("실행결과 " + dice[idx]);
//        for(i = 0; ){
//            (int)(Math.random() * 6);
//            if(dice =6) break;
//            System.out.println("총 주사위 굴린 횟수 : " + i);

        int dice = 0;
        int count = 0;

        while(true){
            dice = (int)(Math.random() * 6 ) + 1;
            ++count;
            System.out.print(dice + " ");
            if (dice == 6) break;

        }
        System.out.println("굴린 총 횟수 : " + count);
    }
}
