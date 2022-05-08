package day8;

public class Sol1 {

	public static void main(String[] args) {
		// ����1. ���� ������ �ذ��Ͻÿ�
		
		Customer c1 = new Customer(35, "��¯��", "����");

	    Customer c2 = new Customer(29, "�����", "����");

	    Customer c3 = new Customer(26, "ȫ�浿", "����");

	    Customer c4 = new Customer(44, "�輭��", "����");
	   	    
	    
	    Customer[] customers = {c1, c2, c3, c4};
	    
	    
	    //1. ��ü ȸ�� ���̿� �̸� ���
	    System.out.println("==��ü ȸ�� ����, �̸�==");
	    for(int i=0; i<customers.length; i++) {
	    	customers[i].member();
	    }
	    
	    System.out.println();
	    //2. ���̰� 30�� �̸��� ����� �̸� ���  
	    System.out.println("==���̰� 30�̸��� ȸ�� �̸�==");
	    for(int i=0; i<customers.length; i++) {
	    	if(customers[i].age < 30) {
	    		System.out.println(customers[i].name);
	    	}
	    }
	    
	    System.out.println();
	    //3. ���� ��� ������� �̸��� ���� ���
	    System.out.println("==���� ��� ȸ�� ����, �̸�==");
	    for(int i=0; i<customers.length; i++) {
	    	if(customers[i].address == "����") {
	    		customers[i].member();
	    	}
	    }
	    
	    System.out.println();
	    //4. �达 ���� ���� ��� �̸� ��� (��Ʈ : startsWith)
	    // �ڹ� API
	    // API -> ������ ���� �Լ��� Ŭ����, ��� ���·� ������ ��
	    System.out.println("==�达 ���� ���� ȸ�� �̸�==");
	    for(int i=0; i<customers.length; i++) {
	    	if(customers[i].name.startsWith("��")) {
	    		System.out.println(customers[i].name);
	    	}
	    }

	}

}
