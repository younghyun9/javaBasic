package 용현.basic.day14;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto645V2 {
    public static void main(String[] args) {
        // 로또 645 프로그램 만들기
        // set을 이용해서 1~45 사이 임의의 6개의 숫자 생성
        // 중복은 허용하지 않음
        // Random - nextInt, While
        //Random rnd = new Random();  // 밖에다 놓으면 예전 난수랑 섞일수 있음!


//        for (int i = 1; i <= 6; ++i) {
//            int key = rnd.nextInt(45) + 1; // +1을 더해야 45까지 나옴
//            System.out.print(key + " ");
//        } // 중복이 발생하기떄문에 set함수로 다시 만듬

        //Set<Integer> lotto = new HashSet<>();

//        for (int i = 1; i <= 6; ++i) {
//            int key = rnd.nextInt(45) + 1; // 난수 설정
//            lotto.add(key);  // 6개 저장
//
//            for (Integer k : lotto)
//                System.out.print(k + " ");
//        } // 중복 한번 발생시 lotto변수의 갯수가 하나씩 줄어듬 (중복발생시 6개가 안나올수있음)

        Set<Integer> lotto = new HashSet<>();
        while (lotto.size() < 6) {
            Random rnd = new Random();    // 밖에다 두지 말고 코드 안에다 놓고 돌리기
            int key = rnd.nextInt(45) + 1;
            lotto.add(key);
        } // 중복값이 나오지 않을때까지 뽑기를 계속 무한 반복
          // 복원추출 - 한번 뽑은 것을 다시 뽑을 수 있음

        for(Integer k : lotto)
            System.out.print(k + " ");
    }
}

