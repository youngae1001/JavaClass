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
				System.out.println("���α׷��� �����մϴ�");
				break;
				
			} else {
				System.out.println("�� �� ���� ��ɾ��Դϴ�.");
			}
		}
	
	}
	
	private void readArticle() {
		System.out.print("�󼼺��� �� �Խù� ��ȣ : ");
		int targetId = Integer.parseInt(sc.nextLine());
		
		Article article = repo.getArticleOne(targetId);
		
		if(article == null) {
			System.out.println("���� �Խù��Դϴ�.");
		} else {
			articleView.printArticleDetail(article, targetId);
			
			int viewNum = article.getView();
			viewNum++;
			article.setView(viewNum);
		}
	}
	
	public void searchArticles() {
		System.out.print("�˻� Ű���带 �Է����ּ��� :");
		String keyword = sc.nextLine();
		
		ArrayList<Article> searchedList = repo.getSearchedArticleList(keyword);
		articleView.printArticles(searchedList);
	}
	
	public void updateArticle() {
		// CRUD
		System.out.print("������ �Խñ��� ��ȣ : ");
		int targetId = Integer.parseInt(sc.nextLine());

		Article article = repo.getArticleOne(targetId);
		
		if(article == null) {
			System.out.println("���� �Խù��Դϴ�.");
			return;

		} else {
			System.out.print("�� ���� : ");
			String title = sc.nextLine();
			System.out.print("�� ���� : ");
			String content = sc.nextLine();
			
			repo.updateArticle(article, title, content);
			
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		}
	}
	
	public void addArticle() {
		System.out.print("���� : ");
		String title = sc.nextLine();
		System.out.print("���� : ");
		String body = sc.nextLine();
		
		
		repo.addArticle(title, body);
		
		System.out.println("�Խù��� ����Ǿ����ϴ�.");
	}
	
	public void deleteArticles() {
		System.out.print("������ �Խù� ��ȣ�� �Է����ּ��� : ");
		int targetId = Integer.parseInt(sc.nextLine());
		
		Article article = repo.getArticleOne(targetId);
		
		repo.deleteArticle(article);
		System.out.println("�Խù��� �����Ǿ����ϴ�.");
		
	}
	
	
}
