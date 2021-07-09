package javaStudy;

public class Car {
	//타입 변수명(필드명)
	String name;
	int number;
	//car라는 객체의 이름과 번호를 필드로 선언한게되는것

	
	public Car(String name) {
		this.name = name;
		
		
	}

	public Car() {
	
//		this.name = "이름없음";
//		this.number = 0;
		this("이름없음",0);
	}
	
	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}
	public void run() {
		System.out.println("달리다");
	}
}
