package 용현.basic.day04;

public class Looop {
	public static void main(String[] args) {
		// while문 : 특정조건을 만족할때까지 계속해서 주어진 명령을 수행 
		// 초기식 
		// while(조건식) {
		//      반복코드
		//      증감식
		// }                     // for문과 비슷 // 대신 조건식 반복코드 증감식을 각각 한줄에 
		
		// 조건식이 처음부터 false면 while은 코드를 반복실행하지 않음 
		// 반면, do-while문은 일단 코드를 먼저 실행하고 조건을 검사하기 때문에 조건식이 false라도 최소 한번정도는 코드를 실행할 수 있음
		
		// ex)  1 ~ 10까지 정수출력
		int i;
		i = 1;
		while(i <=10) {                 //조건이 참이면 반복실행 
			System.out.print(i + " ");  // i를 반복코드로 실행하고 조건식을 적음으로써 i가 몇까지 반복되는지 알려줌
			i = i + 1 ;                  // 이 마지막줄이 있냐없냐에따라 실행양상이다름  (증감식) // i+= 1 ; 로도 표현 가능
		
	    System.out.println("");   // 줄바꿈용 코드
			// ex) 1 ~ 50사이 홀수출력          //위에 식에서 내려와서 11인 상태에서 다음식이 진행되기떄문에 변수값을 다시 초기해야함
		i = 1;
		while(i <=50) {                               //  
			System.out.print(i + " ");
			i = i +2;              // i += 2; 로표현가능
			
		}
			
			
			
		System.out.println("");   // 줄바꿈용 코드	
		// ex) 1 ~ 50사이 짝수출력
		
		i = 2;                 //다시 초기화
		while(i <=50) {
			System.out.print(i + " ");
			i = i + 2;               // i += 2; 로표현가능
		}
		
		System.out.println("");   // 줄바꿈용 코드
			
	    
			
			
			
		// ex) 1 ~ 100사이 총합 구해서 출력
		int sum = 0 ;
		i =1 ;
		while(i <= 100) {
			sum = sum + i ;    //sum += i; 로 표현 가능
			++i;
			System.out.println("");
			
			
			
	   // 가우스 덧셈공식을 이용하면 특정범위내의 모든수의 합을 편리하게 구할 수 있음
	   // 총합: sum , 시작범위 : i, 끝범위 : j	
	   //		sum = (i+j) * j / 2               변수설정을하고 식을 만드는 능력을 키워야함
	   // sum = i * (j + 1) / 2
			
			i = 1;
			int j = 100;
			sum = (i + j ) * j / 2;
			System.out.println(sum);
			
			//ex ) 1 ~ 99사이 총합 구해서 출력
			// 단 가우스 덧셈공식을 이용하세여
			
			i = 1;
			j = 100;
			sum = ((i + j ) * j / 2 )- 100;
			System.out.println(sum);
			
		
		
		}
	  }	
   }		
}
