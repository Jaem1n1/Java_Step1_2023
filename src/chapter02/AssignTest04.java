package chapter02;

public class AssignTest04 {

	public static void main(String[] args) {
		// ��������
		System.out.println("===��������===");
		int gameScore=150;
		//int lastScore1=gameScore+1;
		int lastScore1=++gameScore; // ���� �� ����
		System.out.println(lastScore1); //151
		System.out.println("===============");
		int lastScore2=--gameScore;
		System.out.println(lastScore2); //150
		
		// ��������
		System.out.println("===��������===");
		int lastScore3=gameScore++; // �а� �� �� ���ϱ�
		System.out.println(lastScore3); //150
		System.out.println(gameScore); //151
		System.out.println("===============");
		
		int lastScore4=gameScore--; // �а� �� �� ���ϱ�
		System.out.println(lastScore4); //151
		System.out.println(gameScore); //150
		System.out.println("===============");

	}

}
