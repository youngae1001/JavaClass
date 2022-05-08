package day8;

public class JavaDay8_1 {

	public static void main(String[] args) {
		// Customer.java
		// Sol1.java
		// �� ���Ϸ� ���� Ǯ������(�� ��Ű�� �ȿ� �ִ� Ŭ������ ���� Ŭ���� �ȿ� �ִ� �ٸ� �ڹ����ϵ鿡�� ������ ��ġ�� ���� Ȱ����)
		
		
		// ���1. ����� �̱�                  -> operate
		// ���2. ���� �� �ִ� ���� ���� �� �� �߰� -> addBeverage
		// ���3. �⺻ 4�� ����� ä���         -> init
		// ���4. �̱� ������ ����� ��� ����     -> printBeverageList
		
		VendingMachine m1 = new VendingMachine();
		
		m1.init(); // �⺻����� ä���(m1 �ʱ�ȭ)
		
		Beverage newBeverage = new Beverage("ȯŸ", 1100);
		m1.addBeverage(newBeverage);
		
		Beverage newBeverage2 = new Beverage("����", 900);
		m1.addBeverage(newBeverage2);
		
		m1.printBeverageList();
		
		// �̱� ����
		
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
