import java.time.LocalDate;

public class Java2Day4_2 {

	public static void main(String[] args) {
		// 2���� Ÿ��
		// �⺻Ÿ��
		
		int num = 10; // ����		
		Integer num_ = 20; // ����
		
		int[] arr1 = {1, 2, 3, 4, 5};
		
		int k = arr1[2];
		
		System.out.println(k);
		
		k = 10;
		
		System.out.println(k);
		System.out.println(arr1[2]);

		System.out.println("===========================");
		
		// ��üŸ��
		
		MyNum num1 = new MyNum(1);
		MyNum num2 = new MyNum(2);
		MyNum num3 = new MyNum(3);
		MyNum num4 = new MyNum(4);
		MyNum num5 = new MyNum(5);
		
		MyNum[] arr2 = {num1, num2, num3, num4, num5};
		
		MyNum rst = arr2[2];
		
		System.out.println(arr2[2].num);
		
		rst.num = 10;
		
		System.out.println(rst.num);
		System.out.println(arr2[2].num);
		
		LocalDate now = LocalDate.now();
		System.out.println(now);
	}

}


class MyNum {
	int num;
	
	public MyNum(int num) {
		this.num = num;
	}
}