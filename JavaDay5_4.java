import java.util.Scanner;

public class JavaDay5_4 {
	
	public static String vendingMacine(int inputMoney, int bno) {
		
		String[] beverageNames = {"콜라", "사이다", "커피", "생수"};
		int[] beveragePrices = {1200, 1000, 800, 600};
		
		System.out.printf("투입 금액은 %d원입니다.\n", inputMoney);
		
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
		
		// 입력 -> 파일 입력, 키보드 입력, 마우스 입력
		// 처리 -> 프로그램
		// 출력 -> System.out.println() 키보드/모니터
		
		// 컨트롤 + 쉬프트 + O (스캐너 만들고 밑에 빨간줄 뜨면 이 3개 동시에 누르면 됨)
		Scanner scan = new Scanner(System.in);
		
//		scan.next(); // 입력 데이터를 읽어옴(키보드로 입력되어 저장소에 저장된 데이터를 리턴함) 저장소에 저장된 값을 가져오는 것이므로 이걸 하면 저장소는 다시 비어있게 됨
		
//		// 1. 문자를 입력받을 경우
//		
//		System.out.printf("첫번째 데이터를 입력해주세요 : ");
//		String s = scan.nextLine();
//		
//		System.out.printf("두번째 데이터를 입력해주세요 : ");
//		String s2 = scan.nextLine();
//		
//		// nextInt, nextDouble 등등 많지만 nextLine만 쓰기!!
//
//		System.out.printf("당신이 입력한 값 : %s, %s\n", s,s2);
		
		
//		// 2. 숫자를 입력받을 경우
//		
//		System.out.printf("첫번째 데이터를 입력해주세요 : ");
//		int s = Integer.parseInt(scan.nextLine()); // 입력받은 값을 int로 변환해서 저장하는 코드. 숫자로 받고싶으면 이렇게 쓰면 됨
//		
//		System.out.printf("두번째 데이터를 입력해주세요 : ");
//		int s2 = Integer.parseInt(scan.nextLine());
//		
//		System.out.printf("당신이 입력한 값 : %s, %s\n", s,s2);
//		System.out.printf("두 수를 더한 값 : %d", s + s2);
		
		
		// =======================================================================================================
		
		// 돈, 뽑을 음료수
		// 0 - 콜라(1200), 1 - 사이다(1000), 2 - 커피(800), 3 - 생수(600)
		
		System.out.println("==================== 음료수 목록 ========================");
		System.out.println("0 : 콜라 (1200원)");
		System.out.println("1 : 사이다 (1000원)");
		System.out.println("2 : 커피 (800원)");
		System.out.println("3 : 생수 (600원)");
		System.out.println("======================================================");
		
		System.out.printf("얼마의 금액을 투입하시겠습니까? : ");
		int inputMoney= Integer.parseInt(scan.nextLine());
		
		System.out.printf("어떤 음료수를 선택하시겠습니까? : ");
		int bno = Integer.parseInt(scan.nextLine());
		
		
		String beverage = vendingMacine(inputMoney, bno);
		
		if(beverage == null) {
			System.out.println("홍길동이 음료수를 뽑지 못합니다.");
		} else {
			System.out.printf("홍길동이 %s를 벌컥벌컥 마십니다.\n", beverage);			
		}

		
		
	}

}
