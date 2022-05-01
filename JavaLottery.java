import java.util.Scanner;
import java.util.Random;

public class JavaLottery {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
        // random��ü�� ������ �߻������ش�.
        // ����.
        // random.nextInt(n) -> 0 ~ n ������ ������ �����ϰ� �ϳ� ����
        // ex)
        // int num = random.nextInt(30);
        // System.out.println(num); // 0 ~ 30 ������ ������ �����ϰ� �ϳ� ���
		
		

		int[] lottoNums = new int[7]; // 1�� ��÷ ��ȣ
        int length = lottoNums.length;

        // �Ʒ��� ���� ����� ��µǵ��� �ζ� ��÷ ��ȣ 7��(���ʽ� ��ȣ ����)�� �������ּ���.
        // 1. ���⿡ ��÷ ��ȣ ���� �ڵ� �ۼ����ּ���.
        // ** �ߺ��� ��ȣ�� ����� ��.
        // ======================================================================================           

        for(int i=0; i<length ;i++) {
        	lottoNums[i] = random.nextInt(45);
        }
        
        int swap = lottoNums[0];
        
        for(int j=0; j<length; j++) {
        	for(int i=1; i<length-1; i++) {
        		if(lottoNums[i]<swap) {
        			lottoNums[i-1] = lottoNums[i];
        			lottoNums[i] = swap;
        		}
        	}        	
        }
        // ���� �� �ؾߵ�

        // ======================================================================================


        // 1 ��� �ڵ�
        // ======================================================================================
//        System.out.print("���õ� �ζ� ��ȣ : ");
        
        for(int i=0; i<length; i++) {        	
        	System.out.printf("%d ", lottoNums[i]);
        }



        // ======================================================================================

        // ��°��
        // ��÷ ��ȣ : 43, 32, 25, 19, 15, 7, ���ʽ� ��ȣ : 36
		
	}

}
