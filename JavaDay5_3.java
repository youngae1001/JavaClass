
public class JavaDay5_3 {
	
	public static String vendingMacine(int inputMoney, int bno) {
		
		String[] beverageNames = {"�ݶ�", "���̴�", "Ŀ��", "����"};
		int[] beveragePrices = {1200, 1000, 800, 600};
		
		System.out.printf("���� �ݾ��� %d�Դϴ�.\n", inputMoney);
		
		if(inputMoney < beveragePrices[bno]) {
			System.out.println("�ܾ��� �����մϴ�.");
			return null;
		}
		
		System.out.printf("%s�� �����̽��ϴ�.\n", beverageNames[bno]);
		
		int remainder = inputMoney - beveragePrices[bno];
		System.out.printf("�ܾ��� %d�Դϴ�.\n", remainder);
		
		return beverageNames[bno];
	}
	

	public static void main(String[] args) {
		
		// ��, ���� �����
		// 0 - �ݶ�(1200), 1 - ���̴�(1000), 2 - Ŀ��(800), 3 - ����(600)
		
		String beverage = vendingMacine(1000, 3);
		
		if(beverage == null) {
			System.out.println("ȫ�浿�� ������� ���� ���մϴ�.");
		} else {
			System.out.printf("ȫ�浿�� %s�� �������� ���ʴϴ�.\n", beverage);			
		}

		String beverage2 = vendingMacine(2000, 0);
		
		if(beverage == null) {
			System.out.println("ȫ����� ������� ���� ���մϴ�.");
		} else {
			System.out.printf("ȫ����� %s�� �������� ���ʴϴ�.\n", beverage2);			
		}
	}

}
