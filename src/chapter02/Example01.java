package chapter02;

public class Example01 {

	public static void main(String[] args) {
		
		/* Soldesk ������
		��, ���, �������� Ű��� �ִµ� �Ϸ翡 ����Ǵ� ���� ���� 5��, 7��, 5���̴�

		���������� �Ϸ翡 ����Ǵ� �� ������ ������ ����ϰ�, �ð���(24) ��ü ������ ��� ���갹���� ����Ͻÿ�
		(��, ��հ��� ��� ������ Ÿ���� float���� �����Ѵ�)
		*/
		
		int pear=5;
		int apple=7;
		int orange=5;
		
		char ch1='\uAC1C';
		
		int result;
		
		result=pear+apple+orange;
		
		System.out.print("���������� �Ϸ翡 ����Ǵ� �� ������ ���� : "+ (result));
		System.out.println(ch1);
		
		
		System.out.print("�ð��� ��ü ������ ��� ���� ���� : "+ (float)(result)/24);
		System.out.println(ch1);

	}

}
