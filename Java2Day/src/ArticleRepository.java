import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ArticleRepository {

	private ArrayList<Article> articles = new ArrayList<>();
	private int articleId = 4;
	private int view = 0;
	
	public void makeTestData() {
		// �׽�Ʈ�� ������ �־����
		String writer = "�͸�";
		
		Article test1 = new Article(1, "����1", "����1", Util.getCurrentDate(), view, writer);
		Article test2 = new Article(2, "����2", "����2", Util.getCurrentDate(), view, writer);
		Article test3 = new Article(3, "����3", "����3", Util.getCurrentDate(), view, writer);
	
		articles.add(test1);
		articles.add(test2);
		articles.add(test3);
	}
	
	// C
	
	public void addArticle(String title, String body) {
		String writer = "�͸�";
		
		Article article = new Article(articleId, title, body, Util.getCurrentDate(), view, writer);
		articles.add(article);
		articleId++;
	}
	
	// R
	
	public Article getArticleOne(int id) {
		
		// id�� ��ȣ�� �ϴ� �Խù��� �����ϴ°�, �����Ѵٸ� ����
		for(int i=0; i<articles.size(); i++) {
			if(articles.get(i).getId() == id) {				
				return articles.get(i);
			}
		}
		
		return null;
		
	}
	
	public ArrayList<Article> getSearchedArticleList(String keyword) {
		ArrayList<Article> searchedArticleList = new ArrayList<>();
		
		for(int i=0; i<articles.size(); i++) {
			if(articles.get(i).getTitle().contains(keyword)) {
				searchedArticleList.add(articles.get(i));
			}
		}
		
		return searchedArticleList;	
	}
	
	public ArrayList<Article> getArticles() {
		return this.articles;
	}
	
	
	// U
	
	public void updateArticle(Article article, String title, String content) {
		article.setTitle(title);
		article.setContent(content);
	}
	
	// D
	
	public void deleteArticle(Article article) {
		articles.remove(article);
	}
	
}
