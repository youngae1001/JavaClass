
public class JavaDay3_2 {

	public static void main(String[] args) {
				
				// �迭 �̿� -> �л� ���� ����
				
				// �л� �̸�
				String[] names= {"ö��", "����", "��ö", "����", "�浿"};
				
				// �л� ����
				int[] scores = {100, 90, 80, 90, 60};
				
				// �л����� ���� ����
				int sum=0;
				for(int i=0; i<scores.length; i++) {
					sum+=scores[i];			
				}
				System.out.println(sum);
				
				// 1. �л����� ���� ���
				// �̶� ���� �Ǽ����� ����� ��� ������ sum�� int ���� double�� �Է��ϸ� �� -> ��������ȯ?�� �� �ǳ�??
				int avg = sum / scores.length;
				
				System.out.println("�л� ���� ��� : " + avg);
				
				// 2. ��� �̻��� �л� ���
				System.out.print("������ ��� �̻��� �л� : ");
				for(int i=0; i<scores.length; i++) {
					if(scores[i]>avg) {
						System.out.print(names[i] + " ");
					}
				}
				
				System.out.println();
				
				// 3. ������ ���� ���� �л� ���
				String bestStu=null; // �ʱ�ȭ �ʿ�! null �Ǵ� "" �Է��ϸ� ��
				int bestSco = scores[0];
				for(int i=0; i<scores.length; i++) {
					if(scores[i]>=bestSco) {
						bestSco=scores[i];
						bestStu=names[i];
					}
				}
//				System.out.println(bestNum);
				System.out.println("������ ���� ���� �л� : " + bestStu);
				
				// 4. ������ ���� ���� �л� ���
				String worstStu="";
				int worstSco = scores[0];
				for(int i=0; i<scores.length; i++) {
					if(scores[i]<=worstSco) {
						worstSco = scores[i];
						worstStu = names[i];
					}
				}
				System.out.println("������ ���� ���� �л� : " + worstStu);


	}

}
