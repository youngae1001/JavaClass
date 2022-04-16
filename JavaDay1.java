
public class JavaDay1 {
	
	// 주석 - 메모 or 안 쓰는 코드 가리기
	
	// {} : 영역 표현
	// 새로운 영역이 열리면 들여쓰기(indent)해야함 
	
	// 시작과 끝(main) 작성 -> 메인메서드 라고 부름
	public static void main(String[] args) {
		// 출력
		// ; (세미콜론) -> 하나의 명령을 마무리함(명령 구분)
//		System.out.println(100);
//		System.out.println("hi"); // 문자 표현과 명령어 표현 구분 -> "" 유무
		
		// 값 =-> 데이터 =-> 자료 (똑같은 말임)
		// 자료형(데이터 타입)
//		System.out.println(100); // 정수(int)
//		System.out.println("100"); // 문자열(String)
//		System.out.println(100.0); // 실수(double)
		
		// 100을 정수로 3번 출력
		// 값을 저장 -> 변수에 저장
		// 어떤 유형의 데이터를 저장할 것이며, 변수를 어떻게 찾을 것인가
		int num1; // 변수의 데이터타입 지정
		num1 = 200; // 변수에 값 대입
		// 다시 int num1 = 30; 이라 쓰는 것은 중복 선언 -> 이미 만들어진 변수를 사용할 때는 변수명으로만 사용
		// 240 = num; -> 저장소는 왼쪽, 값은 오른쪽에 써야 함. 위치 어김
		
		// 변수가 =의 왼쪽에 올 때만 저장하는 역할. 그 외에는 저장하고 있는 값을 나타냄
		int num2;
		
		num1 = 10;
		num2 = 20;
		
		num1 = num2; // num1에 num2 값을 넣는다는 의미. num1=20이 됨

		System.out.println(num1);
		System.out.println(num2);
		
		// 명명규칙
		// 숫자로 시작 X
		// 특수문자 X
		// 공백 X
		// 소문자로 시작(권고)
		// 의미가 바뀔 때마다 대문자로 구분
		// 변수명을 유의미하게 짓기
		
		String str1 = "hello";
		double dnum = 10.5;
		
		System.out.println(str1);
		System.out.println(dnum);
	}
	
}
