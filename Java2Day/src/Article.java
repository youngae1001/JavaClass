public class Article {
	private int id;
	private String title;
	private String content;
	private String regDate;
	private int view;
	private String writer;

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public int getId() {
		return id;
	}	
	
	public void setId(int id) {
		this.id = id;
	}	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public int getView() {
		return view;
	}

	public void setView(int view) {
		this.view = view;
	}

	public Article(int id, String title, String content, String regDate, int view, String writer) {
		this.id = id;
		this.title = title; // this는 인스턴스를 의미
		this.content = content;
		this.regDate = regDate;
		this.view = view;
		this.writer = writer;
	}

	
}
