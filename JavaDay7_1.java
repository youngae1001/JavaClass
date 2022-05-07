
public class JavaDay7_1 {
	// run 함수는 Car 클래스와 관련되어서만 쓰이므로 Car 클래스 안으로 이동(코드 관리의 편리성을 위해)
//	public static void run(Car car) {
//		System.out.println("자동차 슝");
//	}
//	
//	public static void run2(Car car) {
//		System.out.printf("%d속도로 자동차 슝\n", car.maxVelo);
//	}

	public static void main(String[] args) {
//		Person p1 = new Person(); // new Person() -> Person을 한개 복사하기
//
//		p1.age = 20;
//		p1.name = "홍길동";
//		p1.home = "대전";
//		
//		System.out.println(p1.age);
//		System.out.println(p1.name);
//		System.out.println(p1.home);
//				
//		Person p2 = new Person();
//		
//		p2.age = 22;
//		p2.name = "홍길순";
//		p2.home = "제주";
//		
//		System.out.println(p2.age);
//		System.out.println(p2.name);
//		System.out.println(p2.home);
//		
//		// 객체 생성(선언)
//		Person p3 = new Person();
//		
//		// 초기화(필수!)
//		p3.setData(30, "이순신", "청주");
//		
//		System.out.println(p3.age);
//		System.out.println(p3.name);
//		System.out.println(p3.home);
//		
//		Person p4 = new Person();
//		p4.setData(25, "황진이", "전주");
//		System.out.println(p4.age);
//		System.out.println(p4.name);
//		System.out.println(p4.home);
		
		Person2 p1 = new Person2(30, "이순신", "청주");
		Person2 p2 = new Person2(25, "황진이", "전주");
		
		
		// =======================================
		
		// 문제1. 자동차가 3번 달리게 해주세요.
		// 출력 : 자동차가 달립니다.
		
//		//v1. 1개의 자동차가 3번 달리게 해주세요.
//		
//		OneCar c1 = new OneCar();
//		c1.name = "레이";
//		c1.num = 3;
//		
//		for (int i=0; i<c1.num; i++) {
//			System.out.println(c1.name + "슝슝");
//		}
//
//	    //v2. 3개의 자동차가 1번씩 달리게 해주세요.
//		
//		OneCar c2 = new OneCar();
//		c2.name = ""
		

		// 데이터(상태) + 함수(동작)로 이루어진 것 => 객체
		Car2 c1 = new Car2();
		c1.maxVelo = 200;
		
		Car2 c2 = new Car2();
		c2.maxVelo = 250;
		
		Car2 c3 = new Car2();
		c3.maxVelo = 220;

		//v1. 1개의 자동차가 3번 달리게 해주세요.
		c1.run();
		c1.run();
		c1.run();
		
		//v2. 3개의 자동차가 1번씩 달리게 해주세요.
		c1.run();
		c2.run();
		c3.run();
		
		
		
		// 문제2. 자동차 객체를 담을 변수를 만들어주세요.
		// 자동차 객체를 변수에 담고 그 변수를 이용해 최고속력이 서로 다르게 만들어주세요.
		// 각 자동차가 자신의 최고속력으로 달리게 해주세요.
		
		c1.run2();
		c2.run2();
		c3.run2();
		
	}

}

class Person2 {
	// static => 원본에 적는 것
	// static이 붙지 않는 것 => 복사본으로 사용할 것
	int age; // 얘네들 앞에 static 있으면 main함수에 복사본을 주는 게 아니라 원본을 보내주게 됨 -> 복사본으로 쓰고싶으면 static 빼주기
	String name;
	String home;
	
	// 1. 리턴 타입 없음
	// 2. 반드시 클래스명과 동일
	// 3. 객체가 생성될 때 반드시 실행되는 메서드 => 생성자
	public Person2(int data1, String data2, String data3) {
		System.out.println("사람이 한 명 생성됩니다.");
		age=data1;
		name=data2;
		home=data3;
	}
	
//	public void setData(int data1, String data2, String data3) {
//		age=data1;
//		name=data2;
//		home=data3;
//	}
}

//class OneCar {
//	String name;
//	int num;
//} // 문제 이해 잘못함


// 클래스는 원본, 객체는 복사본(클래스를 객체라고 칭하진 않음)
class Car2 {
	int maxVelo;
	
	public void run() {
		System.out.println("자동차 슝");
	}
	
	public void run2() {
		System.out.printf("%d속도로 자동차 슝\n", maxVelo);
	}
}