import java.util.Scanner;

public class JavaDay6_1 {	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
//		// ����1. Scanner�� �̿��ؼ� �Ʒ��� ���� ����� �Ͽ� ��Ģ������ �������ּ���.
//		// ����� ����
//		// ù��° ���ڸ� �Է����ּ���: 12
//		// �ι�° ���ڸ� �Է����ּ���: 33
//		// 12 + 33 = 45
//				
//		System.out.printf("ù��° ���ڸ� �Է����ּ��� : ");
//		int num1 = Integer.parseInt(scan.nextLine());
//		
//		System.out.printf("�ι�° ���ڸ� �Է����ּ��� : ");
//		int num2 = Integer.parseInt(scan.nextLine());
//		
//		System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
//		
//		System.out.println();
//		
		
//		// ����2. �̸��� ���̸� �Է°����� �޾� �ڱ�Ұ��� ���ּ���.
//		System.out.println("�̸��� �Է����ּ���:");
//		String name = scan.nextLine();
//		
//	    System.out.println("���̸� �Է����ּ���:");
//	    int age = Integer.parseInt(scan.nextLine());
//	    
//	    System.out.printf("�ȳ��ϼ��� %d�� %s�Դϴ�.", age, name);
//	    
//	    // �̸��� �Է����ּ��� : ȫ�浿
//	    // ���̸� �Է����ּ��� : 29
//	    // ��� : �ȳ��ϼ��� 29�� ȫ�浿�Դϴ�.
	    
	    
	    // ����3. Scanner�� �̿��� �Է°��� �޾�
	    // �������� ���ϴ� ���� ������ ���ּ���.

	    //����) ���ϴ� ���� �Է����ּ��� : 4 (�Է��� ����)
		// 4�� ���.
	    
//		System.out.print("���ϴ� ���� �Է����ּ��� : ");
//	    int dan = Integer.parseInt(scan.nextLine());
//	    
//	    for(int i=1; i<10; i++) {
//	    	System.out.printf("%d X %d = %d\n", dan, i, dan*i);
//	    }

	    // �ݺ� ������ ���ָ� ���ѹݺ� - for(int i=0; ; i++){}
	    
	    // �ݺ����� �߰��� �����ϴ� ��� -> break;
	    // break => �ݺ��� ���� ����
	    
		System.out.println("������ ���α׷��� �����մϴ�.");		
	    for(int i = 0; ; i++) {
	    	System.out.print("���ϴ� ���� �Է����ּ���(0�� �Է��ϸ� ����˴ϴ�) : ");
		    int dan = Integer.parseInt(scan.nextLine());
		    
		    if(dan == 0) {
		    	System.out.println("������ ���α׷��� �����մϴ�.");
		    	break;
		    }
		    
		    for(int j=1; j<10; j++) {
		    	System.out.printf("%d X %d = %d\n", dan, j, dan*j);
		    }
	    }
	    
	    
	    
	    
	    
	}

}
