
public class JavaDay6_3 {
	
	static int remainder = 0;
	
	public static void deposit(int money) {
		remainder += money;
		System.out.printf("%d원을 예금하셨습니다.\n",money);
		System.out.printf("잔액은 %d원입니다.\n", remainder);
	}
	
	public static int withdraw(int money) {
		remainder -= money;
		System.out.printf("%d원을 출금하셨습니다.\n", money);
		System.out.printf("잔액은 %d원입니다.\n", remainder);		
		
		return money;
	}
	
	public static void main(String[] args) {
		
		deposit(1000); // 예금
		deposit(1000);
		deposit(1000); 
		withdraw(300); // 출금
		withdraw(1500);
		

	}

}
