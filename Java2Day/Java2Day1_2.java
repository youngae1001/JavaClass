package Java2Day;

import java.util.ArrayList;
import java.util.Scanner;

public class Java2Day1_2 {

	public static void main(String[] args) {
		// �Խ��� �����
		
		// ���α׷� ���� : �Է� > ó�� > ���
		
		// �Է� -> Scanner
		// ��� -> System.out.println()
		
		Scanner sc = new Scanner(System.in);
		
//		for( ; ; ) { // �̷��� ���� �κп� �ƹ��͵� �� ���� ���ѹݺ��� ��
//			System.out.print(">> ");
//			String cmd = sc.nextLine();
//			
//			if(cmd.equals("help")) {
//				System.out.println("���� ���");
//				
//			} else if(cmd.equals("exit")) {
//				System.out.println("���α׷��� �����մϴ�");
//				break;
//				
//			} else {
//				System.out.println("�� �� ���� ��ɾ��Դϴ�.");
//			}
//		}
		
		// =====================================================
		// ��������. �Ʒ� ������ �����ϵ��� �ڵ��Ͻÿ�
		
		// ��ɾ �Է����ּ��� : (���) help(�Է�)
		// add  : �Խù� ��� (���)
		// list : �Խù� ��� ��ȸ (���)
		// ��ɾ �Է����ּ��� : (���) add(�Է�)
		// ������ �Է����ּ��� : (���) �ȳ��ϼ���(�Է�)
		// ������ �Է����ּ��� : (���) �ݰ����ϴ�(�Է�)
		// �Խù��� ����Ǿ����ϴ�. (���)
		// ��ɾ �Է����ּ��� : (���) list(�Է�)
		// ��ȣ : 1(���)
		// ���� : �ȳ��ϼ���(���)
		// ���� : �ݰ����ϴ�(���)
		// ====================================(���)
		// ��ɾ �Է����ּ��� : (���) add(�Է�)
		// ������ �Է����ּ��� : (���) �ȳ��ϼ���2(�Է�)
		// ������ �Է����ּ��� : (���) �ݰ����ϴ�2(�Է�)
		// �Խù��� ����Ǿ����ϴ�. (���)
		// ��ɾ �Է����ּ��� : (���) list(�Է�)
		// ��ȣ : 1(���)
		// ���� : �ȳ��ϼ���(���)
		// ���� : �ݰ����ϴ�(���)
		// ====================================(���)
		// ��ȣ : 2(���)
		// ���� : �ȳ��ϼ���2(���)
		// ���� : �ݰ����ϴ�2(���)
		// ====================================(���)
		
		
		ArrayList<Board> boards = new ArrayList<>();
		
		while(true) {
			System.out.print("��ɾ �Է����ּ��� : ");
			String cmd = sc.nextLine();
			
			if(cmd.equals("help")) {
				System.out.println("add  : �Խù� ���");
				System.out.println("list : �Խù� ��� ��ȸ");
				
			} else if(cmd.equals("add")) {
				System.out.print("������ �Է����ּ��� : ");
				String title = sc.nextLine();
				
				System.out.print("������ �Է����ּ��� : ");
				String content = sc.nextLine();
				
				Board b1 = new Board(title, content);
				boards.add(b1);
				System.out.println("�Խù��� ����Ǿ����ϴ�.");
				
			} else if(cmd.equals("list")) {
				for(int i=0; i<boards.size(); i++) {						
					System.out.println("��ȣ : "+ (i+1));
					System.out.println("���� : " + boards.get(i).title);
					System.out.println("���� : " + boards.get(i).content);
					System.out.println("================================");
				} 
				
			} else if(cmd.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
				
			} else {
				System.out.println("�� �� ���� ��ɾ��Դϴ�.");
			}
		}

	}

}

class Board {
	String title;
	String content;
	
	public Board(String data1, String data2) {
		title = data1;
		content = data2;
	}
}
