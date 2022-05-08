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

        
        for(int j=lottoNums.length-1; j>1; j--) { // 여기서 j를 j>0으로 하지 않는 이유 : 뒤에 7개에 포커스 두고 정렬작업하면 자연스레 첫번째 거는 정렬되어있음
			for(int i=0; i<j; i++) {
				int swap=lottoNums[i];
				if(lottoNums[i+1]<swap) {
					lottoNums[i]=lottoNums[i+1];
					lottoNums[i+1]=swap;
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
