package chapter06;

public class TeamMain {

	public static void main(String[] args) {
		
		TeamGroup team=new TeamGroup();
		TeamMember mem=new TeamMember();
		mem.setTeamName("∆¿«„∫Í");
		System.out.println("∆¿∏Ì : "+mem.getTeamName());
		System.out.println("------[∆¿ø¯ ∏Ì¥‹]------");
		team.init();
		team.Disp();
		
		System.out.println();
		
		mem.setmName("«„√ »∏");
		mem.setMphone("010-1234-5678");
		mem.setsName("¿±øµ»∆");
		
	
		System.out.println("5¡∂ ∆¿∏Ì : " + mem.getTeamName());
		System.out.println("∆¿¿Â : " + mem.getmName());
		System.out.println("∆¿¿Â ¿¸»≠π¯»£ : " + mem.getMphone());
		System.out.println("∫Œ∆¿¿Â : " + mem.getsName());
		
		
		

	}

}
