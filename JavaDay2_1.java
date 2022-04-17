
public class JavaDay2_1 {
	public static void main(String[] args) {
		
		// 4대 구성요소
		// 자료형, 변수, 조건문, 반복문
		
		// 특정 상황에만 실행되어야 하는 명령
		// 조건이 맞을 때만 실행 -> 실행이 될 때도 있고, 안 될 때도 있다 -> 조건문
		
		// 만약 날씨가 좋으면 실행하라
		// 1. 맑음  2. 비
		// 변수로 날씨를 설정
		
		int weather=1;
		
//		System.out.println(weather);
		
		// == : 좌항과 우항이 같다
		if (weather == 1) {
			System.out.println("창문을 열어라");
		} else {
			System.out.println("창문을 닫아라");			
		}
		
//		if (weather == 2) {
//			System.out.println("창문을 닫아라");
//		}
		
		// 할인대상, 성별, 동전 앞뒤, 미성년자 여부 등 양자택일의 상황에서 유용
		
		int sex = 1; // 1. 남자  2. 여자
		
		if (sex == 1) {
			System.out.println("남자입니다.");
		} else {
			System.out.println("여자입니다.");
		}
		
		// 양자택일의 상황이 아니더라도 여러가지 상황 중 특정 상황에 실행되어야할 때 유용
		
		// 갈림길의 상황(직진, 좌, 우)

		int crossroad = 1; // 1. 좌  2. 직진  3. 우
		
		if(crossroad == 2) {	
			System.out.println("직진합니다.");
		} else if (crossroad == 1) {
			System.out.println("좌회전합니다.");
		} else {
			System.out.println("우회전합니다.");
		}
		
		
		// 나이에 따른 구분 해보기 -> 초등, 중등, 고등, 대학
		// 자바는 사잇값 표현이 안 됨(15<age<20같은거)
		
		int age = 18; 
		
		if (age < 14) {
			System.out.println("초등");
		} else if (age<17) {
			System.out.println("중등");
		} else if (age<20) {
			System.out.println("고등");
		} else {
			System.out.println("대학");
		}
		
		
	}
}
