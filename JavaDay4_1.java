
public class JavaDay4_1 {

	public static void main(String[] args) {
		
		// 문제. 다음 배열을 정리하시오.
		
		int[] arr = {4, 1, 6, 3, 2, 8, 7, 5};
		
		// 정렬된 데이터는 탐색속도가 압도적으로 빠름
		
		// 거품정렬코드 작성
		
		// 1. 가장 큰 수를 가장 뒤로 보내기(값 교체 알고리즘 사용)
		
		// 방법1
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
		
		
		// 방법2  위 방법보다 얘가 더 효율적인 방법인듯
		for(int j=arr.length-1; j>1; j--) { // 여기서 j를 j>0으로 하지 않는 이유 : 뒤에 7개에 포커스 두고 정렬작업하면 자연스레 첫번째 거는 정렬되어있음
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
