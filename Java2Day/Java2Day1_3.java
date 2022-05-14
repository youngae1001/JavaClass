package Java2Day;

import java.util.ArrayList;
import java.util.Scanner;

public class Java2Day1_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> titles = new ArrayList<>();
		ArrayList<String> bodies = new ArrayList<>();
		
		for( ; ; ) { // 이렇게 조건 부분에 아무것도 안 쓰면 무한반복문 됨
			System.out.print(">> ");
			String cmd = sc.nextLine();
			if(cmd.equals("help")) {
				System.out.println("add : 게시물 등록");
				System.out.println("list : 게시물 목록");
				System.out.println("exit : 프로그램 종료");
				
			} else if(cmd.equals("exit")) {
				System.out.println("프로그램을 종료합니다");
				break;
				
			} else if(cmd.equals("add")) {
				System.out.print("제목 : ");
				String title = sc.nextLine();
				titles.add(title);
				
				System.out.print("내용 : ");
				String body = sc.nextLine();
				bodies.add(body);
				
				System.out.println("게시물이 저장되었습니다.");
				
			} else if(cmd.equals("list")) {
				for(int i=0; i<titles.size(); i++) {	
					System.out.println(i+1 + "번째 글");
					System.out.printf("제목 : %s\n",titles.get(i));
					System.out.printf("내용 : %s\n",bodies.get(i));
					System.out.println("======================");
				}
			}
			else {
				System.out.println("알 수 없는 명령어입니다.");
			}
		}

	}

}
