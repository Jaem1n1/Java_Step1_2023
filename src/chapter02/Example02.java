package chapter02;

public class Example02 {

	public static void main(String[] args) {
		//���� ���̸� ���Ͻÿ�(������*������*3.14)
		//������ : 10, 3.14�� double�� �����Ͽ� ���Ͻÿ�
		//������ ������ num1 / 3.14 ������ pi /���� ������ result
		
		int num1=10;
		double pi=3.14;
		
		double result;
		result=num1*num1*pi;
		
		System.out.println("���� ���� : "+(result));
		
		//���2
		int num2=10;
		int num3=3;
		int num4=14;
		
		//int => double : Double.parseDouble
		//String => int : Integer.parseInt
		
		double result2=num2*num2*Double.parseDouble(num3+"."+num4);
		System.out.println("���� ���� : "+(result2));
		
	}

}
