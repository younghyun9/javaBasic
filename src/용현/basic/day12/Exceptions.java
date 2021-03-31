package 용현.basic.day12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) throws IOException {               // 예외 떠넘기기로 메인메서드에 throws IOException 내용이 추가됨   (메인에 옮겼을때 jvm에 떠넘기기떄문에 안좋음)
        // 예외 exceptions와 오류 error
        // 자바 프로그램 작성시 문법에 맞지않게 코드를 작성하면
        // 컴파일 오류가 발생함
        // 또한, 코드가 제대로 작성되었다 해도
        // 실행중에 예상치 못한 상황으로 인해 오류가 발생할 수 있음

        // 이처럼 프로그램 실행중에 예상치 못한 상황으로
        // 프로그램의 실행에 영향을 주는것을
        // 예외와 오류로 구분할 수 있음

        // 오류는 시스템단계에서 심각한 문제를 야기해서 실행중인 프로그램을 강제로 종료시킴
        // ex)  네트워크 서버 중단, 메모리/자원 고갈
        // 이러한 오류는 개발자가 코드로 처리할 수 없음

        // 예외는 오류와 마찬가지로실행중인 프로그램을 강제종료시키지만, 발생할 수 있는 상황을 미리
        // 예측해서 코드로 예방할 수 있음
        // 예) 파일경로 잘못 지정, 데이터값 잘못 입력

        // 개발자는 예외처리를 통해 예외상황을 처리할 수 있도록
        // 예외처리 코드를 작성할 수 있어야함

        // 예외처리 전 (1)
        System.out.println("프로그램 시작1");
        System.out.println("프로그램 끝1");

        // 예외처리 전 (2)
        System.out.println("프로그램 시작2");
        int a = 10, b = 25;
        int c = a + b;
        System.out.println(c);
        System.out.println("프로그램 끝2");

        // 예외처리전 (3)
//        System.out.println("프로그램 시작3");
//
//        int d = 10, e = 0;
//        int f = d / e;          // <- 오류발생!
//        // 오류발생으로 인해 이후 문장은 실행되지 않음
//        System.out.println(f);
//        System.out.println("프로그램 끝3");

        // 예외처리 구문
        // 자바에서는 예외를 처리하기 위해
        // try - catch - finally 구문을사용함
        // try {
        //       예외가 발생할만 코드들
        // } catch (예측한 예외상황1) {
        //   예외발생시 실행할 코드
        // } catch (예측한 예외상황2){
        //   예외발생시 실행할 코드
        // }

        // 예외처리 1
        System.out.println("프로그램 시작4");

        try {
            int g = 10, i = 0;
            int j = g / i;            // <- 오류발생!
            System.out.println(j);    // 이 코드는 실행안됨 ;;
        } catch (Exception ex) {
            // 예외상황을 명확하게 지정하지 않음
            ex.printStackTrace();
        }
        System.out.println("프로그램 끝4");

        // ex) 1~ 9 사이 정수만 입력받아
        // 화면에 출력하는 프로그램 작성
        // 정수가 아닌 다른문자 입력시
        // "잘못입력하셨습니다"라고 출력함
        // 예외처리를 이용해서 코드를 작성합니다.

//        int i = 0;                       // 내가 끄적여본거
//        Scanner sc = new Scanner(System.in);
//        System.out.print("정수를 입력하세요");
//
//        if (i<10)
//            System.out.println(sc.nextInt(i));

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("1~9사이 정수를 입력하세요");               // 이 3줄코드에서 오류가 발생했다고 판단
            int num = sc.nextInt();                                        // try {} 안에 넣고
            System.out.println(num);                                       // 3줄 밑에 캐치문 + 출력값 추가
        } catch (Exception ex){
            System.out.println("잘못입력하셨습니다!! ");
            ex.printStackTrace();                                 // 오류사항 확인하기 (넣지않으면 무슨오류인지 안뜸)
        }

        // 예외의 종류
        // checked exception과 unchecked exception
        // 실행예외 unchecked exception
        // 명시적인 예외처리를 강제하지 않음 예외발생 시점은 실행할때 runtime임
        // ArrayIndexOutOfBoundsException
        // InputMismatchException

        // 일반예외 : check exception
        // 명시적인 예외처리를 반드시 강제함 (!!)
        // 예외 발생 시점은 컴파일할때 compile time임
        // IOException
        // ClassNotFoundException


        // ex) 임의의 성적데이터(이름,국어,영어,수학)를 입력받아
        // c:/java/sunkjuk.txt에 저장하는 프로그램 작성
        String sjdata = "혜교 98 45 23 ";
        String fpath = "c:/Java/sungjuk.txt";

        try{
            FileWriter fw = new FileWriter(fpath);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(sjdata);
            bw.close();
            fw.close();;
        }catch(IOException e) {
            e.printStackTrace();
        }

        // 예외처리 회피/양도/ 떠넘기기
        // 메서드 선언부에 throws를 사용해서
        // 해당 메서드에서 발생한 예외를 미리 명시하고
        // 메서드를 호출한 상위메서드에서 이것을 처리할 수 있도록 함
        // 이를 통해서 각 하위 메서드들에서 발생하는 예외들을
        // 한 곳에서 모아서 처리할 수 있음
        // 또한, 메서드에 try-catch문을 사용하지 않아도 된다는 장점이 있음
        fpath = "c:/abc123/sungjuk.txt";
        FileWriter fw = new FileWriter(fpath);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(sjdata);
        bw.close();
        fw.close();




    } //main
} // class
