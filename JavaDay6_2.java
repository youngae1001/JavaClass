
public class JavaDay6_2 {
	
	// 모든 함수가 같이 사용할 수 있는 변수
	static int num2 = 20; // 이렇게 하면 test 함수, main 함수 모두에서 num2라는 변수를 사용 가능
	
	// 함수의 매개변수도 지역변수
	public static void test(int param) {
		int num = 10; // 함수는 일반적으로 자신의 지역변수만 사용 가능
		System.out.println(num);
	}

	public static void main(String[] args) {
		
		// 지역변수, 변수의 생명주기(스코프)
		
		// 시스템 -> 프로그램 -> 변수를 제거하는 규칙
		
		// 변수 사용 지역을 정하고, 지역이 끝나면 변수는 사라짐(프로그램의 메모리는 한정적이므로 다 쓴 변수는 사라지게 해야 함)
		
		// 변수를 지역({}) 안에서 만들면 지역이 끝날 때 변수는 사라짐
		
		{
			int a = 10;
			System.out.println(a);
		}
		
//		System.out.println(a); // 중괄호 안에서 만들어진 변수는 그 중괄호를 나오면 사라짐

		int b = 20;
		{
			System.out.println(b); // 바깥 지역에 있는 변수는 안쪽 지역에서 사용 가능
		}
		
//		System.out.println(num); // num변수는 main함수 영역에 있는 것이 아니라 다른 함수의 영역에 있으므로 main 함수에서 사용할 수 없음
		
	}

}
