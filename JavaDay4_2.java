
public class JavaDay4_2 {
	
	// ����(�Լ� ����)(Ŭ���� �ȿ� ��ߵ�)
	public static void test() {
		System.out.println("test �Լ�");
		System.out.println("hi");
		System.out.println("nice to meet you");
		System.out.println("bye");
	}
	
	public static void test2() {
		System.out.println("�ȳ�");
		System.out.println("������ �ݰ���");
		System.out.println("�߰�");
	}
	
	// =============================================
	
	// ���� 1
	
	public static void hi1() {
        System.out.println("���� �������Դϴ�.");
    }

    public static void hi2() {
        System.out.println("�ȳ��ϼ���.");
    }

    public static void hi3() {
        System.out.println("���α׷��� �����ƿ�.");
    }

    public static void hi4() {
        System.out.println("�ڹٸ� ����");
    }
    
    
    // ���� 2
    
    public static void hi() {
    	System.out.println("�ȳ��ϼ���. ���� ȫ�浿�Դϴ�. �ߺ�Ź�帳�ϴ�.");
    }
    
    public static void bye() {
    	System.out.println("�ȳ��� ������. ������ �� ����!");
    }
    
    // ==============================================
	
	// main �Լ�(�޼���)
	public static void main(String[] args) {

//		// ���� ����
//		
//		int num=2;
//		System.out.println(num);
//		System.out.println(num);
//		System.out.println(num);
//		
		// �Լ� -> ������ �����ϰ� ������ �����ϴ� ��ü
		// �Լ��� ����ϴ� ���� -> ���� �д�ż� å�Ӽ��簡 ��Ȯ
		// ������ ������ ����
		
		test(); // ȣ��(�Լ� ȣ��)
		System.out.println("�ڵ�1");
		test2();
		System.out.println("�ڵ�2");
		test();
		System.out.println("�ڵ�3");
		
		
		// ============================================================
		
		// ����1. �޼��带 �ùٸ��� ȣ���ؼ� �Ʒ�ó�� ��µǰ� ���ּ���.

	    // �ȳ��ϼ���!! 
	    // ���� �������Դϴ�.
	    // �ڹٸ� ����
	    // ���α׷��� �����ƿ�.
		
		hi2();
		hi1();
		hi4();
		hi3();
		
		
		// ����2. �޼��带 ������
		
		hi(); // �ȳ��ϼ���. ���� ȫ�浿�Դϴ�. �ߺ�Ź�帳�ϴ�.
	    bye(); // �ȳ��� ������. ������ �� ����!
	    
	    
	    
	    // ��Ʈ�� + ����Ʈ + F : �ڵ� �ٸ���
	}

}
