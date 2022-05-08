package day8;

public class JavaDay8_1 {

	public static void main(String[] args) {
		// Customer.java
		// Sol1.java
		// 두 파일로 예제 풀이했음(한 패키지 안에 있는 클래스는 같은 클래스 안에 있는 다른 자바파일들에도 영향을 끼치는 것을 활용함)
		
		
		// 기능1. 음료수 뽑기                  -> operate
		// 기능2. 뽑을 수 있는 음료 종류 한 개 추가 -> addBeverage
		// 기능3. 기본 4종 음료수 채우기         -> init
		// 기능4. 뽑기 가능한 음료수 목록 보기     -> printBeverageList
		
		VendingMachine m1 = new VendingMachine();
		
		m1.init(); // 기본음료수 채우기(m1 초기화)
		
		Beverage newBeverage = new Beverage("환타", 1100);
		m1.addBeverage(newBeverage);
		
		Beverage newBeverage2 = new Beverage("식혜", 900);
		m1.addBeverage(newBeverage2);
		
		m1.printBeverageList();
		
		// 뽑기 시작
		
		String result = m1.operate(1000, 2);
		
		System.out.println("===============");
		System.out.println(result);
		System.out.println();
		
		String result2 = m1.operate(1000, 0);
		
		System.out.println("===============");
		System.out.println(result2);
		System.out.println();
		
		String result3 = m1.operate(1100, 4);
		
		System.out.println("===============");
		System.out.println(result3);
		System.out.println();
		
		String result4 = m1.operate(1100, 5);
		
		System.out.println("===============");
		System.out.println(result4);
		System.out.println();
	}

}
