
public class JavaDay5_1 {

	public static int test(int num) {
//		System.out.println(num * num);
		return num*num;
	}
	
	// ==========================================
	
	// ����1.
	
	public static int func1() {
		return 10;
	}
	
	public static int func2(int num) {
		return num;
	}
	
	public static int func3(int num) {
		return num*num;
	}
	
	public static int func4(int num1, int num2) {
		return num1 + num2;
	}
	
	// ����2.
	
	public static int plus(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int minus(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int multiple(int num1, int num2) {
		return num1 * num2;
	}
	
	public static int divide(int num1, int num2) {
		return num1 / num2;
	}
	
	public static int square(int num) {
		return num * num;
	}
	
	
	
	
	public static void main(String[] args) {
		
		// �Լ�
		// 1. ����
		// 2. ȣ��
		// 3. �Ű�����
		// 4. ����
		// �Ű������� ������ �Լ��� �Լ��� ������ ��ȯ
		
		System.out.println(test(5)*3);
		
		// ========================================
		
		// ����1. 
		
		int a = func1();
	    System.out.println(a);
	    // ��� : 10
	    int b = func1();
	    System.out.println(b);
	    // ��� : 10
		
	    int c = func2(22);
	    System.out.println(c);
	    // ��� : 22
	    int d = func2(55);
	    System.out.println(d);
	    // ��� : 55

	    int e = func3(10);
	    System.out.println(e);
	    // ��� : 100
	    int f = func3(5);
	    System.out.println(f);
	    // ��� : 25
	    
	    int g = func4(10, 30);
	    System.out.println(g);
	    // ��� : 40
	    int h = func4(20, 50);
	    System.out.println(h);
	    // ��� : 70
	    
	    
	    // ����2.
	    
	    int rst1 = plus(10, 20);
	    System.out.println(rst1);  // ��� : 30

	    int rst2 = minus(10, 20);
	    System.out.println(rst2); // ��� : -10

	    int rst3 = multiple(5, 4);
	    System.out.println(rst3); // ��� : 20

	    int rst4 = divide(10, 3);
	    System.out.println(rst4); // ��� : 3

	    int rst5 = square(5);
	    System.out.println(rst5); // ��� : 25
	    
	    
	    
	    
	    
	}

}
