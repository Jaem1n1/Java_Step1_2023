package chapter02;

public class Example03 {

	public static void main(String[] args) {
		//���׿����ڸ� �̿��Ͽ� score1�� 60�� ���� ũ�ų� ������ �հ� �׷��� ������ ���հ����� ��ȯ �Ͻÿ�
		//---------------------------------------------------------------
		//���׿����ڸ� �̿��Ͽ� score2�� 90���� ũ�� 'A'�̰� score�� 80���� ũ�� 'B' �� ���ϴ� ��� 'C'�� �����Ѵ�
		
		
		int score1=70;
		
		String ch;
		ch=(score1>=60) ? "�հ�":"���հ�";
		System.out.println(ch);
		System.out.println("------------------------");
		
		int score2=100;
		char ch1;
		ch1=(score2>90) ? 'A' : (score2>80) ? 'B' : 'C';
		System.out.println(ch1);
		

	}

}
