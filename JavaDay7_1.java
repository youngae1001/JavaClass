
public class JavaDay7_1 {
	// run �Լ��� Car Ŭ������ ���õǾ�� ���̹Ƿ� Car Ŭ���� ������ �̵�(�ڵ� ������ ������ ����)
//	public static void run(Car car) {
//		System.out.println("�ڵ��� ��");
//	}
//	
//	public static void run2(Car car) {
//		System.out.printf("%d�ӵ��� �ڵ��� ��\n", car.maxVelo);
//	}

	public static void main(String[] args) {
//		Person p1 = new Person(); // new Person() -> Person�� �Ѱ� �����ϱ�
//
//		p1.age = 20;
//		p1.name = "ȫ�浿";
//		p1.home = "����";
//		
//		System.out.println(p1.age);
//		System.out.println(p1.name);
//		System.out.println(p1.home);
//				
//		Person p2 = new Person();
//		
//		p2.age = 22;
//		p2.name = "ȫ���";
//		p2.home = "����";
//		
//		System.out.println(p2.age);
//		System.out.println(p2.name);
//		System.out.println(p2.home);
//		
//		// ��ü ����(����)
//		Person p3 = new Person();
//		
//		// �ʱ�ȭ(�ʼ�!)
//		p3.setData(30, "�̼���", "û��");
//		
//		System.out.println(p3.age);
//		System.out.println(p3.name);
//		System.out.println(p3.home);
//		
//		Person p4 = new Person();
//		p4.setData(25, "Ȳ����", "����");
//		System.out.println(p4.age);
//		System.out.println(p4.name);
//		System.out.println(p4.home);
		
		Person2 p1 = new Person2(30, "�̼���", "û��");
		Person2 p2 = new Person2(25, "Ȳ����", "����");
		
		
		// =======================================
		
		// ����1. �ڵ����� 3�� �޸��� ���ּ���.
		// ��� : �ڵ����� �޸��ϴ�.
		
//		//v1. 1���� �ڵ����� 3�� �޸��� ���ּ���.
//		
//		OneCar c1 = new OneCar();
//		c1.name = "����";
//		c1.num = 3;
//		
//		for (int i=0; i<c1.num; i++) {
//			System.out.println(c1.name + "����");
//		}
//
//	    //v2. 3���� �ڵ����� 1���� �޸��� ���ּ���.
//		
//		OneCar c2 = new OneCar();
//		c2.name = ""
		

		// ������(����) + �Լ�(����)�� �̷���� �� => ��ü
		Car2 c1 = new Car2();
		c1.maxVelo = 200;
		
		Car2 c2 = new Car2();
		c2.maxVelo = 250;
		
		Car2 c3 = new Car2();
		c3.maxVelo = 220;

		//v1. 1���� �ڵ����� 3�� �޸��� ���ּ���.
		c1.run();
		c1.run();
		c1.run();
		
		//v2. 3���� �ڵ����� 1���� �޸��� ���ּ���.
		c1.run();
		c2.run();
		c3.run();
		
		
		
		// ����2. �ڵ��� ��ü�� ���� ������ ������ּ���.
		// �ڵ��� ��ü�� ������ ��� �� ������ �̿��� �ְ�ӷ��� ���� �ٸ��� ������ּ���.
		// �� �ڵ����� �ڽ��� �ְ�ӷ����� �޸��� ���ּ���.
		
		c1.run2();
		c2.run2();
		c3.run2();
		
	}

}

class Person2 {
	// static => ������ ���� ��
	// static�� ���� �ʴ� �� => ���纻���� ����� ��
	int age; // ��׵� �տ� static ������ main�Լ��� ���纻�� �ִ� �� �ƴ϶� ������ �����ְ� �� -> ���纻���� ��������� static ���ֱ�
	String name;
	String home;
	
	// 1. ���� Ÿ�� ����
	// 2. �ݵ�� Ŭ������� ����
	// 3. ��ü�� ������ �� �ݵ�� ����Ǵ� �޼��� => ������
	public Person2(int data1, String data2, String data3) {
		System.out.println("����� �� �� �����˴ϴ�.");
		age=data1;
		name=data2;
		home=data3;
	}
	
//	public void setData(int data1, String data2, String data3) {
//		age=data1;
//		name=data2;
//		home=data3;
//	}
}

//class OneCar {
//	String name;
//	int num;
//} // ���� ���� �߸���


// Ŭ������ ����, ��ü�� ���纻(Ŭ������ ��ü��� Ī���� ����)
class Car2 {
	int maxVelo;
	
	public void run() {
		System.out.println("�ڵ��� ��");
	}
	
	public void run2() {
		System.out.printf("%d�ӵ��� �ڵ��� ��\n", maxVelo);
	}
}