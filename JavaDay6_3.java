
public class JavaDay6_3 {
	
	static int remainder = 0;
	
	public static void deposit(int money) {
		remainder += money;
		System.out.printf("%d���� �����ϼ̽��ϴ�.\n",money);
		System.out.printf("�ܾ��� %d���Դϴ�.\n", remainder);
	}
	
	public static int withdraw(int money) {
		remainder -= money;
		System.out.printf("%d���� ����ϼ̽��ϴ�.\n", money);
		System.out.printf("�ܾ��� %d���Դϴ�.\n", remainder);		
		
		return money;
	}
	
	public static void main(String[] args) {
		
		deposit(1000); // ����
		deposit(1000);
		deposit(1000); 
		withdraw(300); // ���
		withdraw(1500);
		

	}

}
