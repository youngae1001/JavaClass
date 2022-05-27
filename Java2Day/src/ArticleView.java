import java.util.ArrayList;

public class ArticleView {

	public void printHelp() {
		System.out.println("add : �Խù� ���");
		System.out.println("list : �Խù� ���");
		System.out.println("update : �Խù� ����");
		System.out.println("search : �Խù� �˻�");
		System.out.println("read : �Խù� �󼼺���");
		System.out.println("delete : �Խù� ����");
		System.out.println("exit : ���α׷� ����");
	}
	
	public void printArticles(ArrayList<Article> articles) {
		// list ��ü ���
		for(int i=0; i<articles.size(); i++) {	
			System.out.println("��ȣ : " + articles.get(i).getId());
			System.out.printf("���� : %s\n", articles.get(i).getTitle());
			System.out.printf("�ۼ��� : %s\n", articles.get(i).getWriter());
			System.out.printf("��ϳ�¥ : %s\n", articles.get(i).getRegDate());
			System.out.printf("��ȸ�� : %d\n", articles.get(i).getView());
			System.out.println("======================");
		}
	}
	
	public void printArticleDetail(Article article, int targetIdx) {		
		System.out.printf("==== %d�� �Խù� ====\n", article.getId());
		System.out.printf("��ȣ : %d\n", article.getId());
		System.out.printf("���� : %s\n", article.getTitle());
		System.out.printf("��ϳ�¥ : %s\n", article.getRegDate());
		System.out.println("-------------------");
		System.out.printf("���� : %s\n", article.getContent());
		System.out.println("-------------------");
		System.out.println("===================");
	}
	
	
	
}
