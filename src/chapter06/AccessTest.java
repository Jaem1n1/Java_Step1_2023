package chapter06;

public class AccessTest {
	
	//�ʵ�
	private int aa;
	public int bb;
	int cc;
	
	//������ ������
	
	//�޼���
	public void setAa(int aa) {
		this.aa = aa;
	}

	public void setBb(int bb) {
		this.bb = bb;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public void Disp() {
		System.out.println("aa�� : "+aa+"\nbb�� : "+bb+"\ncc�� : "+cc);
	}

	public static void main(String[] args) {
		
		AccessTest obj = new AccessTest();

		obj.setAa(10);
		obj.setBb(20);
		obj.setCc(30);
		obj.Disp();

	}


}
