import java.util.Scanner;

public class JavaDay5_4 {
	
	public static String vendingMacine(int inputMoney, int bno) {
		
		String[] beverageNames = {"�ݶ�", "���̴�", "Ŀ��", "����"};
		int[] beveragePrices = {1200, 1000, 800, 600};
		
		System.out.printf("���� �ݾ��� %d���Դϴ�.\n", inputMoney);
		
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
		
		// �Է� -> ���� �Է�, Ű���� �Է�, ���콺 �Է�
		// ó�� -> ���α׷�
		// ��� -> System.out.println() Ű����/�����
		
		// ��Ʈ�� + ����Ʈ + O (��ĳ�� ����� �ؿ� ������ �߸� �� 3�� ���ÿ� ������ ��)
		Scanner scan = new Scanner(System.in);
		
//		scan.next(); // �Է� �����͸� �о��(Ű����� �ԷµǾ� ����ҿ� ����� �����͸� ������) ����ҿ� ����� ���� �������� ���̹Ƿ� �̰� �ϸ� ����Ҵ� �ٽ� ����ְ� ��
		
//		// 1. ���ڸ� �Է¹��� ���
//		
//		System.out.printf("ù��° �����͸� �Է����ּ��� : ");
//		String s = scan.nextLine();
//		
//		System.out.printf("�ι�° �����͸� �Է����ּ��� : ");
//		String s2 = scan.nextLine();
//		
//		// nextInt, nextDouble ��� ������ nextLine�� ����!!
//
//		System.out.printf("����� �Է��� �� : %s, %s\n", s,s2);
		
		
//		// 2. ���ڸ� �Է¹��� ���
//		
//		System.out.printf("ù��° �����͸� �Է����ּ��� : ");
//		int s = Integer.parseInt(scan.nextLine()); // �Է¹��� ���� int�� ��ȯ�ؼ� �����ϴ� �ڵ�. ���ڷ� �ް������ �̷��� ���� ��
//		
//		System.out.printf("�ι�° �����͸� �Է����ּ��� : ");
//		int s2 = Integer.parseInt(scan.nextLine());
//		
//		System.out.printf("����� �Է��� �� : %s, %s\n", s,s2);
//		System.out.printf("�� ���� ���� �� : %d", s + s2);
		
		
		// =======================================================================================================
		
		// ��, ���� �����
		// 0 - �ݶ�(1200), 1 - ���̴�(1000), 2 - Ŀ��(800), 3 - ����(600)
		
		System.out.println("==================== ����� ��� ========================");
		System.out.println("0 : �ݶ� (1200��)");
		System.out.println("1 : ���̴� (1000��)");
		System.out.println("2 : Ŀ�� (800��)");
		System.out.println("3 : ���� (600��)");
		System.out.println("======================================================");
		
		System.out.printf("���� �ݾ��� �����Ͻðڽ��ϱ�? : ");
		int inputMoney= Integer.parseInt(scan.nextLine());
		
		System.out.printf("� ������� �����Ͻðڽ��ϱ�? : ");
		int bno = Integer.parseInt(scan.nextLine());
		
		
		String beverage = vendingMacine(inputMoney, bno);
		
		if(beverage == null) {
			System.out.println("ȫ�浿�� ������� ���� ���մϴ�.");
		} else {
			System.out.printf("ȫ�浿�� %s�� �������� ���ʴϴ�.\n", beverage);			
		}

		
		
	}

}
