
public class JavaDay3_1 {

	public static void main(String[] args) {
		
		// Day2 �������� �� Ǭ �� Ǯ���!
		
		// �̹� ������ Array
		
		// �迭
		// ���� �����͸� �����ϰ� ó���ϱ� ���� ���
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		// ������ ����ϸ� �����Ͱ� �������� �� ������ �����
		
		int[] numArr = {10, 20, 30, 40, 50}; // ���� �迭

		// �迭�� ��谪�� �׻� ����
		// ���� -> 0
		// �� -> �迭�� ���� - 1
		System.out.println(numArr[4]); // �迭�� ������ 0���� ����
		
		// Ÿ���� ���ƾ� ��
//		String[] StrngArr = {"aa", "bb", "cc", 10}; // �� ��. ���ڿ������� ���ڸ� �Է�
		
		// �迭�� �ٽ� ��� �ΰ��� -> �ڷ���(Ÿ��), ����
		
		// ����� �Է�, ���� ������, �����ͺ��̽� ������ ��� �۾��ڰ� ���� �Է��ϴ� ���� �ƴ� �ܺ� �����͸� �ҷ��� �� ���� ���
		
		int[] intArr = new int[100]; // �迭�� ����� �Ϲ����� ���
		// ��� �ϸ� 0�� 100���� ����ִ� �迭�� �������
		System.out.println(intArr[99]);
		
		
		// 1. ���� �迭�� 0���� �ʱ�ȭ
		// 2. �׿� �迭�� null�� �ʱ�ȭ
		// null -> '�����Ͱ� ����(�������)'�� ��������� ǥ��
		
		String[] strArr = new String[10];
		System.out.println(strArr[0]);
		
		// ����
		strArr[0] = "hello";
		String str1 = strArr[0];
		System.out.println(str1);
		
		strArr[1] = "bye";
		strArr[2] = "haha";
		
		// �ϰ� ��ȸ -> ���� �ݵ�� �ݺ����� �Բ� ����
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		System.out.println(strArr[2]);
		System.out.println(strArr[3]);

		for(int i=0; i<10; i++) {
			System.out.println(strArr[i]);
		}
		
		// �迭�� ���� ������ ���� -> �迭�̸�.length �ϸ� �� �� ����
		System.out.println(strArr.length);
		System.out.println(intArr.length);
		
		// ���� �ݺ����� ����� �� �̸� ����ϸ� ���� �迭�� ���̰� ������ ���� �� �ʿ䰡 ����!
		
		// �迭 ��ü ��ȸ
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		// =====================================================================
		
		// ���� 1 : Arr �迭�� 10, 20, 30, 40, 50, 60, 70, 80, 90, 100�� �����ϰ� ������ּ���.
		
		// ���1
		
		int[] Arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		for(int i=0; i<Arr.length; i++) {
			System.out.print(Arr[i] + " ");
		}
		
		System.out.println();
		
		// ���2
		
		int[] Arr2 = new int[10];
		
		for(int i=0; i<10; i++) {
			Arr2[i] = i*10+10;
		}
		
		for(int i=0; i<Arr2.length; i++) {
			System.out.print(Arr2[i]+" ");
		}
		
		System.out.println();
		
		// ���� 2 : �迭�� �ι� ������ּ���.
		int[] arr = {1,2,3,4,5};
		
		for(int j=0; j<2; j++) {
			for(int i=0; i< arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
		
//		// ���� 3 : �迭�� �̿��� 5���� ���ڸ� �Է¹ް� ������ּ���.
//		int[] arrNum = new int[5];
//
//		// ���� 4 : �迭�� �̿��� 5���� ���ڸ� �Է¹ް� ������ּ���.
//		String[] arrStr = new String[5];
		
		// 3, 4���� ���� �� ��� ������!
		
		// ���� 5 : �迭�� 5���� ���� �Է��ϰ� �Ųٷ� ������ּ���.
		int[] arr5Num = {1, 2, 3, 4, 5};
		
		for(int i=4; i>=0; i--) {
			System.out.print(arr5Num[i] + " ");
		}

		System.out.println();
		
//		for(int i=arr5Num.length-1; i>=0; i--) {
//			System.out.print(arr5Num[i] + " ");
//		} // �̷��� �ص� ��! �迭�� ���̸� �� ��쳪 �׳��̳�
		
	}

}
