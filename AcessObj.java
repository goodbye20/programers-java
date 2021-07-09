package javaStudy;

public class AcessObj {
	public int p = 3;  //전체공개
	protected int p2 = 4; //접근을 제한하나 자식은 접근가능
	int k = 1; // (default 제한자)같은 패키지내에서만 공개
	private int p3 = 5; // 나 자신만 가능
	
}

//public > protected> default > private