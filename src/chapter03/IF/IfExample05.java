package chapter03.IF;

import javax.swing.JOptionPane;

public class IfExample05 {

	public static void main(String[] args) {
		// ���ð��� ������ ������ �Ƶ��� 1000��
		// ���ð��� ������ �ʵ��л��� 2000��
		// ���ð��� ������ ��,����л��� 3500��
		// ���ð��� ������ ������ 5000��
		
		int age;
		int charge;
		//swing(���̸� �Է��ϼ���) ����Ͽ� �Է¹ޱ�
		
		
		age=Integer.parseInt(JOptionPane.showInputDialog("���̸� �Է����ּ���."));
		
		if (age <= 7) {
			charge = 1000;
			System.out.println("������ �Ƶ��Դϴ�.");
			System.out.println("������ " + charge + "�� �Դϴ�.");
		} else if (age <= 13) {
			charge = 2000;
			System.out.println("�ʵ��л� �Դϴ�.");
			System.out.println("������ " + charge + "�� �Դϴ�.");
		} else if (age <= 16) {
			charge = 3500;
			System.out.println("���л� �Դϴ�.");
			System.out.println("������ " + charge + "�� �Դϴ�.");
		} else if (age <= 19) {
			charge = 3500;
			System.out.println("����л� �Դϴ�.");
			System.out.println("������ " + charge + "�� �Դϴ�.");
		} else {
			charge = 5000;
			System.out.println("���� �Դϴ�.");
			System.out.println("������ " + charge + "�� �Դϴ�.");
		}
		
		//if

	}

}
