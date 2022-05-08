package day8;

public class Customer {
	int age;
	String name;
	String address;
	
	public Customer(int data1, String data2, String data3) {
		age = data1;
		name = data2;
		address = data3;
	}
	
	public void member() {
		System.out.printf("이름 : %s, 나이 : %d\n", name, age);
	}
}
