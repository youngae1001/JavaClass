
public class JavaDay5_2 {
	
	// �ڷ���
	
	public static int func1() {
		return 1;
	}
	
	public static double func2() {
		return 1.5;
	}
	
	public static String func3() {
		System.out.println("hi");
		
		return "hello";
//		System.out.println("hi"); // return�� �Լ��� ���Ḧ �ǹ��ϹǷ� return ������ ����� ������ �� ��
	}
	
	public static boolean func4() {
		return true;
	}
	
	public static void func5() {
		for(int i = 1; i < 10; i++) {
			if(i==5) {
				return; // �Լ��� ���Ḧ �ǹ��ϹǷ� �ݺ� Ƚ���� �����־ ���⼭ ����
			}
			System.out.println(i);
		}
	}
	
	public static int func6() {
		for(int i = 1; i < 10; i++) {
			if(i==5) {
				return 5; // �̶� ��ǻ�� ���忡���� i�� 5�� ���� ���� ���� �ִٰ� ���� -> �Ϲ����� ��쿣 � �� return�� ���� ��ߵ�
			}
			System.out.println(i);
		}
		return 0; // �� �κ� ������ �Լ� ����
	}

	// return�� �ִ� �Լ����� if���� �� ��� : return�� �� �Ǵ� ��찡 ������ �� ��(else�� ���� return���� ���� ��ߵȴٴ� ��) 
	
	// ==========================================================================================================
	
	public static boolean isNegative(int num) {
		
		// ���1
//		if(num<0) {
//			return true;
//		} else {
//			return false;
//		}
		
		// ���2
		if(num<0) {
			return true;
		}
		return false;
	}

	
	public static boolean isEven(int num) {
		if(num%2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void printEven(int n) {

	    // isEven �޼��带 �̿�. 
		
		for(int i = 1; i<=n; i++) {
			if(isEven(i)) {
				System.out.printf("%d ", i);
			}
		}
		System.out.println();
	}
	
	
	
	public static void main(String[] args) {
		
//		int i = 10;
//		double d = 10.1;
//		String s = "hello";
//		boolean b = true; // boolean�� true, false �������Ͽ� ���� ����. �̶� "true"ó�� ���������� ���� �� ��
		
		// ����, ������ => boolean
		
		
		System.out.println(1 > 10);
		System.out.println(1 < 10);
		
		System.out.println(false);
		System.out.println(true);

		System.out.println("false");
		System.out.println("true");
		
		
		func5();
		
		// ========================================================================
		
		// 0�� ����� ���ڽ��ϴ�.
		int no = -1;
		
		if(isNegative(no)) {
			
			System.out.println("�����Դϴ�.");
			
		} else {
			
			System.out.println("����Դϴ�.");
			
		}
		// no ���� �ٲ㰡�鼭 �׽�Ʈ�غ�����.
		
		
		// 1 ���� n���� �� �� ¦���� �͸� ���
		printEven(10); // ���: 2 4 6 8 10
	    printEven(20); // ���: 2 4 6 8 10 12 14 16 18 20
	    printEven(5); // ���: 2 4 
		
		
	}

}
