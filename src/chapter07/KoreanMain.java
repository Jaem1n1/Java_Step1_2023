package chapter07;

public class KoreanMain {

	public static void main(String[] args) {
		
		Korean k1=new Korean("檜營團", "010-2047-5662");
		System.out.println("nation : "+k1.nation);
		System.out.println("name : "+k1.name);
		System.out.println("ssn : "+k1.ssn);
		System.out.println("-------------------------------------");
		
		Korean k2=new Korean("梯營團", "010-3047-5662");
		System.out.println("nation : "+k2.nation);
		System.out.println("name : "+k2.name);
		System.out.println("ssn : "+k2.ssn);

	}

}
