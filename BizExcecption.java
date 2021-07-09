package javaStudy;

public class BizExcecption extends RuntimeException {
	//RuntimeException을 상속받으면 unchecked exception을 생성가능
	public BizExcecption(String mag) {
		super(mag);
	}
	public BizExcecption(Exception ex) {
		super(ex);
	}
}
