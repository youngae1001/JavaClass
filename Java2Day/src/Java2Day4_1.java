
public class Java2Day4_1 {

	public static void main(String[] args) {

		// 가장 경계해야 하는 것 : 함수의 중복!
		
		홍길동 홍길동1 = new 홍길동();
		
		홍길동1.intro();
		홍길동1.자바();
		
		홍길순 홍길순1 = new 홍길순();
		홍길순1.파이썬();
		
		홍길동1.파이썬();
		
	}

}

class 홍길동 {
	
	홍길순 홍길순1 = new 홍길순();
	
	public void intro() {
		String name = getName();
		
		System.out.printf("안녕하세요. %s입니다.\n", name);
	}
	
	public String getName() {
		return "홍길동";
	}
	
	public void 씨언어() {
		System.out.println("씨언어 버전10");
	}
	
	public void 자바() {
		System.out.println("자바 버전1.8");
	}
	
	public void 파이썬() {
		홍길순1.파이썬();
	}
}

class 홍길순 {
	
	public void 씨언어() {
		System.out.println("씨언어 버전10");
	}
	
	public void 파이썬() {
		System.out.println("파이썬 버전3.10");
	}
	
}