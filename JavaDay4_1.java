
public class JavaDay4_1 {

	public static void main(String[] args) {
		
		// ����. ���� �迭�� �����Ͻÿ�.
		
		int[] arr = {4, 1, 6, 3, 2, 8, 7, 5};
		
		// ���ĵ� �����ʹ� Ž���ӵ��� �е������� ����
		
		// ��ǰ�����ڵ� �ۼ�
		
		// 1. ���� ū ���� ���� �ڷ� ������(�� ��ü �˰��� ���)
		
		// ���1
//		for(int j=0; j<arr.length; j++) {
//			for(int i=0; i<arr.length-1; i++) {
//				int swap=arr[i];
//				if(arr[i+1]<swap) {
//					arr[i]=arr[i+1];
//					arr[i+1]=swap;
//				}
//			}
//			
//		}
		
		
		// ���2  �� ������� �갡 �� ȿ������ ����ε�
		for(int j=arr.length-1; j>1; j--) { // ���⼭ j�� j>0���� ���� �ʴ� ���� : �ڿ� 7���� ��Ŀ�� �ΰ� �����۾��ϸ� �ڿ����� ù��° �Ŵ� ���ĵǾ�����
			for(int i=0; i<j; i++) {
				int swap=arr[i];
				if(arr[i+1]<swap) {
					arr[i]=arr[i+1];
					arr[i+1]=swap;
				}
			}
			
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		
		System.out.println();

	}

}
