package day8;

import java.util.Scanner;

public class JavaDay8_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// ���1. ����� �̱�                  -> operate
		// ���2. ���� �� �ִ� ���� ���� �� �� �߰� -> addBeverage
		// ���3. �⺻ 4�� ����� ä���         -> init
		// ���4. �̱� ������ ����� ��� ����     -> printBeverageList
		
		VendingMachine m1 = new VendingMachine();
		m1.init();

		for(int i=0; ; i++) {
			System.out.println("1. ����� �̱�");
			System.out.println("2. ����� �߰�");
			System.out.println("3. ����� ���");
//			System.out.println("4. ����� ����");
			System.out.print("�޴��� �������ּ��� : ");
			int cmd = Integer.parseInt(scan.nextLine());
			System.out.println();
			
			if(cmd==1) {
				System.out.print("���� �ݾ��� �Է����ּ��� : ");
				int inputMoney = Integer.parseInt(scan.nextLine());
				System.out.print("������� �������ּ��� : ");
				int bno = Integer.parseInt(scan.nextLine());
				
				m1.operate(inputMoney, bno);
				
			} else if(cmd==2) {
				System.out.print("�߰��� ����� �̸��� �Է����ּ��� : ");
				String name = scan.nextLine();
				System.out.print("�߰��� ������� ������ �˷��ּ��� : ");
				int price = Integer.parseInt(scan.nextLine());
				System.out.println();
				
				Beverage beverage = new Beverage(name, price);
				m1.addBeverage(beverage);
				
			} else if(cmd==3) {
				m1.printBeverageList();
				
			}
//			else if(cmd==4) {
//				System.out.print("������ ������� ��ȣ�� �Է����ּ��� : ");
//				int dnum = Integer.parseInt(scan.nextLine());
//				
//				m1.deleteBeverage(dnum);
			
			// �� �κ� �÷��ֽ� ���� Ȯ��
//			}
			
			else {
				System.out.println("���Ǳ⸦ �����մϴ�.");
				break;
			}
		}
		
		
	}

}
