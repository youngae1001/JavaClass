
public class JavaDay4_3 {
	
	public static void gugu2() {
		int dan2=2;
		for(int i=1; i<10; i++) {
			System.out.printf("%d X %d = %d\n", dan2, i, dan2*i);
		}
		System.out.println();
	}
	
	public static void gugu3() {
		int dan3=3;
		for(int i=1; i<10; i++) {
			System.out.printf("%d X %d = %d\n", dan3, i, dan3*i);
		}
		System.out.println();
	}
	
	public static void gugu(int dan) { // 매개변수를 포함한 함수
		for(int i=1; i<10; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, dan*i);
		}
		System.out.println();
	}
	
	public static void gugu2(int dan, int gob) { // 매개변수 여러개를 포함한 함수
		for(int i=1; i<=gob; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, dan*i);
		}
		System.out.println();
	}
	
	public static void print(int num) {
		System.out.println(num);
	}
	
	public static void introduce() {
		for(int i=0; i<10; i++) {
			System.out.println("안녕하세요. 저는 20살 홍길동입니다.!");
		}
	}
	
	public static void introduce(int many) {
		for(int i=0; i<many; i++) {
			System.out.println("안녕하세요. 저는 20살 홍길동입니다.!");
		}
	}
	
	public static void greeting1(int what) {
		if(what == 1) {
			System.out.println("안녕하세요");
		}
		if(what == 2) {
			System.out.println("하이~");
		}
		if(what == 3) {
			System.out.println("봉쥬");
		}
	}
	
	public static void greeting2(int what, int many) {
		for(int i=0; i<many; i++) {			
			if(what == 1) {
				System.out.println("안녕하세요");
			}
			if(what == 2) {
				System.out.println("하이~");
			}
			if(what == 3) {
				System.out.println("봉쥬");
			}
		}
	}

	public static void main(String[] args) {
		
		// 구구단
		gugu2();
		gugu3();
		
		gugu(5); // 얘가 있으면 위의 gugu2(), gugu3() 함수가 필요없음
		gugu2(2,5);
		
		
		// ===========================================================
		
		// 문제1. 다음 코드가 의도대로 출력되도록 함수를 만드시오
		
		System.out.println("문제1");
		print(4); // 출력: 4
	    print(10); // 출력: 10
	    print(100); // 출력: 100
	    
	    System.out.println();
	    
	    
	    // 문제2. 다음 코드가 의도대로 출력되도록 함수를 만드시오
	    
	    System.out.println("문제2");
	    introduce();
	    // 안녕하세요. 저는 20살 홍길동입니다.!
	    // 안녕하세요. 저는 20살 홍길동입니다.!
	    // 안녕하세요. 저는 20살 홍길동입니다.!
	    // 안녕하세요. 저는 20살 홍길동입니다.!
	    // 안녕하세요. 저는 20살 홍길동입니다.!
	    // 안녕하세요. 저는 20살 홍길동입니다.!
	    // 안녕하세요. 저는 20살 홍길동입니다.!
	    // 안녕하세요. 저는 20살 홍길동입니다.!
	    // 안녕하세요. 저는 20살 홍길동입니다.!
	    // 안녕하세요. 저는 20살 홍길동입니다.!
	    
	    System.out.println();
	    
	    
	    // 문제3. 다음 코드가 의도대로 출력되도록 함수를 만드시오
	    
	    System.out.println("문제3");
	    
	    introduce(3);

	    // 안녕하세요. 20살 홍길동입니다.!
	    // 안녕하세요. 20살 홍길동입니다.!
	    // 안녕하세요. 20살 홍길동입니다.!
	    
	    System.out.println();

	    introduce(5);
	    // 안녕하세요. 20살 홍길동입니다.!
	    // 안녕하세요. 20살 홍길동입니다.!
	    // 안녕하세요. 20살 홍길동입니다.!
	    // 안녕하세요. 20살 홍길동입니다.!
	    // 안녕하세요. 20살 홍길동입니다.!
	    
	    System.out.println();

	    introduce(10);
	    // 안녕하세요. 20살 홍길동입니다.!
	    // 안녕하세요. 20살 홍길동입니다.!
	    // 안녕하세요. 20살 홍길동입니다.!
	    // 안녕하세요. 20살 홍길동입니다.!
	    // 안녕하세요. 20살 홍길동입니다.!
	    // 안녕하세요. 20살 홍길동입니다.!
	    // 안녕하세요. 20살 홍길동입니다.!
	    // 안녕하세요. 20살 홍길동입니다.!
	    // 안녕하세요. 20살 홍길동입니다.!
	    // 안녕하세요. 20살 홍길동입니다.!
	    
	    System.out.println();
	    
	    // 문제4. 다음 코드가 의도대로 출력되도록 함수를 만드시오
	    
	    System.out.println("문제4");
	    greeting1(2);
	    // 하이~

	    greeting1(3);
	    // 봉쥬

	    greeting1(1);
	    // 안녕하세요
	    
	    System.out.println();

	    greeting2(1, 3); 
	    // 안녕하세요
	    // 안녕하세요
	    // 안녕하세요

	    greeting2(2, 5); 
	    // 하이~
	    // 하이~
	    // 하이~
	    // 하이~
	    // 하이~

	    greeting2(3, 7); 
	    // 봉쥬
	    // 봉쥬
	    // 봉쥬
	    // 봉쥬
	    // 봉쥬
	    // 봉쥬
	    // 봉쥬
	    
	}

}
