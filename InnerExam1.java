package javaStudy;

public class InnerExam1 {
	class Cal{
			int value = 0;
			public void plus() {
				value++;
			}
			//�ʵ�ȿ��� Ŭ������ �� �����ؼ� ����ϴ°�� (�ν��Ͻ� Ŭ����)
	}
	public static void main(String[] args) {
		InnerExam1 t = new InnerExam1();
		InnerExam1.Cal cal = t.new Cal();
		//cal �̶�� ������ ��ü�� ����Ϸ��� 
		//�ܺ���Ŭ������.Ÿ�� ������ = �̷���
		cal.plus();
		System.out.println(cal.value);
	}
	
}
