package javaStudy;

public interface Calculator {
	public int plus(int i, int j);
	public int multiple(int i, int j);
	
	default int exec(int i, int j) {
		return i + j;
	}
	public static int exec2(int i, int j) {
		return i * j;
	}

}

//인터페이스는 원래 추상 메소드만 가능했으나 java8부터 default,static으로 추가 가능

// 그중 static메소드는 인터페이스이름. <<< 이렇게만 호출가능