package day8;

import java.util.Scanner;

public class JavaDay8_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// 기능1. 음료수 뽑기                  -> operate
		// 기능2. 뽑을 수 있는 음료 종류 한 개 추가 -> addBeverage
		// 기능3. 기본 4종 음료수 채우기         -> init
		// 기능4. 뽑기 가능한 음료수 목록 보기     -> printBeverageList
		
		VendingMachine m1 = new VendingMachine();
		m1.init();

		for(int i=0; ; i++) {
			System.out.println("1. 음료수 뽑기");
			System.out.println("2. 음료수 추가");
			System.out.println("3. 음료수 목록");
//			System.out.println("4. 음료수 삭제");
			System.out.print("메뉴를 선택해주세요 : ");
			int cmd = Integer.parseInt(scan.nextLine());
			System.out.println();
			
			if(cmd==1) {
				System.out.print("투입 금액을 입력해주세요 : ");
				int inputMoney = Integer.parseInt(scan.nextLine());
				System.out.print("음료수를 선택해주세요 : ");
				int bno = Integer.parseInt(scan.nextLine());
				
				m1.operate(inputMoney, bno);
				
			} else if(cmd==2) {
				System.out.print("추가할 음료수 이름을 입력해주세요 : ");
				String name = scan.nextLine();
				System.out.print("추가할 음료수의 가격을 알려주세요 : ");
				int price = Integer.parseInt(scan.nextLine());
				System.out.println();
				
				Beverage beverage = new Beverage(name, price);
				m1.addBeverage(beverage);
				
			} else if(cmd==3) {
				m1.printBeverageList();
				
			}
//			else if(cmd==4) {
//				System.out.print("삭제할 음료수의 번호를 입력해주세요 : ");
//				int dnum = Integer.parseInt(scan.nextLine());
//				
//				m1.deleteBeverage(dnum);
			
			// 이 부분 올려주신 파일 확인
//			}
			
			else {
				System.out.println("자판기를 종료합니다.");
				break;
			}
		}
		
		
	}

}
