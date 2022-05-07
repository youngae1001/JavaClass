
public class JavaDay7_2 {

	public static void main(String[] args) {
		Person p1 = new Person();
	    p1.name = "ȫ�浿";
	    p1.age = 27;

	    Person p2 = new Person();
	    p2.name = "ȫ���";
	    p2.age = 25;

	    p1.introduce(); // �ȳ��ϼ��� 27�� ȫ�浿�Դϴ�.
	    p2.introduce(); // �ȳ��ϼ��� 25�� ȫ����Դϴ�.

	    Car c1 = new Car();
	    c1.model = "�ҳ�Ÿ";
	    c1.color = "�Ͼ��";
	    c1.speed = 100;

	    // =====================================================
	    // ���⿡ c2 ����
	    Car c2 = new Car();
	    c2.model = "���";
	    c2.color = "������";
	    c2.speed = 70;
	    // =====================================================

	    c1.drive(); // �Ͼ�� �ҳ�Ÿ��/�� 100km�� �޸��ϴ�.
	    c2.drive(); // ������ �����/�� 70km�� �޸��ϴ�.
	    
	    Cat cat1 = new Cat();
	    cat1.name = "�Ƹ�";
	    cat1.age = 4;
	    cat1.kind = "���þȺ��";

	    // =====================================================
	    // ���⿡ cat2 ����
	    Cat cat2 = new Cat();
	    cat2.name = "����";
	    cat2.age = 6;
	    cat2.kind = "��";
	    // =====================================================

	    cat1.meow(); // 4�� ���þȺ�� ����� �Ƹ��� �߿��ϰ� ��ϴ�.
	    cat2.meow(); // 6�� �� ����� ���� �߿��ϰ� ��ϴ�.

	    Warrior w1 = new Warrior();
	    w1.name = "�̼���";
	    w1.attack = 20;
	    w1.defense = 10;
	   
	    // =====================================================
	    // ���⿡ w2 ����
	    Warrior w2 = new Warrior();
	    w2.name = "������";
	    w2.attack = 15;
	    w2.defense = 15;
	    
	    // =====================================================

	    w1.status(); // �̸� : �̼���, ���ݷ� : 20, ���� : 10 
	    w2.status(); // �̸� : ������, ���ݷ� : 15, ���� : 15 

	    w1.attack(); // �̼����� 20�� �������� �����δ�.
	    w2.attack(); // �������� 15�� �������� �����δ�. 

	    w1.defense(); // �̼����� 10 �������� ����մϴ�.
	    w2.defense(); // �������� 15 �������� ����մϴ�.

	}

}

//===========================================================
//Person, Car, Cat, Warrior Ŭ���� �����
// �� ��Ű�� �ȿ��� ������ �̸��� Ŭ������ 1���� ����
class Person {
	String name;
	int age;
	
	public void introduce() {
		System.out.println("�ȳ��ϼ��� " + age + "�� " + name + "�Դϴ�.");
	}
}

class Car {
	String model;
	String color;
	int speed;
	
	public void drive() {
		System.out.println(color + " " + model + "��/�� " + speed + "km�� �޸��ϴ�.");
	}
}

class Cat {
	String name;
	int age;
	String kind;
	
	public void meow() {
		System.out.println(age + "�� " + kind + " ����� " + name + "�� �߿��ϰ� ��ϴ�.");
	}
}

class Warrior {
	String name;
	int attack;
	int defense;
	
	public void status() {
		System.out.println("�̸� : " + name +", ���ݷ� : " + attack + ", ���� : " + defense);
	}

	public void attack() {
		System.out.println(name + "�� " + attack + "�� �������� �����ϴ�.");
	}
	
	public void defense() {
		System.out.println(name + "�� " + defense + " �������� ����մϴ�.");
	}
}

//===========================================================
