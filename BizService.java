package javaStudy;

public class BizService {
	public void bizMethod(int i) throws BizExcecption{
		System.out.println("비지니스 메소드 시작");
		
		if(i < 0)
			throw new BizExcecption("매개변수 i는 0이상이어야 합니다.");
		
		System.out.println("비지니스 메소드 종료");
	}

}
