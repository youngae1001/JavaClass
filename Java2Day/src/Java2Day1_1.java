import java.util.ArrayList;

public class Java2Day1_1 {

	public static void main(String[] args) {
		
		// 배열의 단점을 보완하고 편리하게 사용 가능한 저장구조 제공 -> ArrayList
		// ArrayList -> JAVA API, 배열의 확장, 삭제, 갯수관리 등등을 처리
		
		// ArrayList는 모든 자료형을 배열에 넣을 수 있지만 자료를 불러올 때 아무렇게나 넣어놓으면 나중에 자료를 불러올 때 해당 인덱스가 어떤 자료형으로 되어있는지 다 기억하기 힘들다
		// 따라서 배열에 자료형을 지정해서 만든다 -> ArrayList<자료형>
		
		// 기본타입 -> int, float, double, boolean (빨간색으로 나옴)
		// 객체타입 -> 기본타입을 제외한 모든 것 (검은색으로 나옴)
		
		// ArrayList<자료형>에서의 자료형 자리에는 무조건 객체타입을 넣어야 함
		// 기본타입을 객체타입으로 나타내는 방법 => 래퍼클래스
		// int -> Integer
		// double -> Double
		
		int num1 = 10;
		System.out.println(num1);
		
		Integer num2 = 20;
		System.out.println(num2);
		
		Integer num3 = num1;
		System.out.println(num3);
		
		// 강력해진 배열
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(13);
		list.add(23);
		// 현재 배열 : [3, 13, 23]

		int rst = list.get(1);
		
		System.out.println("1. " + rst);
		
		// Create, Read, Update, Delete - 추가, 조회, 수정, 삭제
		// 위 네 가지는 확실히 익히고 나머지는 서칭해서 할 수 있으면 됨
		// 행위 -> ArrayList에서의 메소드
		// Create -> 추가 : add(추가할 값)
		// Read -> 조회 : get(가져올 데이터의 인덱스)
		// Update -> 수정 : set(수정할 데이터의 인덱스, 새로운 값)
		// Delete -> 삭제 : remove(삭제할 데이터의 인덱스)
		// 데이터 개수 보기 -> 사이즈 : size()
		
		// add는 한번에 여러개를 넣을 수 없음. 한번에 하나씩!
		list.add(8);
		
		list.set(1, 33);
		
		int rst2 = list.get(1);
		System.out.println("2. " + rst2);
		
		list.remove(1); // [3, 23, 8]
		
		int rst3 = list.get(1);
		System.out.println("3. " + rst3);
		
		int size = list.size();
		
		System.out.println(size);
		// 전체 출력
		System.out.println("===== 전체출력 =====");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("=== 연습문제 시작 ===");
		
		
		// ==================================================
		// 문제1.
		System.out.println("== 문제1 ==");
		
		// {5,4,3,2,1,0}을 ArrayList에 추가 해주세요.
		// ArrayList의 사이즈를 출력해주세요.
		// ArrayList의 3,4번째 값을 읽어서 출력해주세요.
		// 1,2번째 값을 지운 뒤, 다시 3,4번째 값을 출력해주세요
		// List의 모든 값을 toString 혹은 그냥 리스트명을 입력하여 출력해주세요.
		
		// 정수를 저장할 수 있는 ArrayList를 선언하고 만들어주세요.
		ArrayList<Integer> exam1 = new ArrayList<Integer>();
	    // 리스트에 값을 추가해주세요.
		exam1.add(5);
		exam1.add(4);
		exam1.add(3);
		exam1.add(2);
		exam1.add(1);
		exam1.add(0);


	    // size()
			// 리스트의 사이즈를 출력해주시고, 값이 6이 맞다면 계속 진행해주세요.
	    // 출력결과 : 6
		int exam1_size = exam1.size();
		System.out.println(exam1_size);

	    // get()
			// 리스트의 3,4번째 값을 출력해주세요.
	    // 출력결과 : 3, 2
		int exam1_3 = exam1.get(2);
		int exam1_4 = exam1.get(3);
		System.out.println(exam1_3 + ", " + exam1_4);

	    // remove()
			// 리스트의 1,2번째 값을 지운 뒤, 다시 3,4번째 값을 출력해주시고 어떤 변화가 있는지 체크해주세요.
	    // 출력 결과 : 1, 0
		exam1.remove(0);
		exam1.remove(0); // 앞에서 인덱스 0번째 값을 지웠으니, 기존의 인덱스 1,2,3,4,5번째들의 인덱스가 하나씩 땡겨짐 -> 기존 인덱스에서 1번째에 있던 데이터는 이제 0번째 인덱스
		int exam1_new3 = exam1.get(2);
		int exam1_new4 = exam1.get(3);
		System.out.println(exam1_new3 + ", " + exam1_new4);

	    // 반복문으로 출력.
	    // 
			// 리스트의 모든 값을 출력해주세요.
	    // 출력 결과 : 3, 2, 1, 0
		for(int i=0; i<exam1.size(); i++) {
			System.out.printf("%d ", exam1.get(i));
		}
		System.out.println();
		
		
		
		// 문제2
		System.out.println("== 문제2 ==");
		// 선언
		// 이름을 저장할 수 있는 ArrayList를 선언하고 만들어주세요.
		ArrayList<String> exam2 = new ArrayList<String>();


		// add()
		// 리스트에 값을 추가해주세요.
		// "홍길동", "이순신", "황진이", "임꺽정", "강감찬", "을지문덕" 을 ArrayList에 추가 해주세요.
		exam2.add("홍길동");
		exam2.add("이순신");
		exam2.add("황진이");
		exam2.add("임꺽정");
		exam2.add("강감찬");
		exam2.add("을지문덕");

		// size()
		// 리스트의 사이즈를 출력해주시고, 값이 6이 맞다면 계속 진행해주세요.
		// 출력결과 : 6
		int exam2_size = exam2.size();
		System.out.println(exam2_size);

		// get()
		// 리스트의 2,3 인덱스의 값을 출력해주세요.
		// 출력결과 : 황진이, 임꺽정
		String exam2_index2 = exam2.get(2);
		String exam2_index3 = exam2.get(3);
		
		System.out.printf("%s, %s\n", exam2_index2, exam2_index3);
		
		// 리스트의 모든 값을 출력해주세요.
		// 출력 결과 : 홍길동 이순신 황진이 임꺽정 강감찬 을지문덕
		for(int i=0; i<exam2.size(); i++) {
			System.out.printf("%s ", exam2.get(i));
		}
		
		System.out.println();
		
		// remove()
		// 리스트에서 홍길동, 이순신을 지운 뒤, 다시 2,3 인덱스의 값을 출력해주시고 어떤 변화가 있는지 체크해주세요.
		// 출력 결과 : 강감찬, 을지문덕
		exam2.remove(1);
		exam2.remove(0);
		
		String exam2_newIndex2 = exam2.get(2);
		String exam2_newIndex3 = exam2.get(3);
		
		System.out.printf("%s, %s\n", exam2_newIndex2, exam2_newIndex3);

		// 리스트의 모든 값을 출력해주세요.
		// 출력 결과 : 황진이 임꺽정 강감찬 을지문덕
		for(int i=0; i<exam2.size(); i++) {
			System.out.printf("%s ", exam2.get(i));
		}
		
		System.out.println();

		// add()
		// 리스트에 정약용을 추가시켜주세요.
		exam2.add("정약용");

		// 리스트의 모든 값을 출력해주세요.
		// 출력 결과 : 황진이 임꺽정 강감찬 을지문덕 정약용
		for(int i=0; i<exam2.size(); i++) {
			System.out.printf("%s ", exam2.get(i));
		}
		
		System.out.println();

		// set()
		// 임꺽정과 을지문덕을 신사임당과 유관순으로 바꿔주세요.
		exam2.set(1, "신사임당");
		exam2.set(3, "유관순");		
		
		// 리스트의 모든 값을 출력해주세요.
		// 출력 결과 : 황진이 신사임당 강감찬 유관순 정약용
		for(int i=0; i<exam2.size(); i++) {
			System.out.printf("%s ", exam2.get(i));
		}
		
		System.out.println();

		// 리스트에서 황진이 신사임당 유관순만 출력해주세요.
		// 출력 결과 : 황진이 신사임당 유관순
//		String exam2_0 = exam2.get(0);
//		String exam2_1 = exam2.get(1);
//		String exam2_3 = exam2.get(3);
//		
//		System.out.printf("%s %s %s", exam2_0, exam2_1, exam2_3);
		
		for(int i=0; i<exam2.size(); i++) {
			String name = exam2.get(i);
			
			// 문자열 비교는(객체 비교)는 ==가 아니라 equals() 사용. ==는 기본타입일 때 사용
			if(name.equals("황진이") || name.equals("신사임당") || name.equals("유관순")) {
				System.out.printf("%s ", name);
			}
		}
	}

}

// ArrayList란?
// class ArrayList {
//	int[] arr = new int[10];
//	int size= 0;
//	
//	void add(int data) {
//		
//	}
//	
//	void get(int index) {
//		
//	}
//	
//	void remove(int index) {
//		
//	}
//}