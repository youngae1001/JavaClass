import java.util.ArrayList;
import java.util.Scanner;

public class Java2Day1_4 {
	
	// main함수 밖에 있는 자원은 static을 붙여야됨
	static ArrayList<String> titles = new ArrayList<>();
	static ArrayList<String> bodies = new ArrayList<>();

	public static void main(String[] args) {
		/* 요구사항 : 게시물 수정

		1. 게시물 수정 기능 구현. 명령어 : update

		2. 원하는 게시물을 선택해 수정할 수 있어야 합니다. -> 게시물을 구별할 수 있는 식별자가 필요합니다.(게시물 번호)

		3. 내용은 길이가 매우 길 수도 있기 때문에 게시물 목록을 보여줄 때는 보통 보여주지 않습니다. 목록에서 내용을 지워주세요.

		4. 올바르지 않은 게시물을 선택하면 게시물이 없다고 나와야 합니다.

		5. 수정이 완료되면 다시 목록을 보여주세요.

		- 입출력 예시
		`
		명령어를 입력해주세요 : list
		===================
		번호 : 1
		제목 : 제목2
		===================
		번호 : 2
		제목 : 제목2
		===================
		명령어를 입력해주세요 : update
		수정할 게시물 번호 : 3
		없는 게시물 번호입니다.
		명령어를 입력해주세요 : update
		수정할 게시물 번호 : 1
		제목 : 새제목
		내용 : 새내용
		수정이 완료되었습니다.
		번호 : 1
		제목 : 새제목
		===================
		번호 : 2
		제목 : 제목2
		===================
		*/
		
		Scanner sc = new Scanner(System.in);
		
		
		for( ; ; ) {
			System.out.print(">> ");
			String cmd = sc.nextLine();
			if(cmd.equals("help")) {
				System.out.println("add : 게시물 등록");
				System.out.println("list : 게시물 목록");
				System.out.println("update : 게시물 수정");
				System.out.println("exit : 프로그램 종료");
				
			} else if(cmd.equals("exit")) {
				System.out.println("프로그램을 종료합니다");
				break;
				
			} else if(cmd.equals("add")) {
				System.out.print("제목 : ");
				String title = sc.nextLine();
				System.out.print("내용 : ");
				String body = sc.nextLine();
				titles.add(title);
				bodies.add(body);
				
				System.out.println("게시물이 저장되었습니다.");
				
			} else if(cmd.equals("list")) {
				printArticles();
				
			} else if(cmd.equals("update")) {
				
				// CRUD
				System.out.print("수정할 게시글의 번호 : ");
				int num = Integer.parseInt(sc.nextLine());
				int index = num - 1;
				
				if(index >= 0 && index < titles.size()) {
					System.out.print("새 제목 : ");
					String title = sc.nextLine();
					System.out.print("새 내용 : ");
					String body = sc.nextLine();
					
					titles.set(index, title);
					bodies.set(index, body);
					
					System.out.println("수정이 완료되었습니다.");
					
					printArticles();

				} else {
					System.out.println("해당 번호의 게시글이 없습니다.");
				}
				
			} else {
				System.out.println("알 수 없는 명령어입니다.");
			}
		}
	}

	public static void printArticles() {
		// list 전체 출력
		for(int i=0; i<titles.size(); i++) {	
			System.out.println(i+1 + "번째 글");
			System.out.printf("제목 : %s\n",titles.get(i));
			System.out.printf("내용 : %s\n",bodies.get(i));
			System.out.println("======================");
		}
	}
	
}