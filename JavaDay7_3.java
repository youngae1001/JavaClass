
public class JavaDay7_3 {

	public static void main(String[] args) {
		
		// �л� ����
//		String[] names = {"ö��", "����", "��ö", "�浿", "����"};
//		int[] scores = {100, 90, 80, 90, 100};

		Student s1 = new Student("ö��", 100);
		Student s2 = new Student("����", 90);
		Student s3 = new Student("��ö", 80);
		Student s4 = new Student("�浿", 90);
		Student s5 = new Student("����", 100);
		
		Student[] students = {s1, s2, s3, s4, s5};
		
		// ������ ��� �̻��� �л� ���ϱ�
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
		
		// ����1. ���� ������ �ذ��Ͻÿ�
		
		Customer c1 = new Customer();
	    c1.name = "��¯��";
	    c1.age = 35;
	    c1.address = "����";

	    Customer c2 = new Customer();
	    c2.name = "�����";
	    c2.age = 29;
	    c2.address = "����";

	    Customer c3 = new Customer();
	    c3.name = "ȫ�浿";
	    c3.age = 26;
	    c3.address = "����";

	    Customer c4 = new Customer();
	    c4.name = "�輭��";
	    c4.age = 44;
	    c4.address = "����";
	    
	    Customer[] customers = {c1, c2, c3, c4};
	    
	    //1. ��ü ȸ�� ���̿� �̸� ���
	    for(int i=0; i<customers.length; i++) {
	    	customers[i].member();
	    }
	    //2. ���̰� 30�� �̸��� ����� �̸� ���  
	    
	    //3. ���� ��� ������� �̸��� ���� ���
	    //4. �达 ���� ���� ��� �̸� ��� (��Ʈ : startsWith)
		
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
		System.out.printf("���� %s�̰�, ������ %d�Դϴ�.\n", name, score);
	}
}

// ====================================================================

//ȸ�� �𵨸� : �̸�, ����, �ּ�
class Customer {
	String name;
	int age;
	String address;
	
	public void member() {
		System.out.printf("�̸� : %s, ���� : %d\n", name, age);
	}
}


