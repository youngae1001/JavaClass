import java.util.ArrayList;
import java.util.Scanner;

public class Board {
	
	ArticleView articleView = new ArticleView();
	ArticleRepository repo = new ArticleRepository();

	Scanner sc = new Scanner(System.in);
	
	public void run() {
		
		repo.makeTestData();
				
		for( ; ; ) {
			System.out.print(">> ");
			String cmd = sc.nextLine();
			if(cmd.equals("help")) {
				articleView.printHelp();
								
			} else if(cmd.equals("add")) {
				addArticle();
				
			} else if(cmd.equals("list")) {
				articleView.printArticles(repo.getArticles());
				
			} else if(cmd.equals("update")) {
				updateArticle();
				articleView.printArticles(repo.getArticles());
								
			} else if(cmd.equals("search")) {
				searchArticles();
				
			} else if(cmd.equals("read")) {
				readArticle();
				
			} else if(cmd.equals("delete")) {
				deleteArticles();
				articleView.printArticles(repo.getArticles());
				
			} else if(cmd.equals("exit")) {
				System.out.println("프로그램을 종료합니다");
				break;
				
			} else {
				System.out.println("알 수 없는 명령어입니다.");
			}
		}
	
	}
	
	private void readArticle() {
		System.out.print("상세보기 할 게시물 번호 : ");
		int targetId = Integer.parseInt(sc.nextLine());
		
		Article article = repo.getArticleOne(targetId);
		
		if(article == null) {
			System.out.println("없는 게시물입니다.");
		} else {
			articleView.printArticleDetail(article, targetId);
			
			int viewNum = article.getView();
			viewNum++;
			article.setView(viewNum);
		}
	}
	
	public void searchArticles() {
		System.out.print("검색 키워드를 입력해주세요 :");
		String keyword = sc.nextLine();
		
		ArrayList<Article> searchedList = repo.getSearchedArticleList(keyword);
		articleView.printArticles(searchedList);
	}
	
	public void updateArticle() {
		// CRUD
		System.out.print("수정할 게시글의 번호 : ");
		int targetId = Integer.parseInt(sc.nextLine());

		Article article = repo.getArticleOne(targetId);
		
		if(article == null) {
			System.out.println("없는 게시물입니다.");
			return;

		} else {
			System.out.print("새 제목 : ");
			String title = sc.nextLine();
			System.out.print("새 내용 : ");
			String content = sc.nextLine();
			
			repo.updateArticle(article, title, content);
			
			System.out.println("수정이 완료되었습니다.");
		}
	}
	
	public void addArticle() {
		System.out.print("제목 : ");
		String title = sc.nextLine();
		System.out.print("내용 : ");
		String body = sc.nextLine();
		
		
		repo.addArticle(title, body);
		
		System.out.println("게시물이 저장되었습니다.");
	}
	
	public void deleteArticles() {
		System.out.print("삭제할 게시물 번호를 입력해주세요 : ");
		int targetId = Integer.parseInt(sc.nextLine());
		
		Article article = repo.getArticleOne(targetId);
		
		repo.deleteArticle(article);
		System.out.println("게시물이 삭제되었습니다.");
		
	}
	
	
}
