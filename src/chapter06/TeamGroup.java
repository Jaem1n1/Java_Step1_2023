package chapter06;

public class TeamGroup {
	
	//������� (�迭 -> ��������)
	private TeamMember[] member = new TeamMember[6];
	
	//�⺻ ������
	
	//�ʱ�ȭ �޼ҵ�
	public void init() {
		member[0] = new TeamMember("����ȸ" , "��");
		member[1] = new TeamMember("������" , "��");
		member[2] = new TeamMember("������" , "��");
		member[3] = new TeamMember("�����" , "��");
		member[4] = new TeamMember("���ֹ�" , "��");
		member[5] = new TeamMember("�忩��" , "��");
	}
	
	//��� �޼ҵ�
	public void Disp() {
		System.out.println("[���� ���]");
		for(int i=0; i<member.length;i++) {
			System.out.println((i+1)+"��° ���� �̸��� " + member[i].getName() + " ������ " + member[i].getGender() + "�Դϴ�.");
		}
	}

}
