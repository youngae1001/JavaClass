package Java2Day;

import java.util.ArrayList;
import java.util.Scanner;

public class Java2Day1_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> titles = new ArrayList<>();
		ArrayList<String> bodies = new ArrayList<>();
		
		for( ; ; ) { // �̷��� ���� �κп� �ƹ��͵� �� ���� ���ѹݺ��� ��
			System.out.print(">> ");
			String cmd = sc.nextLine();
			if(cmd.equals("help")) {
				System.out.println("add : �Խù� ���");
				System.out.println("list : �Խù� ���");
				System.out.println("exit : ���α׷� ����");
				
			} else if(cmd.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�");
				break;
				
			} else if(cmd.equals("add")) {
				System.out.print("���� : ");
				String title = sc.nextLine();
				titles.add(title);
				
				System.out.print("���� : ");
				String body = sc.nextLine();
				bodies.add(body);
				
				System.out.println("�Խù��� ����Ǿ����ϴ�.");
				
			} else if(cmd.equals("list")) {
				for(int i=0; i<titles.size(); i++) {	
					System.out.println(i+1 + "��° ��");
					System.out.printf("���� : %s\n",titles.get(i));
					System.out.printf("���� : %s\n",bodies.get(i));
					System.out.println("======================");
				}
			}
			else {
				System.out.println("�� �� ���� ��ɾ��Դϴ�.");
			}
		}

	}

}
