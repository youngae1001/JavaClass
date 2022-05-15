package Java2Day;

public class Java2Day2_1 {
	
	// 인스턴스(객체)변수 -> 여러 복사본(객체)들이 들고 있는 변수
	// 정적변수(static 붙은 변수) -> 자바메모리상에 단 하나만 존재. 객체들의 공유 자원
	
	// main함수 밖에 있는 자원은 static을 붙여야됨
//	static ArrayList<Article> articles = new ArrayList<>();

	public static void main(String[] args) {
		
		Board board = new Board();
		board.run();
		
		// 관련 내용은 Article.java, Board.java에 넣어놓음
		
	}

	
}