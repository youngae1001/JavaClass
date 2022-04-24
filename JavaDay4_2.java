
public class JavaDay4_2 {
	
	// 정의(함수 정의)(클래스 안에 써야됨)
	public static void test() {
		System.out.println("test 함수");
		System.out.println("hi");
		System.out.println("nice to meet you");
		System.out.println("bye");
	}
	
	public static void test2() {
		System.out.println("안녕");
		System.out.println("만나서 반가워");
		System.out.println("잘가");
	}
	
	// =============================================
	
	// 문제 1
	
	public static void hi1() {
        System.out.println("저는 차태진입니다.");
    }

    public static void hi2() {
        System.out.println("안녕하세요.");
    }

    public static void hi3() {
        System.out.println("프로그램을 만들어보아요.");
    }

    public static void hi4() {
        System.out.println("자바를 통해");
    }
    
    
    // 문제 2
    
    public static void hi() {
    	System.out.println("안녕하세요. 저는 홍길동입니다. 잘부탁드립니다.");
    }
    
    public static void bye() {
    	System.out.println("안녕히 가세요. 다음에 또 봐요!");
    }
    
    // ==============================================
	
	// main 함수(메서드)
	public static void main(String[] args) {

//		// 값의 재사용
//		
//		int num=2;
//		System.out.println(num);
//		System.out.println(num);
//		System.out.println(num);
//		
		// 함수 -> 절차를 저장하고 연산을 수행하는 주체
		// 함수를 사용하는 이유 -> 일이 분담돼서 책임소재가 명확
		// 절차이 재사용이 가능
		
		test(); // 호출(함수 호출)
		System.out.println("코드1");
		test2();
		System.out.println("코드2");
		test();
		System.out.println("코드3");
		
		
		// ============================================================
		
		// 문제1. 메서드를 올바르게 호출해서 아래처럼 출력되게 해주세요.

	    // 안녕하세요!! 
	    // 저는 차태진입니다.
	    // 자바를 통해
	    // 프로그램을 만들어보아요.
		
		hi2();
		hi1();
		hi4();
		hi3();
		
		
		// 문제2. 메서드를 만들어보기
		
		hi(); // 안녕하세요. 저는 홍길동입니다. 잘부탁드립니다.
	    bye(); // 안녕히 가세요. 다음에 또 봐요!
	    
	    
	    
	    // 컨트롤 + 쉬프트 + F : 자동 줄맞춤
	}

}
