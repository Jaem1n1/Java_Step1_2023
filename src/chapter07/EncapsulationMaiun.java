package chapter07;

import javax.swing.JOptionPane;

public class EncapsulationMaiun {

	public static void main(String[] args) {
		
		int side;
		int height;
		int Area;
		
		side=Integer.parseInt(JOptionPane.showInputDialog("�غ�"));
		height=Integer.parseInt(JOptionPane.showInputDialog("����"));
		
		//��ü����
		Encapsulation obj=new Encapsulation();
		//EncapsulationMaiun�� �޼ҵ带 ����Ͽ� �簢���� ���� ���ϱ�
		Area=obj.Cal_Area(side, height);
		
		System.out.println("�簢���� ���̴� "+Area+"�Դϴ�.");
		String str="�簢���� ���̴� "+Area+"�Դϴ�.";
		JOptionPane.showMessageDialog(null, str);

	}

}
