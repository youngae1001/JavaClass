package day8;

public class VendingMachine {
	
	public int remainder = 0;
	
//	// ����
//	Beverage b1 = new Beverage("�ݶ�", 1200);
//	Beverage b2 = new Beverage("���̴�", 1000);
//	Beverage b3 = new Beverage("Ŀ��", 800);
//	Beverage b4 = new Beverage("����", 600);
	
	Beverage[] beverages = new Beverage[10]; // ����� 10������ ���� ����
	int count = 4;
	
	// ���� ==> ���� ==> ������ �Լ����� �ؾ� ��
//	beverages[0] = b1; // ���� ��ó�� ������ �� ����(���� �갡 �ҼӵǾ� �ִ� ���� �Լ��� �ƴ϶� Ŭ�����̱� ���� ���� �������ִ� �Լ��� �������� ��)
	
	public void init() {
		// ���� �� �ȿ��� �ϴ� �� �� ����
		Beverage b1 = new Beverage("�ݶ�", 1200);
		Beverage b2 = new Beverage("���̴�", 1000);
		Beverage b3 = new Beverage("Ŀ��", 800);
		Beverage b4 = new Beverage("����", 600);
		
		beverages[0] = b1;
		beverages[1] = b2;
		beverages[2] = b3;
		beverages[3] = b4;
	}
	
	public void printBeverageList() {
		System.out.println("===== ����� ��� =====");
		for(int i=0; i<count; i++) {
			System.out.printf("%d�� : %s, %d��\n", i, beverages[i].name, beverages[i].price);
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
		// ���� ���
//		String[] beverageNames = {"�ݶ�", "���̴�", "Ŀ��", "����"};
//		int[] beveragePrices = {1200, 1000, 800, 600};
		
//		Beverage b1 = new Beverage("�ݶ�", 1200);
//		Beverage b2 = new Beverage("���̴�", 1000);
//		Beverage b3 = new Beverage("Ŀ��", 800);
//		Beverage b4 = new Beverage("����", 600);
		
//		Beverage[] beverages = {b1, b2, b3, b4};
		
		Beverage target = beverages[bno];
		
		System.out.printf("���� �ݾ��� %d�Դϴ�.\n", inputMoney);
		
		remainder += inputMoney;
		
		if(remainder < target.price) {
			System.out.println("�ܾ��� �����մϴ�.");
			System.out.println();
			return null;
		}
		
		System.out.printf("%s�� �����̽��ϴ�.\n", target.name);
		
		
		remainder = remainder - target.price; // operate ��������
		System.out.printf("�ܾ��� %d�Դϴ�.\n", remainder);
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
