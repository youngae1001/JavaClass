
public class Java2Day4_1 {

	public static void main(String[] args) {

		// ���� ����ؾ� �ϴ� �� : �Լ��� �ߺ�!
		
		ȫ�浿 ȫ�浿1 = new ȫ�浿();
		
		ȫ�浿1.intro();
		ȫ�浿1.�ڹ�();
		
		ȫ��� ȫ���1 = new ȫ���();
		ȫ���1.���̽�();
		
		ȫ�浿1.���̽�();
		
	}

}

class ȫ�浿 {
	
	ȫ��� ȫ���1 = new ȫ���();
	
	public void intro() {
		String name = getName();
		
		System.out.printf("�ȳ��ϼ���. %s�Դϴ�.\n", name);
	}
	
	public String getName() {
		return "ȫ�浿";
	}
	
	public void �����() {
		System.out.println("����� ����10");
	}
	
	public void �ڹ�() {
		System.out.println("�ڹ� ����1.8");
	}
	
	public void ���̽�() {
		ȫ���1.���̽�();
	}
}

class ȫ��� {
	
	public void �����() {
		System.out.println("����� ����10");
	}
	
	public void ���̽�() {
		System.out.println("���̽� ����3.10");
	}
	
}