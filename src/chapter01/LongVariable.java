package chapter01;

public class LongVariable {

	public static void main(String[] args) {
		
		//int num1=12345678900; 32��Ʈ = 4Byte
		long num2=12345678900L; //�����ϰ� �ʱ�ȭ�� ��
		long num3=1000; //long���� 64��Ʈ������ L�� ������ �������Ƿ� int�� �ν�
		
		int level; //�����ϰ� �ʱ�ȭ���� ����
		level=10; //���ͳΰ�
		
		System.out.println(num2+num3); // ����� : long / long�� int�� ������ �� ū������ ������� ����
		System.out.println(level);

	}

}
