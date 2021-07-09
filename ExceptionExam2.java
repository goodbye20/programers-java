package javaStudy;

public class ExceptionExam2 {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		try {
		int k = divide(i, j);
		System.out.println(k);
		}catch(ArithmeticException e) {
			System.out.println(e.toString());
		}
	}

	public static int divide(int i, int j) throws ArithmeticException{
		int k = i/j;
		return k;
	}
//throws >>>로 예외가 발생하는곳이 아닌 메소드를 호출하는곳으로 떠넘겨 그쪽에서 해결하도록함
}
