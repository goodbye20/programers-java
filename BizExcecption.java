package javaStudy;

public class BizExcecption extends RuntimeException {
	//RuntimeException�� ��ӹ����� unchecked exception�� ��������
	public BizExcecption(String mag) {
		super(mag);
	}
	public BizExcecption(Exception ex) {
		super(ex);
	}
}
