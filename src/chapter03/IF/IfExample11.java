package chapter03.IF;

import java.util.Scanner;

public class IfExample11 {

	public static void main(String[] args) {
		// �����ͺ��̽�
		String ID="JAEMIN";
		int PW=221230;
		Scanner scan=new Scanner(System.in);
		
		//Scanner scan
		
		//ID �ޱ�
		System.out.print("���̵� �Է��ϼ��� : ");
		String inputID=(scan.nextLine());
		
	    if(ID.equals(inputID)) {   	
	    	System.out.print("��й�ȣ�� �Է��ϼ��� : ");
	    	int inputPW=Integer.parseInt(scan.nextLine());
	    	if(PW==inputPW) {
	    		System.out.println("�α��� ����");
	    	} else {
	    		System.out.println("��й�ȣ�� Ȯ�����ּ���.");
	    	}
	    } else {
	    	System.out.println("���̵� Ȯ�����ּ���.");
	    }

	}

}
