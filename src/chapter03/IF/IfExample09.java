package chapter03.IF;

import javax.swing.JOptionPane;

public class IfExample09 {

	public static void main(String[] args) {
		
		//����
		String ID="soldesk"; //�ν��Ͻ� ���� (������)
		int PW=221227;//������ ����
		
		//��
		String id=JOptionPane.showInputDialog("���̵�");
		int pass=Integer.parseInt(JOptionPane.showInputDialog("��й�ȣ"));
		
		if(ID.equals(id)) {
			//��й�ȣ
			if(PW == pass) {
				System.out.println(ID + "�� ȯ���մϴ�.");
			} else {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		} else {
			System.out.println("���̵� ��ġ���� �ʽ��ϴ�.");
		}
		
		
		
		
		
		

	}//main

}//class
