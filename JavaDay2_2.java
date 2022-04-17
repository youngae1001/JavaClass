
public class JavaDay2_2 {

	public static void main(String[] args) {
		
		// 반복문 -> while, for
		
		// 명령 n번 반복
		
		// 반복문 -> 반복 횟수를 세서 내가 원하는 횟수에서 멈춤
		
		// for(시작; 끝; 증가량)
//		for (int i=0; i<10; i++) {
//			System.out.println("hi");
//		}
//		
//		for (int i=100; i<=1000; i=i+2) {
//			System.out.println(i);
//		}
		
		
		// 산술연산자  +(더하기)  -(빼기)  *(곱하기)  /(나누기 몫)  %(나누기 나머지)
		for (int i=100; i<=1000; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			} else {
				System.out.println("홀수");
			}
		}
		
		
		// 복합대입연산자
		int num = 10;
		
		num = num + 1;
		num += 1; // 윗줄과 같은 말
		num = num -5;
		num -= 5; // 윗줄과 같은 말
		
		// 증감연산자
		num++; // 1 증가
		num--; // 1 감소
	}

}
