package javaStudy;

public class ExceptionExam {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		try {
		int k = i/j;
		System.out.println(k);
	    }catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�."+e.toString());
		}finally {
			System.out.println("������ �߻��Ͽ��� �߻��ߵ� ������ ����!!");
		}
		System.out.println("main end!!");
		//����ġ���� ���(����)�� �߻��Ǹ� �۵��� �ߴ��ϰ� ��������Ǿ� ���� �۾��� �����������.

	}

}
