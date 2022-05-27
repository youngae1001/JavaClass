import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ArticleRepository {

	private ArrayList<Article> articles = new ArrayList<>();
	private int articleId = 4;
	private int view = 0;
	
	public void makeTestData() {
		// 테스트용 데이터 넣어놓기
		String writer = "익명";
		
		Article test1 = new Article(1, "제목1", "내용1", Util.getCurrentDate(), view, writer);
		Article test2 = new Article(2, "제목2", "내용2", Util.getCurrentDate(), view, writer);
		Article test3 = new Article(3, "제목3", "내용3", Util.getCurrentDate(), view, writer);
	
		articles.add(test1);
		articles.add(test2);
		articles.add(test3);
	}
	
	// C
	
	public void addArticle(String title, String body) {
		String writer = "익명";
		
		Article article = new Article(articleId, title, body, Util.getCurrentDate(), view, writer);
		articles.add(article);
		articleId++;
	}
	
	// R
	
	public Article getArticleOne(int id) {
		
		// id를 번호로 하는 게시물이 존재하는가, 존재한다면 리턴
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
