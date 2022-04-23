
public class JavaDay3_1 {

	public static void main(String[] args) {
		
		// Day2 연습문제 안 푼 거 풀어보기!
		
		// 이번 수업은 Array
		
		// 배열
		// 많은 데이터를 수월하게 처리하기 위해 사용
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		// 변수만 사용하면 데이터가 많아졌을 때 관리가 어려움
		
		int[] numArr = {10, 20, 30, 40, 50}; // 정수 배열

		// 배열의 경계값은 항상 주의
		// 시작 -> 0
		// 끝 -> 배열의 개수 - 1
		System.out.println(numArr[4]); // 배열은 순서가 0부터 시작
		
		// 타입이 같아야 함
//		String[] StrngArr = {"aa", "bb", "cc", 10}; // 안 됨. 문자열에서는 문자만 입력
		
		// 배열의 핵심 요소 두가지 -> 자료형(타입), 길이
		
		// 사용자 입력, 파일 데이터, 데이터베이스 데이터 등등 작업자가 직접 입력하는 것이 아닌 외부 데이터를 불러올 때 많이 사용
		
		int[] intArr = new int[100]; // 배열을 만드는 일반적인 방법
		// 라고 하면 0이 100개가 들어있는 배열이 만들어짐
		System.out.println(intArr[99]);
		
		
		// 1. 숫자 배열은 0으로 초기화
		// 2. 그외 배열은 null로 초기화
		// null -> '데이터가 없음(비어있음)'을 명시적으로 표현
		
		String[] strArr = new String[10];
		System.out.println(strArr[0]);
		
		// 수정
		strArr[0] = "hello";
		String str1 = strArr[0];
		System.out.println(str1);
		
		strArr[1] = "bye";
		strArr[2] = "haha";
		
		// 일괄 조회 -> 거의 반드시 반복문과 함께 사용됨
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		System.out.println(strArr[2]);
		System.out.println(strArr[3]);

		for(int i=0; i<10; i++) {
			System.out.println(strArr[i]);
		}
		
		// 배열은 길이 정보를 제공 -> 배열이름.length 하면 알 수 있음
		System.out.println(strArr.length);
		System.out.println(intArr.length);
		
		// 따라서 반복문을 사용할 때 이를 사용하면 굳이 배열의 길이가 몇인지 따로 셀 필요가 없음!
		
		// 배열 전체 조회
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		// =====================================================================
		
		// 문제 1 : Arr 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100을 저장하고 출력해주세요.
		
		// 방법1
		
		int[] Arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		for(int i=0; i<Arr.length; i++) {
			System.out.print(Arr[i] + " ");
		}
		
		System.out.println();
		
		// 방법2
		
		int[] Arr2 = new int[10];
		
		for(int i=0; i<10; i++) {
			Arr2[i] = i*10+10;
		}
		
		for(int i=0; i<Arr2.length; i++) {
			System.out.print(Arr2[i]+" ");
		}
		
		System.out.println();
		
		// 문제 2 : 배열을 두번 출력해주세요.
		int[] arr = {1,2,3,4,5};
		
		for(int j=0; j<2; j++) {
			for(int i=0; i< arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
		
//		// 문제 3 : 배열을 이용해 5개의 숫자를 입력받고 출력해주세요.
//		int[] arrNum = new int[5];
//
//		// 문제 4 : 배열을 이용해 5개의 숫자를 입력받고 출력해주세요.
//		String[] arrStr = new String[5];
		
		// 3, 4번은 아직 안 배운 내용임!
		
		// 문제 5 : 배열에 5개의 값을 입력하고 거꾸로 출력해주세요.
		int[] arr5Num = {1, 2, 3, 4, 5};
		
		for(int i=4; i>=0; i--) {
			System.out.print(arr5Num[i] + " ");
		}

		System.out.println();
		
//		for(int i=arr5Num.length-1; i>=0; i--) {
//			System.out.print(arr5Num[i] + " ");
//		} // 이렇게 해도 됨! 배열의 길이를 모를 경우나 그냥이나
		
	}

}
