package day8;

public class VendingMachine {
	
	public int remainder = 0;
	
//	// 선언
//	Beverage b1 = new Beverage("콜라", 1200);
//	Beverage b2 = new Beverage("사이다", 1000);
//	Beverage b3 = new Beverage("커피", 800);
//	Beverage b4 = new Beverage("생수", 600);
	
	Beverage[] beverages = new Beverage[10]; // 음료수 10개까지 저장 가능
	int count = 4;
	
	// 대입 ==> 연산 ==> 연산음 함수에서 해야 함
//	beverages[0] = b1; // 따라서 이처럼 대입할 수 없음(지금 얘가 소속되어 있는 곳은 함수가 아니라 클래스이기 때문 따라서 대입해주는 함수를 만들어줘야 함)
	
	public void init() {
		// 선언도 이 안에서 하는 게 더 좋음
		Beverage b1 = new Beverage("콜라", 1200);
		Beverage b2 = new Beverage("사이다", 1000);
		Beverage b3 = new Beverage("커피", 800);
		Beverage b4 = new Beverage("생수", 600);
		
		beverages[0] = b1;
		beverages[1] = b2;
		beverages[2] = b3;
		beverages[3] = b4;
	}
	
	public void printBeverageList() {
		System.out.println("===== 음료수 목록 =====");
		for(int i=0; i<count; i++) {
			System.out.printf("%d번 : %s, %d원\n", i, beverages[i].name, beverages[i].price);
		}
		System.out.println("====================");
		System.out.println();
	}
	
	public void addBeverage(Beverage beverage) {
		beverages[count] = beverage;
		count++;
	}
	
//	public void deleteBeverage(int num) {
//		for(int i=num; i<beverages.length; i++) {
//			beverages[i] = beverages[i+1];
//		}
//	}
	
	public String operate(int inputMoney, int bno) {
		// 음료 목록
//		String[] beverageNames = {"콜라", "사이다", "커피", "생수"};
//		int[] beveragePrices = {1200, 1000, 800, 600};
		
//		Beverage b1 = new Beverage("콜라", 1200);
//		Beverage b2 = new Beverage("사이다", 1000);
//		Beverage b3 = new Beverage("커피", 800);
//		Beverage b4 = new Beverage("생수", 600);
		
//		Beverage[] beverages = {b1, b2, b3, b4};
		
		Beverage target = beverages[bno];
		
		System.out.printf("투입 금액은 %d입니다.\n", inputMoney);
		
		remainder += inputMoney;
		
		if(remainder < target.price) {
			System.out.println("잔액이 부족합니다.");
			System.out.println();
			return null;
		}
		
		System.out.printf("%s를 뽑으셨습니다.\n", target.name);
		
		
		remainder = remainder - target.price; // operate 지역변수
		System.out.printf("잔액은 %d입니다.\n", remainder);
		System.out.println();
		
		return target.name;
	}
	
	
}

class Beverage {
	String name;
	int price;
	
	public Beverage(String data1, int data2) {
		name = data1;
		price = data2;
	}
}
