import java.util.Scanner;
import java.util.Random;

public class JavaLottery {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
        // random객체는 난수를 발생시켜준다.
        // 사용법.
        // random.nextInt(n) -> 0 ~ n 사이의 정수중 랜덤하게 하나 리턴
        // ex)
        // int num = random.nextInt(30);
        // System.out.println(num); // 0 ~ 30 사이의 정수중 랜덤하게 하나 출력
		
		

		int[] lottoNums = new int[7]; // 1등 당첨 번호
        int length = lottoNums.length;

        // 아래와 같이 결과가 출력되도록 로또 당첨 번호 7개(보너스 번호 포함)를 선택해주세요.
        // 1. 여기에 당첨 번호 추출 코드 작성해주세요.
        // ** 중복된 번호는 없어야 됨.
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
        // 한참 더 해야됨

        // ======================================================================================


        // 1 출력 코드
        // ======================================================================================
//        System.out.print("선택된 로또 번호 : ");
        
        for(int i=0; i<length; i++) {        	
        	System.out.printf("%d ", lottoNums[i]);
        }



        // ======================================================================================

        // 출력결과
        // 당첨 번호 : 43, 32, 25, 19, 15, 7, 보너스 번호 : 36
		
	}

}
