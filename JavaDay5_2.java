
public class JavaDay5_2 {
	
	// 자료형
	
	public static int func1() {
		return 1;
	}
	
	public static double func2() {
		return 1.5;
	}
	
	public static String func3() {
		System.out.println("hi");
		
		return "hello";
//		System.out.println("hi"); // return은 함수의 종료를 의미하므로 return 다음에 명령을 넣으면 안 됨
	}
	
	public static boolean func4() {
		return true;
	}
	
	public static void func5() {
		for(int i = 1; i < 10; i++) {
			if(i==5) {
				return; // 함수의 종료를 의미하므로 반복 횟수가 남아있어도 여기서 멈춤
			}
			System.out.println(i);
		}
	}
	
	public static int func6() {
		for(int i = 1; i < 10; i++) {
			if(i==5) {
				return 5; // 이때 컴퓨터 입장에서는 i가 5가 되지 않을 수도 있다고 생각 -> 일반적일 경우엔 어떤 걸 return할 건지 써야됨
			}
			System.out.println(i);
		}
		return 0; // 이 부분 없으면 함수 오류
	}

	// return이 있는 함수에서 if문을 쓸 경우 : return이 안 되는 경우가 있으면 안 됨(else일 때도 return값이 뭔지 써야된다는 말) 
	
	// ==========================================================================================================
	
	public static boolean isNegative(int num) {
		
		// 방법1
//		if(num<0) {
//			return true;
//		} else {
//			return false;
//		}
		
		// 방법2
		if(num<0) {
			return true;
		}
		return false;
	}

	
	public static boolean isEven(int num) {
		if(num%2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void printEven(int n) {

	    // isEven 메서드를 이용. 
		
		for(int i = 1; i<=n; i++) {
			if(isEven(i)) {
				System.out.printf("%d ", i);
			}
		}
		System.out.println();
	}
	
	
	
	public static void main(String[] args) {
		
//		int i = 10;
//		double d = 10.1;
//		String s = "hello";
//		boolean b = true; // boolean은 true, false 양자택일에 대한 것임. 이때 "true"처럼 문자형으로 쓰면 안 됨
		
		// 논리값, 진리값 => boolean
		
		
		System.out.println(1 > 10);
		System.out.println(1 < 10);
		
		System.out.println(false);
		System.out.println(true);

		System.out.println("false");
		System.out.println("true");
		
		
		func5();
		
		// ========================================================================
		
		// 0은 양수로 보겠습니다.
		int no = -1;
		
		if(isNegative(no)) {
			
			System.out.println("음수입니다.");
			
		} else {
			
			System.out.println("양수입니다.");
			
		}
		// no 값을 바꿔가면서 테스트해보세요.
		
		
		// 1 부터 n까지 수 중 짝수인 것만 출력
		printEven(10); // 출력: 2 4 6 8 10
	    printEven(20); // 출력: 2 4 6 8 10 12 14 16 18 20
	    printEven(5); // 출력: 2 4 
		
		
	}

}
