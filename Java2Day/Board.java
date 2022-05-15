package Java2Day;

import java.util.ArrayList;
import java.util.Scanner;

public class Board {
	
	ArrayList<Article> articles = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public void run() {
		
		
		// 테스트용 데이터 넣어놓기
		Article test1 = new Article("제목1", "내용1");
		Article test2 = new Article("제목2", "내용2");
		Article test3 = new Article("제목3", "내용3");
	
		articles.add(test1);
		articles.add(test2);
		articles.add(test3);
		
		for( ; ; ) {
			System.out.print(">> ");
			String cmd = sc.nextLine();
			if(cmd.equals("help")) {
				printHelp();
								
			} else if(cmd.equals("exit")) {
				System.out.println("프로그램을 종료합니다");
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
				System.out.println("알 수 없는 명령어입니다.");
			}
		}
	
	}
	
	public void printHelp() {
		System.out.println("add : 게시물 등록");
		System.out.println("list : 게시물 목록");
		System.out.println("update : 게시물 수정");
		System.out.println("search : 게시글 검색");
		System.out.println("exit : 프로그램 종료");
	}
	
	public void addArticles() {
		System.out.print("제목 : ");
		String title = sc.nextLine();
		System.out.print("내용 : ");
		String body = sc.nextLine();
		
		Article b1 = new Article(title, body);
		articles.add(b1);
		
		System.out.println("게시물이 저장되었습니다.");
	}
	
	public void updateArticles() {
		// CRUD
		System.out.print("수정할 게시글의 번호 : ");
		int num = Integer.parseInt(sc.nextLine());
		int index = num - 1;
		
		if(index >= 0 && index < articles.size()) {
			System.out.print("새 제목 : ");
			String title = sc.nextLine();
			System.out.print("새 내용 : ");
			String body = sc.nextLine();
			
			Article b2 = new Article(title, body);
			articles.set(index, b2);
			
			System.out.println("수정이 완료되었습니다.");
			
			printArticles();

		} else {
			System.out.println("해당 번호의 게시글이 없습니다.");
		}
	}
	
	public void printArticles() {
		// list 전체 출력
		for(int i=0; i<articles.size(); i++) {	
			System.out.println(i+1 + "번째 글");
			System.out.printf("제목 : %s\n",articles.get(i).title);
//			System.out.printf("내용 : %s\n",articles.get(i).content);
			System.out.println("======================");
		}
	}
	
	public void searchArticles() {
		searchArticles();
		System.out.print("검색 키워드를 입력해주세요 :");
		String search = sc.nextLine();
		
		int count = 0;
		for(int i=0; i<articles.size(); i++) {
			if(articles.get(i).title.contains(search)) {
				System.out.println(i+1 + "번째 글");
				System.out.printf("제목 : %s\n",articles.get(i).title);
				System.out.println("======================");
				count++;
			}
		}
		if(count == 0) {
			System.out.println("해당 키워드를 포함한 글이 없습니다.");
		}
	}
}
