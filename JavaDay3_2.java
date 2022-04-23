
public class JavaDay3_2 {

	public static void main(String[] args) {
				
				// 배열 이용 -> 학생 성적 관리
				
				// 학생 이름
				String[] names= {"철수", "영희", "민철", "수빈", "길동"};
				
				// 학생 성적
				int[] scores = {100, 90, 80, 90, 60};
				
				// 학생들의 점수 총합
				int sum=0;
				for(int i=0; i<scores.length; i++) {
					sum+=scores[i];			
				}
				System.out.println(sum);
				
				// 1. 학생들의 점수 평균
				// 이때 만약 실수값을 결과로 얻고 싶으면 sum을 int 말고 double로 입력하면 됨 -> 강제형변환?은 안 되나??
				int avg = sum / scores.length;
				
				System.out.println("학생 점수 평균 : " + avg);
				
				// 2. 평균 이상인 학생 출력
				System.out.print("점수가 평균 이상인 학생 : ");
				for(int i=0; i<scores.length; i++) {
					if(scores[i]>avg) {
						System.out.print(names[i] + " ");
					}
				}
				
				System.out.println();
				
				// 3. 점수가 가장 높은 학생 출력
				String bestStu=null; // 초기화 필요! null 또는 "" 입력하면 됨
				int bestSco = scores[0];
				for(int i=0; i<scores.length; i++) {
					if(scores[i]>=bestSco) {
						bestSco=scores[i];
						bestStu=names[i];
					}
				}
//				System.out.println(bestNum);
				System.out.println("점수가 가장 높은 학생 : " + bestStu);
				
				// 4. 점수가 가장 낮은 학생 출력
				String worstStu="";
				int worstSco = scores[0];
				for(int i=0; i<scores.length; i++) {
					if(scores[i]<=worstSco) {
						worstSco = scores[i];
						worstStu = names[i];
					}
				}
				System.out.println("점수가 가장 낮은 학생 : " + worstStu);


	}

}
