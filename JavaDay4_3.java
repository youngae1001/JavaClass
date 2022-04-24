
public class JavaDay4_3 {
	
	public static void gugu2() {
		int dan2=2;
		for(int i=1; i<10; i++) {
			System.out.printf("%d X %d = %d\n", dan2, i, dan2*i);
		}
		System.out.println();
	}
	
	public static void gugu3() {
		int dan3=3;
		for(int i=1; i<10; i++) {
			System.out.printf("%d X %d = %d\n", dan3, i, dan3*i);
		}
		System.out.println();
	}
	
	public static void gugu(int dan) { // �Ű������� ������ �Լ�
		for(int i=1; i<10; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, dan*i);
		}
		System.out.println();
	}
	
	public static void gugu2(int dan, int gob) { // �Ű����� �������� ������ �Լ�
		for(int i=1; i<=gob; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, dan*i);
		}
		System.out.println();
	}
	
	public static void print(int num) {
		System.out.println(num);
	}
	
	public static void introduce() {
		for(int i=0; i<10; i++) {
			System.out.println("�ȳ��ϼ���. ���� 20�� ȫ�浿�Դϴ�.!");
		}
	}
	
	public static void introduce(int many) {
		for(int i=0; i<many; i++) {
			System.out.println("�ȳ��ϼ���. ���� 20�� ȫ�浿�Դϴ�.!");
		}
	}
	
	public static void greeting1(int what) {
		if(what == 1) {
			System.out.println("�ȳ��ϼ���");
		}
		if(what == 2) {
			System.out.println("����~");
		}
		if(what == 3) {
			System.out.println("����");
		}
	}
	
	public static void greeting2(int what, int many) {
		for(int i=0; i<many; i++) {			
			if(what == 1) {
				System.out.println("�ȳ��ϼ���");
			}
			if(what == 2) {
				System.out.println("����~");
			}
			if(what == 3) {
				System.out.println("����");
			}
		}
	}

	public static void main(String[] args) {
		
		// ������
		gugu2();
		gugu3();
		
		gugu(5); // �갡 ������ ���� gugu2(), gugu3() �Լ��� �ʿ����
		gugu2(2,5);
		
		
		// ===========================================================
		
		// ����1. ���� �ڵ尡 �ǵ���� ��µǵ��� �Լ��� ����ÿ�
		
		System.out.println("����1");
		print(4); // ���: 4
	    print(10); // ���: 10
	    print(100); // ���: 100
	    
	    System.out.println();
	    
	    
	    // ����2. ���� �ڵ尡 �ǵ���� ��µǵ��� �Լ��� ����ÿ�
	    
	    System.out.println("����2");
	    introduce();
	    // �ȳ��ϼ���. ���� 20�� ȫ�浿�Դϴ�.!
	    // �ȳ��ϼ���. ���� 20�� ȫ�浿�Դϴ�.!
	    // �ȳ��ϼ���. ���� 20�� ȫ�浿�Դϴ�.!
	    // �ȳ��ϼ���. ���� 20�� ȫ�浿�Դϴ�.!
	    // �ȳ��ϼ���. ���� 20�� ȫ�浿�Դϴ�.!
	    // �ȳ��ϼ���. ���� 20�� ȫ�浿�Դϴ�.!
	    // �ȳ��ϼ���. ���� 20�� ȫ�浿�Դϴ�.!
	    // �ȳ��ϼ���. ���� 20�� ȫ�浿�Դϴ�.!
	    // �ȳ��ϼ���. ���� 20�� ȫ�浿�Դϴ�.!
	    // �ȳ��ϼ���. ���� 20�� ȫ�浿�Դϴ�.!
	    
	    System.out.println();
	    
	    
	    // ����3. ���� �ڵ尡 �ǵ���� ��µǵ��� �Լ��� ����ÿ�
	    
	    System.out.println("����3");
	    
	    introduce(3);

	    // �ȳ��ϼ���. 20�� ȫ�浿�Դϴ�.!
	    // �ȳ��ϼ���. 20�� ȫ�浿�Դϴ�.!
	    // �ȳ��ϼ���. 20�� ȫ�浿�Դϴ�.!
	    
	    System.out.println();

	    introduce(5);
	    // �ȳ��ϼ���. 20�� ȫ�浿�Դϴ�.!
	    // �ȳ��ϼ���. 20�� ȫ�浿�Դϴ�.!
	    // �ȳ��ϼ���. 20�� ȫ�浿�Դϴ�.!
	    // �ȳ��ϼ���. 20�� ȫ�浿�Դϴ�.!
	    // �ȳ��ϼ���. 20�� ȫ�浿�Դϴ�.!
	    
	    System.out.println();

	    introduce(10);
	    // �ȳ��ϼ���. 20�� ȫ�浿�Դϴ�.!
	    // �ȳ��ϼ���. 20�� ȫ�浿�Դϴ�.!
	    // �ȳ��ϼ���. 20�� ȫ�浿�Դϴ�.!
	    // �ȳ��ϼ���. 20�� ȫ�浿�Դϴ�.!
	    // �ȳ��ϼ���. 20�� ȫ�浿�Դϴ�.!
	    // �ȳ��ϼ���. 20�� ȫ�浿�Դϴ�.!
	    // �ȳ��ϼ���. 20�� ȫ�浿�Դϴ�.!
	    // �ȳ��ϼ���. 20�� ȫ�浿�Դϴ�.!
	    // �ȳ��ϼ���. 20�� ȫ�浿�Դϴ�.!
	    // �ȳ��ϼ���. 20�� ȫ�浿�Դϴ�.!
	    
	    System.out.println();
	    
	    // ����4. ���� �ڵ尡 �ǵ���� ��µǵ��� �Լ��� ����ÿ�
	    
	    System.out.println("����4");
	    greeting1(2);
	    // ����~

	    greeting1(3);
	    // ����

	    greeting1(1);
	    // �ȳ��ϼ���
	    
	    System.out.println();

	    greeting2(1, 3); 
	    // �ȳ��ϼ���
	    // �ȳ��ϼ���
	    // �ȳ��ϼ���

	    greeting2(2, 5); 
	    // ����~
	    // ����~
	    // ����~
	    // ����~
	    // ����~

	    greeting2(3, 7); 
	    // ����
	    // ����
	    // ����
	    // ����
	    // ����
	    // ����
	    // ����
	    
	}

}
