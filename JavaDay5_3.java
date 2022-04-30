
public class JavaDay5_3 {
	
	public static String vendingMacine(int inputMoney, int bno) {
		
		String[] beverageNames = {"콜라", "사이다", "커피", "생수"};
		int[] beveragePrices = {1200, 1000, 800, 600};
		
		System.out.printf("투입 금액은 %d입니다.\n", inputMoney);
		
		if(inputMoney < beveragePrices[bno]) {
			System.out.println("잔액이 부족합니다.");
			return null;
		}
		
		System.out.printf("%s를 뽑으셨습니다.\n", beverageNames[bno]);
		
		int remainder = inputMoney - beveragePrices[bno];
		System.out.printf("잔액은 %d입니다.\n", remainder);
		
		return beverageNames[bno];
	}
	

	public static void main(String[] args) {
		
		// 돈, 뽑을 음료수
		// 0 - 콜라(1200), 1 - 사이다(1000), 2 - 커피(800), 3 - 생수(600)
		
		String beverage = vendingMacine(1000, 3);
		
		if(beverage == null) {
			System.out.println("홍길동이 음료수를 뽑지 못합니다.");
		} else {
			System.out.printf("홍길동이 %s를 벌컥벌컥 마십니다.\n", beverage);			
		}

		String beverage2 = vendingMacine(2000, 0);
		
		if(beverage == null) {
			System.out.println("홍길순이 음료수를 뽑지 못합니다.");
		} else {
			System.out.printf("홍길순이 %s를 벌컥벌컥 마십니다.\n", beverage2);			
		}
	}

}
