package 용현.basic.day03;

public class TestCast {
	public static void main(String [] args) {
		// 자바의 JVM은 기본적으로 32비트단위로 처리함
		byte x = 1;      // byte 자료형은 8비트 크기
		byte y = 2;      
		byte z = (byte)(x + y) ;    // byte형 변수 연산시 자동으로 int로 변환
		// 따라서, 결과물 byte로 저장하려면
		// int를 byte로 변환하는 과정필요 앞에 수식을 >> (바꾸고싶은연산자) (수식) 으로 변경
		
		// 성적처리시 적절하게 평균계산하기
		
		int kor = 98;
		int eng = 78;
		int mat = 45;
		//double avg = (kor+eng+mat) / 3.0 ;
		double avg = (double)(kor+eng+mat) / 3 ;
		
		String fmt = "평균은 %.2f 입니다";   // &f 사이에 .1 을넣으면 소수점 첫쨰자리까지 나옴
		System.out.printf(fmt, avg);
		// System.out.println("평균은 " + avg + " 입니다");
		
		
	}

}
