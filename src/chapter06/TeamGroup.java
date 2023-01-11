package chapter06;

public class TeamGroup {
	
	//멤버변수 (배열 -> 팀구성원)
	private TeamMember[] member = new TeamMember[6];
	
	//기본 생성자
	
	//초기화 메소드
	public void init() {
		member[0] = new TeamMember("허초회" , "남");
		member[1] = new TeamMember("김찬희" , "남");
		member[2] = new TeamMember("윤영훈" , "남");
		member[3] = new TeamMember("이재민" , "남");
		member[4] = new TeamMember("전솔민" , "남");
		member[5] = new TeamMember("장여주" , "여");
	}
	
	//출력 메소드
	public void Disp() {
		System.out.println("[팀원 명단]");
		for(int i=0; i<member.length;i++) {
			System.out.println((i+1)+"번째 팀원 이름은 " + member[i].getName() + " 성별은 " + member[i].getGender() + "입니다.");
		}
	}

}
