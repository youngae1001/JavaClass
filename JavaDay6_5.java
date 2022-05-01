
public class JavaDay6_5 {
	
//	public static void introduce(int age, String name) {
//		System.out.printf("안녕하세요 %d살 %s입니다.\n", age, name);
//	}
	
	// Hong 클래스는 int, String이 섞여있기 때문에 자료형을 지정해주기 애매함 -> 따라서 지정해준 이름(Hong)이라 씀
	public static void introduce(Hong hong) {
		System.out.printf("안녕하세요 %d살 %s입니다.\n", hong.age, hong.name);
	}

	public static void main(String[] args) {
		
		// 클래스와 객체
		
		// 사람
		// 나이, 이름
		
		// 22살 홍길동
//		int age = 22;
//		String name = "홍길동";
		
		// 33살 이순신
//		int age2 = 33;
//		String name2 = "이순신";

		// 자기소개
//		introduce(age, name);
//		introduce(age2, name2);
		// 이때 한 사람의 정보를 두 가지로 저장한다면 introduce(age, name2)와 같은 실수가 일어날 수 있음
		
//		introduce(Hong.age, Hong.name);
//		introduce(Lee.age, Lee.name);
		
		Hong h = new Hong(); // new란? -> Hong()이라는 바구니를 만들겠다는 뜻 -> 이를 이용해 한번에 여러개의 정보가 이동 가능
		
		introduce(h);
//		introduce(Lee);
		
	}

}


class Hong {
	static int age = 22;
	static String name = "홍길동";
}

class Lee {
	static int age = 33;
	static String name = "이순신";
}






