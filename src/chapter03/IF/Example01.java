package chapter03.IF;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		//����ó������� �� ������ ���䰳���� int�� Ÿ���� ���� 5���� �����ϰ� �Է¹�������(�� �Է��� ScannerŬ���� ���)
        //����Ʈ���� ����(soft1), ����Ʈ���� ����(soft2), �����ͺ��̽� ����(DB), ���α׷��־��Ȱ��(pro), �����ý��� ����(os)
		//�� �����̶� 8�� �̸�, ����� 60�� �̸��� ��� ���հ��Դϴٷ� ���
		//�׷��� ������ �հ��Դϴ����� ���
		
		Scanner scan=new Scanner(System.in);
		
		int sum;
		
		System.out.print("����Ʈ���� ������ ���� ������ �Է����ּ��� : ");
		int soft1=Integer.parseInt(scan.nextLine());
		System.out.print("����Ʈ���� ������ ���� ������ �Է����ּ��� : ");
		int soft2=Integer.parseInt(scan.nextLine());
		System.out.print("�����ͺ��̽� ������ ���� ������ �Է����ּ��� : ");
		int DB=Integer.parseInt(scan.nextLine());
		System.out.print("���α׷��� ���Ȱ���� ���� ������ �Է����ּ��� : ");
		int pro=Integer.parseInt(scan.nextLine());
		System.out.print("�����ý��� ������ ���� ������ �Է����ּ��� : ");
		int os=Integer.parseInt(scan.nextLine());
		
		sum=soft1+soft2+DB+pro+os;
		
		if(sum < 60 || soft1 < 8 || soft2 < 8 || DB < 8 || pro < 8 || os < 8) {
			System.out.println("���հ��Դϴ�.");
		} else {
			System.out.println("�հ��Դϴ�.");
		}
		

	}

}
