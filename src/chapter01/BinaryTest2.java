package chapter01;

public class BinaryTest2 {

	public static void main(String[] args) {
		//ī���� - ù���ڴ� ������ �ҹ��� �߰��ܾ��� ù�ڴ� �빮��
		//�Ľ�Į��� - ù���ڴ� ������ �빮��
		
		int num=10;
		int bnum=0B1000; // B=Binary�� ���� �� 2����(0B)
		int onum=010; // 8����(OCT)
		
		int bnum2=0B10000;
		int hnum=0x10; //16����(Hex) x=Hex�� ����
		
		System.out.println(num);
		System.out.println(bnum);
		System.out.println(onum);
		System.out.println(bnum2);
		System.out.println(hnum);

	}

}
