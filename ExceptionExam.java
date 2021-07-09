package javaStudy;

public class ExceptionExam {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		try {
		int k = i/j;
		System.out.println(k);
	    }catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다."+e.toString());
		}finally {
			System.out.println("오류가 발생하였든 발생했든 무조건 실행!!");
		}
		System.out.println("main end!!");
		//예기치못한 사건(예외)가 발생되면 작동을 중단하고 강제종료되어 이후 작업도 실행되지않음.

	}

}
