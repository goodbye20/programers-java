package javaStudy;

public class FofWhileExam {

	public static void main(String[] args) {
		int total = 0;
		for(int i = 1; i <= 100; i++) {
			//�ʱ� �ʱ�ȭ�� �ѹ��� ���� ���ǿ� �´��� �� �ڽ����� ���� ���� ����
			if(i % 2 != 0) {
				continue; //���Ǻΰ� continue�� ������ �ؿ��κ��� �ߵ�x �ٽ�����
			}             //���Ǻΰ� break�� ������ �׳� �۵��� ���߰� ����� ����
			total = total + i;
			
		}
		System.out.println(total);
	}
}
