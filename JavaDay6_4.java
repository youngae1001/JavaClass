import java.util.Scanner;

public class JavaDay6_4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String data = null; // 이거 for 안에 들어가면 왜 안 되는 건지? -> 반복문 자체가 지금 무한으로 되어있기 때문에 이후의 반복시행에서 다시 null로 되기 때문!
		
		for(int i = 0; ; i++) {
			System.out.print("기능을 선택해주세요 (1. 값 저장, 2. 값 조회) :");
			int menu = Integer.parseInt(scan.nextLine());

			if(menu == 1) {
				System.out.print("저장할 값을 입력해주세요 : ");
				data = scan.nextLine();
				
			} else if(menu == 2) {
				System.out.printf("당신이 저장한 값: %s\n", data);
				
			} else {
				System.out.println("잘못된 명령입니다.");
				
			}
		}		
		
		// 기능을 선택해주세요 (1. 값 저장, 2. 값 조회) : 1
		// 저장할 값을 입력해주세요 : hello
		// 기능을 선택해주세요 (1. 값 저장, 2. 값 조회) : 2
		// 당신이 저장한 값: hello

	}

}
