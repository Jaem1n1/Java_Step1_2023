package chapter06;

public class TeamMain {

	public static void main(String[] args) {
		
		TeamGroup team=new TeamGroup();
		TeamMember mem=new TeamMember();
		mem.setTeamName("�����");
		System.out.println("���� : "+mem.getTeamName());
		System.out.println("------[���� ���]------");
		team.init();
		team.Disp();
		
		System.out.println();
		
		mem.setmName("����ȸ");
		mem.setMphone("010-1234-5678");
		mem.setsName("������");
		
	
		System.out.println("5�� ���� : " + mem.getTeamName());
		System.out.println("���� : " + mem.getmName());
		System.out.println("���� ��ȭ��ȣ : " + mem.getMphone());
		System.out.println("������ : " + mem.getsName());
		
		
		

	}

}
