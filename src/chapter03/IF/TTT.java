package chapter03.IF;

import java.util.Scanner;

public class TTT {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("���̵� �Է��Ͻʽÿ� : ");
		String ID=(scan.nextLine());
		System.out.print("��й�ȣ�� �Է��Ͻʽÿ� : ");
		String PW=(scan.nextLine());
		
		int pass=Integer.parseInt(PW);
		/*
		if(ID.equals("JAEMIN")) {
			if(pass==12345) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		} else {
			System.out.println("�α��� ����");
		}
*/
		
		//�� ������
	
		if(ID.equals("JAEMIN") && (pass==12345)) {
			System.out.println("�α��� ����");
		} else {
			System.out.println("�α��� ����");
		}
		
			
		
		
	}

}