package javaStudy;

public class BizService {
	public void bizMethod(int i) throws BizExcecption{
		System.out.println("�����Ͻ� �޼ҵ� ����");
		
		if(i < 0)
			throw new BizExcecption("�Ű����� i�� 0�̻��̾�� �մϴ�.");
		
		System.out.println("�����Ͻ� �޼ҵ� ����");
	}

}
