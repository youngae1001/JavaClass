import java.util.ArrayList;
import java.util.Scanner;

public class Java2Day1_4 {
	
	// main�Լ� �ۿ� �ִ� �ڿ��� static�� �ٿ��ߵ�
	static ArrayList<String> titles = new ArrayList<>();
	static ArrayList<String> bodies = new ArrayList<>();

	public static void main(String[] args) {
		/* �䱸���� : �Խù� ����

		1. �Խù� ���� ��� ����. ��ɾ� : update

		2. ���ϴ� �Խù��� ������ ������ �� �־�� �մϴ�. -> �Խù��� ������ �� �ִ� �ĺ��ڰ� �ʿ��մϴ�.(�Խù� ��ȣ)

		3. ������ ���̰� �ſ� �� ���� �ֱ� ������ �Խù� ����� ������ ���� ���� �������� �ʽ��ϴ�. ��Ͽ��� ������ �����ּ���.

		4. �ùٸ��� ���� �Խù��� �����ϸ� �Խù��� ���ٰ� ���;� �մϴ�.

		5. ������ �Ϸ�Ǹ� �ٽ� ����� �����ּ���.

		- ����� ����
		`
		��ɾ �Է����ּ��� : list
		===================
		��ȣ : 1
		���� : ����2
		===================
		��ȣ : 2
		���� : ����2
		===================
		��ɾ �Է����ּ��� : update
		������ �Խù� ��ȣ : 3
		���� �Խù� ��ȣ�Դϴ�.
		��ɾ �Է����ּ��� : update
		������ �Խù� ��ȣ : 1
		���� : ������
		���� : ������
		������ �Ϸ�Ǿ����ϴ�.
		��ȣ : 1
		���� : ������
		===================
		��ȣ : 2
		���� : ����2
		===================
		*/
		
		Scanner sc = new Scanner(System.in);
		
		
		for( ; ; ) {
			System.out.print(">> ");
			String cmd = sc.nextLine();
			if(cmd.equals("help")) {
				System.out.println("add : �Խù� ���");
				System.out.println("list : �Խù� ���");
				System.out.println("update : �Խù� ����");
				System.out.println("exit : ���α׷� ����");
				
			} else if(cmd.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�");
				break;
				
			} else if(cmd.equals("add")) {
				System.out.print("���� : ");
				String title = sc.nextLine();
				System.out.print("���� : ");
				String body = sc.nextLine();
				titles.add(title);
				bodies.add(body);
				
				System.out.println("�Խù��� ����Ǿ����ϴ�.");
				
			} else if(cmd.equals("list")) {
				printArticles();
				
			} else if(cmd.equals("update")) {
				
				// CRUD
				System.out.print("������ �Խñ��� ��ȣ : ");
				int num = Integer.parseInt(sc.nextLine());
				int index = num - 1;
				
				if(index >= 0 && index < titles.size()) {
					System.out.print("�� ���� : ");
					String title = sc.nextLine();
					System.out.print("�� ���� : ");
					String body = sc.nextLine();
					
					titles.set(index, title);
					bodies.set(index, body);
					
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					
					printArticles();

				} else {
					System.out.println("�ش� ��ȣ�� �Խñ��� �����ϴ�.");
				}
				
			} else {
				System.out.println("�� �� ���� ��ɾ��Դϴ�.");
			}
		}
	}

	public static void printArticles() {
		// list ��ü ���
		for(int i=0; i<titles.size(); i++) {	
			System.out.println(i+1 + "��° ��");
			System.out.printf("���� : %s\n",titles.get(i));
			System.out.printf("���� : %s\n",bodies.get(i));
			System.out.println("======================");
		}
	}
	
}