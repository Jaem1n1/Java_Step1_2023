package chapter03.IF;

public class IfExample06 {

	public static void main(String[] args) {
		
		int num=(int)(Math.random()*6)+1;
		
		//1�� ~ 6������ ���� �� ���� �� ������ �н� ���
		if(num==1) {
			System.out.println("1�� -> �");
		} else if(num==2) {
			System.out.println("2�� -> Ƣ��");
		} else if(num==3) {
			System.out.println("3�� -> ����");
		} else if(num==4) {
			System.out.println("4�� -> ������");
		} else if(num==5) {
			System.out.println("5�� -> ���");
		} else {
			System.out.println("6�� -> ���");
		}

	}

}
