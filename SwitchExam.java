package javaStudy;

public class SwitchExam {
	
	public static void main(String[] args) {
		//swich, case, default, break
		
		int value = 2;
		
		switch(value) {
		case 1:
		          	System.out.println("1");
		          	break;
		case 2:
					System.out.println("2");
					break;
		case 3:
					System.out.println("3");
					break;
					default :
						System.out.println("�׿� �ٸ� ����");
				
		}
		String str = "D";
				switch(str) {
				case "A" , "C":
					System.out.println("A");
					break;
				case "B" , "D":
				System.out.println("B");
				break;
				}
				
				
	}

}
