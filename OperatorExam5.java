package javaStudy;

public class OperatorExam5 {

	public static void main(String[] args) {
		int b1 = (5 < 4) ? 50 : 40;
//	삼항연산자:	()조건이 true면 첫번쨰값을 false면 두번쨰값을
		
		System.out.println(b1);
		
		int b2 = 0;
		if(5<4) {
			b2 = 50;
		}else {
			b2 = 40;
			
			System.out.println(b2);
		}
	}
}
