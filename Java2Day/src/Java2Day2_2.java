public class Java2Day2_2 {
	
	static int a = 10; // ���� ������ �ƴϾ main �޼��尡 static�̱� ������ ������ static�� ����ϰ� ��. -> ��ü���⿡ ��߳�
	
	// main �޼���� ������ static.
	// �ٽɷ����� main���� �������� �ʴ´�.
	// ���� �ٽ� ������ �и��Ѵ�.
	public static void main(String[] args) {
		System.out.println(a);
		
		Test t1 = new Test();
		Test t2 = new Test();
		
		t1.num = 100;
		
		System.out.println(t1.num);
		System.out.println(t2.num);
		
		t2.num = 200;
		
		System.out.println(t2.num);
		
		
		System.out.println(t1.num2);
		System.out.println(t2.num2);
		
		t1.num2 = 50;
		
		System.out.println(t2.num2);
	
		
		// age, name�� static �����̸� ������� ���̿� �̸��� �����ϰ� ��.
		Person p1 = new Person();
		p1.age = 20;
		p1.name ="ȫ�浿";
		Person p2 = new Person();
		p2.age = 30;
		p2.name ="�̼���";
		Person p3 = new Person();
		p3.age = 40;
		p3.name ="������";
		
		System.out.println(p3.age);
		System.out.println(p1.age);
		
		
		// =======================================================================
		��� a���1 = new ���();
		a���1.�̸� = "ȫ�浿";
		a���1.���� = 22;
		
		a���1.�ڱ�Ұ�();
		// ��� : ���� 22�� ȫ�浿 �Դϴ�.
		
		��� a���2 = new ���();
		a���2.�̸� = "ȫ���";
		a���2.���� = 25;
		
		a���2.�ڱ�Ұ�();
		// ��� : ���� 25�� ȫ��� �Դϴ�.
		
		a���1.�ڱ�Ұ�();
		// ��� : ���� 22�� ȫ�浿 �Դϴ�.
	}

}

//�Ϲ������� class�� static�� ������� �ʴ´�.
//static�� non-static�� ���� �� �� ����. (�޸� �ε� ������ ��ġ ���� ����.)
class Test {
	
	int num = 10; // �ν��Ͻ�(��ü)���� -> ���� ���纻���� ����ִ� ����. 
	static int num2 = 20; // �������� -> �ڹ� �޸𸮻� �� �ϳ��� ����. ��ü���� ���� �ڿ�
	
}


class Person {
	static int age; // �ν��Ͻ� ����
	static String name; // �ν��Ͻ� ����
	
	public static void introduce() {
		System.out.println(age);
		System.out.println(name);
		System.out.println("=====================");
	}
	
	public void introduce2() {
		System.out.println(age);
		System.out.println(name);
		System.out.println("=====================");
	}
}


// =========================================================================

class ��� {
	
	int ����;
	String �̸�;
	
	public void �ڱ�Ұ�() {
		System.out.println("���� " + ���� + "�� " + �̸� + " �Դϴ�.");
	}
}