package chapter03.IF;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfExample10 {

	public static void main(String[] args) {
		// Scanner scan�̶�� �ν��Ͻ� ���� ����
		
		// ID��� ������ ���̵� �ޱ�
		
		// PW��� ����fh ��й�ȣ �ޱ�(String) => ���ڷ� �޵� String
		
		// int������ ����ȯ
		
		// ��ø���Ǹ� ����Ͽ� �α��� ������ ��й�ȣ �ٸ�, ���̵� ����
		
		Scanner scan=new Scanner(System.in);
		String ID = "JAEMIN";
		int PW = 12345;
		
		System.out.print("���̵� �Է��Ͻʽÿ� : ");
		String id=(scan.nextLine());
		System.out.print("��й�ȣ�� �Է��Ͻʽÿ� : ");
		int pass=Integer.parseInt(scan.nextLine());
		
		if(ID.equals(id)) {
			if(PW == pass) {
				System.out.println(ID + "�� ȯ���մϴ�.");
			} else {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		} else {
			System.out.println("���̵� ��ġ���� �ʽ��ϴ�.");
		}

	}

}
