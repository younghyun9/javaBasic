package 용현.basic.day07;

public class SungJukV4 {
    public static void main(String[] args) {
        SungJuk sj = new SungJuk("혜교", 99, 98, 99);    // 마지막 전단계 (입력)

        sj.computeSunJuk(); // 성적처리 (마지막에 작성)

        System.out.println(sj.toString());

    }

    // 성적 클래스
    // 클래스는 속성과 기능으로 구성 (?!?)
    static class SungJuk {
        //맴버변수
        private String name;
        private int kor;
        private int eng;
        private int mat;
        private int tot;
        private double avg;
        private char grd;

        // 생성자
        public SungJuk(String name, int kor, int eng, int mat) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.mat = mat;                                        // 생성 (alt + enter)을 이용해서 손쉽게 가능
        }

        // 성적처리
        public void computeSunJuk() {
            tot = kor + eng + mat;
            avg = (double) tot / 3;
            switch ((int) avg / 10) {
                case 10: case 9: grd = '수';break;
                case 8: grd = '우'; break;
                case 7: grd = '미'; break;
                case 6: grd = '양'; break;
                default: grd = '가'; break;
            }

        }

        // 결과 출력

        @Override
        public String toString() {
            return "SungJuk{name= " + name + ", kor=" + kor +
                    ", eng=" + eng + ", mat=" + mat +
                    ", tot=" + tot + ", avg=" + avg +
                    ", grd=" + grd + '}';                 // 알트 엔터 tostring으로 결과출력
        }
    }
}

