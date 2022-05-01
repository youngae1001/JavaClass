import java.util.Scanner;

public class JavaDay6_1 {	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
//		// 문제1. Scanner를 이용해서 아래와 같이 입출력 하여 사칙연산을 수행해주세요.
//		// 입출력 예시
//		// 첫번째 숫자를 입력해주세요: 12
//		// 두번째 숫자를 입력해주세요: 33
//		// 12 + 33 = 45
//				
//		System.out.printf("첫번째 숫자를 입력해주세요 : ");
//		int num1 = Integer.parseInt(scan.nextLine());
//		
//		System.out.printf("두번째 숫자를 입력해주세요 : ");
//		int num2 = Integer.parseInt(scan.nextLine());
//		
//		System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
//		
//		System.out.println();
//		
		
//		// 문제2. 이름과 나이를 입력값으로 받아 자기소개를 해주세요.
//		System.out.println("이름을 입력해주세요:");
//		String name = scan.nextLine();
//		
//	    System.out.println("나이를 입력해주세요:");
//	    int age = Integer.parseInt(scan.nextLine());
//	    
//	    System.out.printf("안녕하세요 %d세 %s입니다.", age, name);
//	    
//	    // 이름을 입력해주세요 : 홍길동
//	    // 나이를 입력해주세요 : 29
//	    // 출력 : 안녕하세요 29세 홍길동입니다.
	    
	    
	    // 문제3. Scanner를 이용해 입력값을 받아
	    // 구구단을 원하는 단이 나오게 해주세요.

	    //예시) 원하는 단을 입력해주세요 : 4 (입력후 엔터)
		// 4단 출력.
	    
//		System.out.print("원하는 단을 입력해주세요 : ");
//	    int dan = Integer.parseInt(scan.nextLine());
//	    
//	    for(int i=1; i<10; i++) {
//	    	System.out.printf("%d X %d = %d\n", dan, i, dan*i);
//	    }

	    // 반복 조건을 없애면 무한반복 - for(int i=0; ; i++){}
	    
	    // 반복문을 중간에 종료하는 방법 -> break;
	    // break => 반복문 강제 종료
	    
		System.out.println("구구단 프로그램을 시작합니다.");		
	    for(int i = 0; ; i++) {
	    	System.out.print("원하는 단을 입력해주세요(0을 입력하면 종료됩니다) : ");
		    int dan = Integer.parseInt(scan.nextLine());
		    
		    if(dan == 0) {
		    	System.out.println("구구단 프로그램을 종료합니다.");
		    	break;
		    }
		    
		    for(int j=1; j<10; j++) {
		    	System.out.printf("%d X %d = %d\n", dan, j, dan*j);
		    }
	    }
	    
	    
	    
	    
	    
	}

}
