
public class Java2Day3_1 {

	public static void main(String[] args) {

		// 접근제어자
		// public - 누구나 접근 가능
		// protected - 같은 패키지 + 상속 관계
		// default - 같은 패키지
		// private - 자기 자신만
		
		Test052101 t = new Test052101();
//		System.out.println(Test.num1); // 바로 쓰려면 밑처럼 static을 붙여야함
//		System.out.println(Test.num2);
//		System.out.println(t.num3); // private이 붙은 애는 다른 클래스에서 사용 불가
		t.changeNum(); // 이건 public 변수니까 사용 가능!
		t.printNum();
		
		t.setName("홍길동");
		
		String n = t.getName();
		
		System.out.println(n);
		
	}

}

class Test052101 {
	int num1 = 10;
	static int num2 = 20;
	private int num3 = 30;
	
	// 내가 만드는 변수들은 private 붙이기! 대신 다른 사람이 볼 수 있도록 세터와 게터 만들기
	
	// ==================================
	
	private String name = "eee";
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	// getter
	public String getName() {
		return this.name;
	}
	
	// ==================================
	
	void changeNum() {
		this.num3 = 100;
	}
	
	void setNum(int num) {
		if(num<0) {
			System.out.println("음수는 안 됩니다.");
			return;
		}
		this.num3 = num;
	}
	
	void printNum() {
		System.out.println(this.num3);
	}
}

class Test052102 {
	private int data1;
	private String data2;
	private float data3;
	private int data4;
	
	// 위 메뉴 Source > Generate Getters and Setters... 원하는 것들 눌러서 만들면 자동으로 만들어짐!
	public int getData1() {
		return data1;
	}
	public void setData1(int data1) {
		this.data1 = data1;
	}
	public String getData2() {
		return data2;
	}
	public void setData2(String data2) {
		this.data2 = data2;
	}
	public float getData3() {
		return data3;
	}
	public void setData3(float data3) {
		this.data3 = data3;
	}
	public int getData4() {
		return data4;
	}
	public void setData4(int data4) {
		this.data4 = data4;
	}
}