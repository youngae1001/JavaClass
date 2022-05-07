
public class JavaDay7_3 {

	public static void main(String[] args) {
		
		// 학생 성적
//		String[] names = {"철수", "영희", "민철", "길동", "진희"};
//		int[] scores = {100, 90, 80, 90, 100};

		Student s1 = new Student("철수", 100);
		Student s2 = new Student("영희", 90);
		Student s3 = new Student("민철", 80);
		Student s4 = new Student("길동", 90);
		Student s5 = new Student("진희", 100);
		
		Student[] students = {s1, s2, s3, s4, s5};
		
		// 점수가 평균 이상인 학생 구하기
		int sum = 0;
		for(int i=0; i<students.length; i++) {
			Student s = students[i]; 
			sum += s.score; // students[i].score
		}
		
		System.out.println(sum / students.length);
		int avg = sum / students.length;
		
		for(int i=0; i<students.length; i++) {
			Student s = students[i];
			if(s.score > avg) {				
				s.introduce();
			}
		}
		
		// =========================================================
		
		// 문제1. 다음 문제를 해결하시오
		
		Customer c1 = new Customer();
	    c1.name = "김짱구";
	    c1.age = 35;
	    c1.address = "대전";

	    Customer c2 = new Customer();
	    c2.name = "손흥민";
	    c2.age = 29;
	    c2.address = "런던";

	    Customer c3 = new Customer();
	    c3.name = "홍길동";
	    c3.age = 26;
	    c3.address = "서울";

	    Customer c4 = new Customer();
	    c4.name = "김서방";
	    c4.age = 44;
	    c4.address = "대전";
	    
	    Customer[] customers = {c1, c2, c3, c4};
	    
	    //1. 전체 회원 나이와 이름 출력
	    for(int i=0; i<customers.length; i++) {
	    	customers[i].member();
	    }
	    //2. 나이가 30세 미만인 사람의 이름 출력  
	    
	    //3. 대전 사는 사람들의 이름과 나이 출력
	    //4. 김씨 성을 가진 사람 이름 출력 (힌트 : startsWith)
		
	}

}

class Student {
	String name;
	int score;
	
	public Student(String data1, int data2) {
		name = data1;
		score = data2;
	}
	
	public void introduce() {
		System.out.printf("저는 %s이고, 점수는 %d입니다.\n", name, score);
	}
}

// ====================================================================

//회원 모델링 : 이름, 나이, 주소
class Customer {
	String name;
	int age;
	String address;
	
	public void member() {
		System.out.printf("이름 : %s, 나이 : %d\n", name, age);
	}
}


