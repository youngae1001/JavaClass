import java.util.Scanner;

public class JavaDay6_4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String data = null; // �̰� for �ȿ� ���� �� �� �Ǵ� ����? -> �ݺ��� ��ü�� ���� �������� �Ǿ��ֱ� ������ ������ �ݺ����࿡�� �ٽ� null�� �Ǳ� ����!
		
		for(int i = 0; ; i++) {
			System.out.print("����� �������ּ��� (1. �� ����, 2. �� ��ȸ) :");
			int menu = Integer.parseInt(scan.nextLine());

			if(menu == 1) {
				System.out.print("������ ���� �Է����ּ��� : ");
				data = scan.nextLine();
				
			} else if(menu == 2) {
				System.out.printf("����� ������ ��: %s\n", data);
				
			} else {
				System.out.println("�߸��� ����Դϴ�.");
				
			}
		}		
		
		// ����� �������ּ��� (1. �� ����, 2. �� ��ȸ) : 1
		// ������ ���� �Է����ּ��� : hello
		// ����� �������ּ��� (1. �� ����, 2. �� ��ȸ) : 2
		// ����� ������ ��: hello

	}

}
