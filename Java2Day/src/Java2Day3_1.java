
public class Java2Day3_1 {

	public static void main(String[] args) {

		// ����������
		// public - ������ ���� ����
		// protected - ���� ��Ű�� + ��� ����
		// default - ���� ��Ű��
		// private - �ڱ� �ڽŸ�
		
		Test052101 t = new Test052101();
//		System.out.println(Test.num1); // �ٷ� ������ ��ó�� static�� �ٿ�����
//		System.out.println(Test.num2);
//		System.out.println(t.num3); // private�� ���� �ִ� �ٸ� Ŭ�������� ��� �Ұ�
		t.changeNum(); // �̰� public �����ϱ� ��� ����!
		t.printNum();
		
		t.setName("ȫ�浿");
		
		String n = t.getName();
		
		System.out.println(n);
		
	}

}

class Test052101 {
	int num1 = 10;
	static int num2 = 20;
	private int num3 = 30;
	
	// ���� ����� �������� private ���̱�! ��� �ٸ� ����� �� �� �ֵ��� ���Ϳ� ���� �����
	
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
			System.out.println("������ �� �˴ϴ�.");
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
	
	// �� �޴� Source > Generate Getters and Setters... ���ϴ� �͵� ������ ����� �ڵ����� �������!
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