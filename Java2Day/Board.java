package Java2Day;

import java.util.ArrayList;
import java.util.Scanner;

public class Board {
	
	ArrayList<Article> articles = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public void run() {
		
		
		// �׽�Ʈ�� ������ �־����
		Article test1 = new Article("����1", "����1");
		Article test2 = new Article("����2", "����2");
		Article test3 = new Article("����3", "����3");
	
		articles.add(test1);
		articles.add(test2);
		articles.add(test3);
		
		for( ; ; ) {
			System.out.print(">> ");
			String cmd = sc.nextLine();
			if(cmd.equals("help")) {
				printHelp();
								
			} else if(cmd.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�");
				break;
				
			} else if(cmd.equals("add")) {
				addArticles();
				
			} else if(cmd.equals("list")) {
				printArticles();
				
			} else if(cmd.equals("update")) {
				updateArticles();
				
				
			} else if(cmd.equals("search")) {
				searchArticles();
				
			} else {
				System.out.println("�� �� ���� ��ɾ��Դϴ�.");
			}
		}
	
	}
	
	public void printHelp() {
		System.out.println("add : �Խù� ���");
		System.out.println("list : �Խù� ���");
		System.out.println("update : �Խù� ����");
		System.out.println("search : �Խñ� �˻�");
		System.out.println("exit : ���α׷� ����");
	}
	
	public void addArticles() {
		System.out.print("���� : ");
		String title = sc.nextLine();
		System.out.print("���� : ");
		String body = sc.nextLine();
		
		Article b1 = new Article(title, body);
		articles.add(b1);
		
		System.out.println("�Խù��� ����Ǿ����ϴ�.");
	}
	
	public void updateArticles() {
		// CRUD
		System.out.print("������ �Խñ��� ��ȣ : ");
		int num = Integer.parseInt(sc.nextLine());
		int index = num - 1;
		
		if(index >= 0 && index < articles.size()) {
			System.out.print("�� ���� : ");
			String title = sc.nextLine();
			System.out.print("�� ���� : ");
			String body = sc.nextLine();
			
			Article b2 = new Article(title, body);
			articles.set(index, b2);
			
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			
			printArticles();

		} else {
			System.out.println("�ش� ��ȣ�� �Խñ��� �����ϴ�.");
		}
	}
	
	public void printArticles() {
		// list ��ü ���
		for(int i=0; i<articles.size(); i++) {	
			System.out.println(i+1 + "��° ��");
			System.out.printf("���� : %s\n",articles.get(i).title);
//			System.out.printf("���� : %s\n",articles.get(i).content);
			System.out.println("======================");
		}
	}
	
	public void searchArticles() {
		searchArticles();
		System.out.print("�˻� Ű���带 �Է����ּ��� :");
		String search = sc.nextLine();
		
		int count = 0;
		for(int i=0; i<articles.size(); i++) {
			if(articles.get(i).title.contains(search)) {
				System.out.println(i+1 + "��° ��");
				System.out.printf("���� : %s\n",articles.get(i).title);
				System.out.println("======================");
				count++;
			}
		}
		if(count == 0) {
			System.out.println("�ش� Ű���带 ������ ���� �����ϴ�.");
		}
	}
}
