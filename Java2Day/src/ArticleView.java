import java.util.ArrayList;

public class ArticleView {

	public void printHelp() {
		System.out.println("add : 게시물 등록");
		System.out.println("list : 게시물 목록");
		System.out.println("update : 게시물 수정");
		System.out.println("search : 게시물 검색");
		System.out.println("read : 게시물 상세보기");
		System.out.println("delete : 게시물 삭제");
		System.out.println("exit : 프로그램 종료");
	}
	
	public void printArticles(ArrayList<Article> articles) {
		// list 전체 출력
		for(int i=0; i<articles.size(); i++) {	
			System.out.println("번호 : " + articles.get(i).getId());
			System.out.printf("제목 : %s\n", articles.get(i).getTitle());
			System.out.printf("작성자 : %s\n", articles.get(i).getWriter());
			System.out.printf("등록날짜 : %s\n", articles.get(i).getRegDate());
			System.out.printf("조회수 : %d\n", articles.get(i).getView());
			System.out.println("======================");
		}
	}
	
	public void printArticleDetail(Article article, int targetIdx) {		
		System.out.printf("==== %d번 게시물 ====\n", article.getId());
		System.out.printf("번호 : %d\n", article.getId());
		System.out.printf("제목 : %s\n", article.getTitle());
		System.out.printf("등록날짜 : %s\n", article.getRegDate());
		System.out.println("-------------------");
		System.out.printf("내용 : %s\n", article.getContent());
		System.out.println("-------------------");
		System.out.println("===================");
	}
	
	
	
}
