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
        
//        while(true) {
//        	for(int i=0; i<lottoNums.length-1; i++) {        	
//        		if(lottoNums[i] == lottoNums[i+1]) {
//        			lottoNums[i+1] = random.nextInt(45);
//        		}
//        	}
//        	for(int i=0; i<lottoNums.length-1; i++) {        		
//        		if(lottoNums[i] != lottoNums[i+1]) {
//        			break;
//        		}
//        	}
//        }

        
        for(int j=lottoNums.length-1; j>1; j--) { // ���⼭ j�� j>0���� ���� �ʴ� ���� : �ڿ� 7���� ��Ŀ�� �ΰ� �����۾��ϸ� �ڿ����� ù��° �Ŵ� ���ĵǾ�����
			for(int i=0; i<j; i++) {
				int swap=lottoNums[i];
				if(lottoNums[i+1]<swap) {
					lottoNums[i]=lottoNums[i+1];
					lottoNums[i+1]=swap;
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
