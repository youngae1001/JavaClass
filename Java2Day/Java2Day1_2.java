package Java2Day;

import java.util.ArrayList;
import java.util.Scanner;

public class Java2Day1_2 {

	public static void main(String[] args) {
		// 게시판 만들기
		
		// 프로그램 구조 : 입력 > 처리 > 출력
		
		// 입력 -> Scanner
		// 출력 -> System.out.println()
		
		Scanner sc = new Scanner(System.in);
		
//		for( ; ; ) { // 이렇게 조건 부분에 아무것도 안 쓰면 무한반복문 됨
//			System.out.print(">> ");
//			String cmd = sc.nextLine();
//			
//			if(cmd.equals("help")) {
//				System.out.println("도움말 기능");
//				
//			} else if(cmd.equals("exit")) {
//				System.out.println("프로그램을 종료합니다");
//				break;
//				
//			} else {
//				System.out.println("알 수 없는 명령어입니다.");
//			}
//		}
		
		// =====================================================
		// 연습문제. 아래 과정이 가능하도록 코딩하시오
		
		// 명령어를 입력해주세요 : (출력) help(입력)
		// add  : 게시물 등록 (출력)
		// list : 게시물 목록 조회 (출력)
		// 명령어를 입력해주세요 : (출력) add(입력)
		// 제목을 입력해주세요 : (출력) 안녕하세요(입력)
		// 내용을 입력해주세요 : (출력) 반갑습니다(입력)
		// 게시물이 저장되었습니다. (출력)
		// 명령어를 입력해주세요 : (출력) list(입력)
		// 번호 : 1(출력)
		// 제목 : 안녕하세요(출력)
		// 내용 : 반갑습니다(출력)
		// ====================================(출력)
		// 명령어를 입력해주세요 : (출력) add(입력)
		// 제목을 입력해주세요 : (출력) 안녕하세요2(입력)
		// 내용을 입력해주세요 : (출력) 반갑습니다2(입력)
		// 게시물이 저장되었습니다. (출력)
		// 명령어를 입력해주세요 : (출력) list(입력)
		// 번호 : 1(출력)
		// 제목 : 안녕하세요(출력)
		// 내용 : 반갑습니다(출력)
		// ====================================(출력)
		// 번호 : 2(출력)
		// 제목 : 안녕하세요2(출력)
		// 내용 : 반갑습니다2(출력)
		// ====================================(출력)
		
		
		ArrayList<Board> boards = new ArrayList<>();
		
		while(true) {
			System.out.print("명령어를 입력해주세요 : ");
			String cmd = sc.nextLine();
			
			if(cmd.equals("help")) {
				System.out.println("add  : 게시물 등록");
				System.out.println("list : 게시물 목록 조회");
				
			} else if(cmd.equals("add")) {
				System.out.print("제목을 입력해주세요 : ");
				String title = sc.nextLine();
				
				System.out.print("내용을 입력해주세요 : ");
				String content = sc.nextLine();
				
				Board b1 = new Board(title, content);
				boards.add(b1);
				System.out.println("게시물이 저장되었습니다.");
				
			} else if(cmd.equals("list")) {
				for(int i=0; i<boards.size(); i++) {						
					System.out.println("번호 : "+ (i+1));
					System.out.println("제목 : " + boards.get(i).title);
					System.out.println("내용 : " + boards.get(i).content);
					System.out.println("================================");
				} 
				
			} else if(cmd.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
				
			} else {
				System.out.println("알 수 없는 명령어입니다.");
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
