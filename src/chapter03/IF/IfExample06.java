package chapter03.IF;

public class IfExample06 {

	public static void main(String[] args) {
		
		int num=(int)(Math.random()*6)+1;
		
		//1Á¡ ~ 6Á¡±îÁö ¹ÞÀ» ¼ö ÀÖÀ½ °¢ Á¡¼ö´ç ºÐ½Ä ½î±â
		if(num==1) {
			System.out.println("1Á¡ -> ¾î¹¬");
		} else if(num==2) {
			System.out.println("2Á¡ -> Æ¢±è");
		} else if(num==3) {
			System.out.println("3Á¡ -> ¼ø´ë");
		} else if(num==4) {
			System.out.println("4Á¡ -> ¶±ººÀÌ");
		} else if(num==5) {
			System.out.println("5Á¡ -> ¶ó¸é");
		} else {
			System.out.println("6Á¡ -> ±è¹ä");
		}

	}

}
