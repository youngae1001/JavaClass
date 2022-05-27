import java.util.ArrayList;

public class Java2Day1_1 {

	public static void main(String[] args) {
		
		// �迭�� ������ �����ϰ� ���ϰ� ��� ������ ���屸�� ���� -> ArrayList
		// ArrayList -> JAVA API, �迭�� Ȯ��, ����, �������� ����� ó��
		
		// ArrayList�� ��� �ڷ����� �迭�� ���� �� ������ �ڷḦ �ҷ��� �� �ƹ����Գ� �־������ ���߿� �ڷḦ �ҷ��� �� �ش� �ε����� � �ڷ������� �Ǿ��ִ��� �� ����ϱ� �����
		// ���� �迭�� �ڷ����� �����ؼ� ����� -> ArrayList<�ڷ���>
		
		// �⺻Ÿ�� -> int, float, double, boolean (���������� ����)
		// ��üŸ�� -> �⺻Ÿ���� ������ ��� �� (���������� ����)
		
		// ArrayList<�ڷ���>������ �ڷ��� �ڸ����� ������ ��üŸ���� �־�� ��
		// �⺻Ÿ���� ��üŸ������ ��Ÿ���� ��� => ����Ŭ����
		// int -> Integer
		// double -> Double
		
		int num1 = 10;
		System.out.println(num1);
		
		Integer num2 = 20;
		System.out.println(num2);
		
		Integer num3 = num1;
		System.out.println(num3);
		
		// �������� �迭
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(13);
		list.add(23);
		// ���� �迭 : [3, 13, 23]

		int rst = list.get(1);
		
		System.out.println("1. " + rst);
		
		// Create, Read, Update, Delete - �߰�, ��ȸ, ����, ����
		// �� �� ������ Ȯ���� ������ �������� ��Ī�ؼ� �� �� ������ ��
		// ���� -> ArrayList������ �޼ҵ�
		// Create -> �߰� : add(�߰��� ��)
		// Read -> ��ȸ : get(������ �������� �ε���)
		// Update -> ���� : set(������ �������� �ε���, ���ο� ��)
		// Delete -> ���� : remove(������ �������� �ε���)
		// ������ ���� ���� -> ������ : size()
		
		// add�� �ѹ��� �������� ���� �� ����. �ѹ��� �ϳ���!
		list.add(8);
		
		list.set(1, 33);
		
		int rst2 = list.get(1);
		System.out.println("2. " + rst2);
		
		list.remove(1); // [3, 23, 8]
		
		int rst3 = list.get(1);
		System.out.println("3. " + rst3);
		
		int size = list.size();
		
		System.out.println(size);
		// ��ü ���
		System.out.println("===== ��ü��� =====");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("=== �������� ���� ===");
		
		
		// ==================================================
		// ����1.
		System.out.println("== ����1 ==");
		
		// {5,4,3,2,1,0}�� ArrayList�� �߰� ���ּ���.
		// ArrayList�� ����� ������ּ���.
		// ArrayList�� 3,4��° ���� �о ������ּ���.
		// 1,2��° ���� ���� ��, �ٽ� 3,4��° ���� ������ּ���
		// List�� ��� ���� toString Ȥ�� �׳� ����Ʈ���� �Է��Ͽ� ������ּ���.
		
		// ������ ������ �� �ִ� ArrayList�� �����ϰ� ������ּ���.
		ArrayList<Integer> exam1 = new ArrayList<Integer>();
	    // ����Ʈ�� ���� �߰����ּ���.
		exam1.add(5);
		exam1.add(4);
		exam1.add(3);
		exam1.add(2);
		exam1.add(1);
		exam1.add(0);


	    // size()
			// ����Ʈ�� ����� ������ֽð�, ���� 6�� �´ٸ� ��� �������ּ���.
	    // ��°�� : 6
		int exam1_size = exam1.size();
		System.out.println(exam1_size);

	    // get()
			// ����Ʈ�� 3,4��° ���� ������ּ���.
	    // ��°�� : 3, 2
		int exam1_3 = exam1.get(2);
		int exam1_4 = exam1.get(3);
		System.out.println(exam1_3 + ", " + exam1_4);

	    // remove()
			// ����Ʈ�� 1,2��° ���� ���� ��, �ٽ� 3,4��° ���� ������ֽð� � ��ȭ�� �ִ��� üũ���ּ���.
	    // ��� ��� : 1, 0
		exam1.remove(0);
		exam1.remove(0); // �տ��� �ε��� 0��° ���� ��������, ������ �ε��� 1,2,3,4,5��°���� �ε����� �ϳ��� ������ -> ���� �ε������� 1��°�� �ִ� �����ʹ� ���� 0��° �ε���
		int exam1_new3 = exam1.get(2);
		int exam1_new4 = exam1.get(3);
		System.out.println(exam1_new3 + ", " + exam1_new4);

	    // �ݺ������� ���.
	    // 
			// ����Ʈ�� ��� ���� ������ּ���.
	    // ��� ��� : 3, 2, 1, 0
		for(int i=0; i<exam1.size(); i++) {
			System.out.printf("%d ", exam1.get(i));
		}
		System.out.println();
		
		
		
		// ����2
		System.out.println("== ����2 ==");
		// ����
		// �̸��� ������ �� �ִ� ArrayList�� �����ϰ� ������ּ���.
		ArrayList<String> exam2 = new ArrayList<String>();


		// add()
		// ����Ʈ�� ���� �߰����ּ���.
		// "ȫ�浿", "�̼���", "Ȳ����", "�Ӳ���", "������", "��������" �� ArrayList�� �߰� ���ּ���.
		exam2.add("ȫ�浿");
		exam2.add("�̼���");
		exam2.add("Ȳ����");
		exam2.add("�Ӳ���");
		exam2.add("������");
		exam2.add("��������");

		// size()
		// ����Ʈ�� ����� ������ֽð�, ���� 6�� �´ٸ� ��� �������ּ���.
		// ��°�� : 6
		int exam2_size = exam2.size();
		System.out.println(exam2_size);

		// get()
		// ����Ʈ�� 2,3 �ε����� ���� ������ּ���.
		// ��°�� : Ȳ����, �Ӳ���
		String exam2_index2 = exam2.get(2);
		String exam2_index3 = exam2.get(3);
		
		System.out.printf("%s, %s\n", exam2_index2, exam2_index3);
		
		// ����Ʈ�� ��� ���� ������ּ���.
		// ��� ��� : ȫ�浿 �̼��� Ȳ���� �Ӳ��� ������ ��������
		for(int i=0; i<exam2.size(); i++) {
			System.out.printf("%s ", exam2.get(i));
		}
		
		System.out.println();
		
		// remove()
		// ����Ʈ���� ȫ�浿, �̼����� ���� ��, �ٽ� 2,3 �ε����� ���� ������ֽð� � ��ȭ�� �ִ��� üũ���ּ���.
		// ��� ��� : ������, ��������
		exam2.remove(1);
		exam2.remove(0);
		
		String exam2_newIndex2 = exam2.get(2);
		String exam2_newIndex3 = exam2.get(3);
		
		System.out.printf("%s, %s\n", exam2_newIndex2, exam2_newIndex3);

		// ����Ʈ�� ��� ���� ������ּ���.
		// ��� ��� : Ȳ���� �Ӳ��� ������ ��������
		for(int i=0; i<exam2.size(); i++) {
			System.out.printf("%s ", exam2.get(i));
		}
		
		System.out.println();

		// add()
		// ����Ʈ�� ������� �߰������ּ���.
		exam2.add("�����");

		// ����Ʈ�� ��� ���� ������ּ���.
		// ��� ��� : Ȳ���� �Ӳ��� ������ �������� �����
		for(int i=0; i<exam2.size(); i++) {
			System.out.printf("%s ", exam2.get(i));
		}
		
		System.out.println();

		// set()
		// �Ӳ����� ���������� �Ż��Ӵ�� ���������� �ٲ��ּ���.
		exam2.set(1, "�Ż��Ӵ�");
		exam2.set(3, "������");		
		
		// ����Ʈ�� ��� ���� ������ּ���.
		// ��� ��� : Ȳ���� �Ż��Ӵ� ������ ������ �����
		for(int i=0; i<exam2.size(); i++) {
			System.out.printf("%s ", exam2.get(i));
		}
		
		System.out.println();

		// ����Ʈ���� Ȳ���� �Ż��Ӵ� �������� ������ּ���.
		// ��� ��� : Ȳ���� �Ż��Ӵ� ������
//		String exam2_0 = exam2.get(0);
//		String exam2_1 = exam2.get(1);
//		String exam2_3 = exam2.get(3);
//		
//		System.out.printf("%s %s %s", exam2_0, exam2_1, exam2_3);
		
		for(int i=0; i<exam2.size(); i++) {
			String name = exam2.get(i);
			
			// ���ڿ� �񱳴�(��ü ��)�� ==�� �ƴ϶� equals() ���. ==�� �⺻Ÿ���� �� ���
			if(name.equals("Ȳ����") || name.equals("�Ż��Ӵ�") || name.equals("������")) {
				System.out.printf("%s ", name);
			}
		}
	}

}

// ArrayList��?
// class ArrayList {
//	int[] arr = new int[10];
//	int size= 0;
//	
//	void add(int data) {
//		
//	}
//	
//	void get(int index) {
//		
//	}
//	
//	void remove(int index) {
//		
//	}
//}