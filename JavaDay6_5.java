
public class JavaDay6_5 {
	
//	public static void introduce(int age, String name) {
//		System.out.printf("�ȳ��ϼ��� %d�� %s�Դϴ�.\n", age, name);
//	}
	
	// Hong Ŭ������ int, String�� �����ֱ� ������ �ڷ����� �������ֱ� �ָ��� -> ���� �������� �̸�(Hong)�̶� ��
	public static void introduce(Hong hong) {
		System.out.printf("�ȳ��ϼ��� %d�� %s�Դϴ�.\n", hong.age, hong.name);
	}

	public static void main(String[] args) {
		
		// Ŭ������ ��ü
		
		// ���
		// ����, �̸�
		
		// 22�� ȫ�浿
//		int age = 22;
//		String name = "ȫ�浿";
		
		// 33�� �̼���
//		int age2 = 33;
//		String name2 = "�̼���";

		// �ڱ�Ұ�
//		introduce(age, name);
//		introduce(age2, name2);
		// �̶� �� ����� ������ �� ������ �����Ѵٸ� introduce(age, name2)�� ���� �Ǽ��� �Ͼ �� ����
		
//		introduce(Hong.age, Hong.name);
//		introduce(Lee.age, Lee.name);
		
		Hong h = new Hong(); // new��? -> Hong()�̶�� �ٱ��ϸ� ����ڴٴ� �� -> �̸� �̿��� �ѹ��� �������� ������ �̵� ����
		
		introduce(h);
//		introduce(Lee);
		
	}

}


class Hong {
	static int age = 22;
	static String name = "ȫ�浿";
}

class Lee {
	static int age = 33;
	static String name = "�̼���";
}






