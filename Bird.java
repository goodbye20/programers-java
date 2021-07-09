package javaStudy;

public abstract class Bird {
	public abstract void sing();
	public void fly() {
		System.out.println("날다");
	}
}

//매소드가 하나라도 추상메소드가 된다면 그 클래스는 추상 메소드가 될수밖에 없다.