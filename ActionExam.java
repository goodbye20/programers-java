package javaStudy;

public class ActionExam {
	
	public static void main(String[] args) {
//		Action action = new MyAction();
//		//Action�� �߻�Ŭ�����⿡ ��ü�� �����̾ȵǱ⋚���� �ڽ��� MyAction���� ����
//		action.exec();
		
		Action action = new Action() {
		//������ �� �߰�ȣ( { )	�� �ش� �������̸��� ��ӹ��� �̸����� ��ü�� ����
			@Override
			public void exec() {
				System.out.println("exec");
				
			}
		 
		};	
		action.exec();
	}
	
	

}
