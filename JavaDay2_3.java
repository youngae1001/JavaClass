
public class JavaDay2_3 {

	public static void main(String[] args) {
		
		// 구구단 만들기
		
		// printf는 println과 달리 마지막에 줄바꿈 효과가 없음
		// 줄바꿈 문자 -> \n
		
		// %d -> 정수
		// %s -> 문자열
		// %f -> 실수
		// 이런 걸 써서 활용할 때는 println 말고 printf 씀
		
		int num1=2, num2=5;
		System.out.printf("aaa\n");
		System.out.printf("2+5=7\n");
		System.out.printf("2+5=%d\n", 2+5);
		System.out.printf("%d+%d=%d\n", 2, 5, 2+5);
		System.out.printf("%d+%d=%d\n", num1, num2, num1+num2);
		
		
		// 구구단 7단 작성
//		int dan = 7;
//		for(int i=1; i<10; i++) {
//			System.out.printf("%d X %d = %d\n", dan, i, dan*i);
//		}
		
		
		// 구구단 작성
		for(int dan=2; dan<10; dan++) {
			System.out.printf("=== %d단 ===\n", dan);
			for(int num=1; num<10; num++) {
				System.out.printf("%d X %d = %d\n", dan, num, dan*num);
			}
			System.out.printf("\n");
		}
		
		
	}
}
