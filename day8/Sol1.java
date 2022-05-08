package day8;

public class Sol1 {

	public static void main(String[] args) {
		// 문제1. 다음 문제를 해결하시오
		
		Customer c1 = new Customer(35, "김짱구", "대전");

	    Customer c2 = new Customer(29, "손흥민", "런던");

	    Customer c3 = new Customer(26, "홍길동", "서울");

	    Customer c4 = new Customer(44, "김서방", "대전");
	   	    
	    
	    Customer[] customers = {c1, c2, c3, c4};
	    
	    
	    //1. 전체 회원 나이와 이름 출력
	    System.out.println("==전체 회원 나이, 이름==");
	    for(int i=0; i<customers.length; i++) {
	    	customers[i].member();
	    }
	    
	    System.out.println();
	    //2. 나이가 30세 미만인 사람의 이름 출력  
	    System.out.println("==나이가 30미만인 회원 이름==");
	    for(int i=0; i<customers.length; i++) {
	    	if(customers[i].age < 30) {
	    		System.out.println(customers[i].name);
	    	}
	    }
	    
	    System.out.println();
	    //3. 대전 사는 사람들의 이름과 나이 출력
	    System.out.println("==대전 사는 회원 나이, 이름==");
	    for(int i=0; i<customers.length; i++) {
	    	if(customers[i].address == "대전") {
	    		customers[i].member();
	    	}
	    }
	    
	    System.out.println();
	    //4. 김씨 성을 가진 사람 이름 출력 (힌트 : startsWith)
	    // 자바 API
	    // API -> 누군가 만들어서 함수나 클래스, 모듈 형태로 제공된 것
	    System.out.println("==김씨 성을 가진 회원 이름==");
	    for(int i=0; i<customers.length; i++) {
	    	if(customers[i].name.startsWith("김")) {
	    		System.out.println(customers[i].name);
	    	}
	    }

	}

}
